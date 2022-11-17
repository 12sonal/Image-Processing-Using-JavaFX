package Exercise2;

public class Main {
    //Implementing Abstraction and overriding & Polymorphism

    public static  void main(String [] args)
    {
        double width =10;
        double height = 8 ;
        double Radius =5;


        Shape shape1 = new Triangle(height, width);
        System.out.println("Area of Triangle is: "  +shape1.calculateArea());
        System.out.println("Perimeter of Triangle is: "  +shape1.calculatePerimeter());


        Shape shape2 = new Rectangle(height, width);
        System.out.println("Area of Rectangle is : "  +shape2.calculateArea());
        System.out.println("Perimeter of Rectangle is: : "  +shape2.calculatePerimeter());

        Shape shape3 = new Circle(Radius);
        System.out.println("Area of Circle is : "  +shape3.calculateArea());
        System.out.println("Perimeter of Circle is: : "  +shape3.calculatePerimeter());

        Shape shape4 = new Square(height,width);
        System.out.println("Area of Square is : "  +shape4.calculateArea());
        System.out.println("Perimeter of Square is:  "  +shape4.calculatePerimeter());
    }
}
