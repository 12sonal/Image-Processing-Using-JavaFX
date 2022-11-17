package Exercise4;

import java.util.regex.Pattern;
public class RegularExpression {

        public static void main(String[] args)
        {
            //Digit case
            System.out.println(Pattern.matches("\\d+","43"));
            System.out.println(Pattern.matches("\\d+","abcd"));

            //Email format case
            System.out.println(Pattern.matches("^(.+)@(.+)$","regex@gmail.com"));
            System.out.println(Pattern.matches("^(.+)@(.+)$","regex@"));

            //Character & Digits case
            System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","regex7"));
            System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","regex@#"));

            //2nd character should be s and length should be 2
            System.out.println(Pattern.matches(".s","Cs"));
            System.out.println(Pattern.matches(".s","Co"));

            //2nd character should be s and after 2nd character it should be letter s
            System.out.println(Pattern.matches(".s+","Csss"));
            System.out.println(Pattern.matches(".s+","Cossp"));
        }
    }


