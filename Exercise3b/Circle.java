package Exercise3b;

public class Circle extends Shape {
    public static  String color = "black";

    public Circle(double Radius)
    {

        super(Radius);
        this.Radius = Radius;
    }

    public double calculateArea()
    {
        return Math.PI*this.Radius *this.Radius;
    }

    public double calculatePerimeter()
    {
        return Math.PI*2*this.Radius;
    }
}
