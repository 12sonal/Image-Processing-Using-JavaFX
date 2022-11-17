package Exercise3b;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Main {

    public static void main(String[] args) {
        double height = 15;
        double width = 6;
        double radius = 7;


        //Serialization
        try {

            Shape shape1 = new Triangle(height, width);
            System.out.println("Triangle Area:" + shape1.calculateArea());

            //Creating stream and writing logic for object
            FileOutputStream fout = new FileOutputStream("triangle.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(shape1);
            out.flush();
            out.close();      //Closing stream
            System.out.println("Serialized data is stored in triangle.txt");
        } catch (Exception e) {
            System.out.println(e);
        }


        try {

            Shape shape2 = new Rectangle(height, width);
            System.out.println("Rectangle Area:" + shape2.calculateArea());

            //Creating stream and writing logic for object
            FileOutputStream fout = new FileOutputStream("rectangle.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(shape2);
            out.flush();
            out.close();      //Closing stream
            System.out.println("Serialized data is stored in rectangle.txt");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {

            Shape shape3 = new Square(height, width);
            System.out.println("Square Area:" + shape3.calculateArea());

            //Creating stream and writing logic for object
            FileOutputStream fout = new FileOutputStream("square.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(shape3);
            out.flush();
            out.close();      //Closing stream
            System.out.println("Serialized data is stored in square.txt");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Shape shape4 = new Circle(radius);
            System.out.println("Circle Area:" + shape4.calculateArea());

            //Creating stream and writing logic for object
            FileOutputStream fout = new FileOutputStream("circle.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(shape4);
            out.flush();
            out.close();      //Closing stream
            System.out.println("Serialized data is stored in circle.txt");
        } catch (Exception e) {
            System.out.println(e);
        }


        //Concept of Deserilization

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("triangle.txt"));
            Shape shape1 = (Triangle) in.readObject();
            System.out.println("Deserializing data:");
            System.out.print(shape1.calculateArea());
            in.close();

        } catch (Exception e)
        {
            System.out.println(e);
        }

        try
        {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("rectangle.txt"));
            Shape shape2 = (Rectangle) in.readObject();
            System.out.print(shape2.calculateArea());
            in.close();
        } catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("square.txt"));
            Shape shape3 = (Square) in.readObject();
            System.out.print(shape3.calculateArea());
            in.close();
        } catch (Exception e)
        {
            System.out.println(e);
        }
        try
        {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("circle.txt"));
            Shape shape4 = (Circle) in.readObject();
            System.out.print(shape4.calculateArea());
            in.close();
        } catch (Exception e)
        {
            System.out.println(e);
        }


    }
}

