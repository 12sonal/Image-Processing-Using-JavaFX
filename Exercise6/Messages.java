package Exercise6;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;

public class Messages {
    public static final int AES_KEY_SIZE = 256;
    public static final int GCM_IV_LENGTH = 12;
    public static final int GCM_TAG_LENGTH = 16;

    public static void main(String[] args) throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(1024);
        KeyPair pair = generator.generateKeyPair();
        PrivateKey privateKey = pair.getPrivate();
        PublicKey publicKey = pair.getPublic();

        Person alice = new Person("Alice", "D.", "alice@gmail.com");
        Person bob = new Person("Bob", "S.", "bob@gmail.com");

        // message from bob to alice
        String message = "hi";
        String encryptedMessage = "";
        String decryptedMessage = "";
        alice.setMessages(message);

        //Symmetric encryption and decryption
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(AES_KEY_SIZE);
        SecretKey key = keyGenerator.generateKey();
        byte[] IV = new byte[GCM_IV_LENGTH];
        SecureRandom random = new SecureRandom();
        random.nextBytes(IV);

        System.out.println("Symmetric message from Bob to Alice: " + message);

        byte[] cipherText = symmetricEncrypt(message.getBytes(), key, IV);
        System.out.println("Encrypted Text : " + encode(cipherText));

        decryptedMessage = symmetricDecrypt(cipherText, key, IV);
        System.out.println("Decrypted Text : " + decryptedMessage);

        // asymmetric
        System.out.println("Asymmetric message from Bob to Alice: " + message);
        encryptedMessage = asymmetricEncrypt(message, publicKey);
        System.out.println("Encrypted Text : " + encryptedMessage);
        decryptedMessage = asymmetricDecrypt(encryptedMessage, privateKey);
        System.out.println("Decrypted Text : " + decryptedMessage);

        // message from alice to bob
        message = "hey";
        bob.setMessages(message);
        keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(AES_KEY_SIZE);
        key = keyGenerator.generateKey();
        IV = new byte[GCM_IV_LENGTH];
        random = new SecureRandom();
        random.nextBytes(IV);

        System.out.println("\nSymmetric message from Alice to Bob : " + message);

        cipherText = symmetricEncrypt(message.getBytes(), key, IV);
        System.out.println("Encrypted Text : " + encode(cipherText));

        decryptedMessage = symmetricDecrypt(cipherText, key, IV);
        System.out.println("DeCrypted Text : " + decryptedMessage);

        // Asymmetric encryption and decryption
        System.out.println("Asymmetric message from Alice to Bob: " + message);
        encryptedMessage = asymmetricEncrypt(message, publicKey);
        System.out.println("Encrypted Text : " + encryptedMessage);
        decryptedMessage = asymmetricDecrypt(encryptedMessage, privateKey);
        System.out.println("Decrypted Text : " + decryptedMessage);

        // verify by using Signature
        Signature privateSignature = Signature.getInstance("SHA256withRSA");
        privateSignature.initSign(pair.getPrivate());
        privateSignature.update(message.getBytes(StandardCharsets.UTF_8));
        byte[] signature = privateSignature.sign();

        //Let's check the signature
        Signature publicSignature = Signature.getInstance("SHA256withRSA");
        publicSignature.initVerify(pair.getPublic());
        publicSignature.update(message.getBytes(StandardCharsets.UTF_8));
        boolean isCorrect = publicSignature.verify(signature);

        System.out.println("\nSignature is correct: " + isCorrect);
    }

    public static byte[] symmetricEncrypt(byte[] plaintext, SecretKey key, byte[] IV) throws Exception
    {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        SecretKeySpec keySpec = new SecretKeySpec(key.getEncoded(), "AES");
        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, IV);

        cipher.init(Cipher.ENCRYPT_MODE, keySpec, gcmParameterSpec);

        byte[] cipherText = cipher.doFinal(plaintext);

        return cipherText;
    }

    public static String symmetricDecrypt(byte[] cipherText, SecretKey key, byte[] IV) throws Exception
    {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        SecretKeySpec keySpec = new SecretKeySpec(key.getEncoded(), "AES");
        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, IV);

        cipher.init(Cipher.DECRYPT_MODE, keySpec, gcmParameterSpec);

        byte[] decryptedText = cipher.doFinal(cipherText);

        return new String(decryptedText);
    }

    public static String asymmetricEncrypt(String message, PublicKey publicKey) throws Exception{
        byte[] messageToBytes = message.getBytes();
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE,publicKey);
        byte[] encryptedBytes = cipher.doFinal(messageToBytes);
        return encode(encryptedBytes);
    }

    public static String asymmetricDecrypt(String encryptedMessage, PrivateKey privateKey) throws Exception{
        byte[] encryptedBytes = decode(encryptedMessage);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.DECRYPT_MODE,privateKey);
        byte[] decryptedMessage = cipher.doFinal(encryptedBytes);
        return new String(decryptedMessage,"UTF8");
    }

    private static String encode(byte[] data){
        return Base64.getEncoder().encodeToString(data);
    }

    private static byte[] decode(String data){
        return Base64.getDecoder().decode(data);
    }


}
