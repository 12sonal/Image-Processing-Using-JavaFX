package Exercise3b;

public class Rectangle extends Shape {

    public Rectangle(double height, double width)
    {
        super(height,width);
    }

    public double calculateArea()
    {
        return 2* (getHeight() * getWidth());
    }

    public double calculatePerimeter()
    {
        return 2* (getHeight() + getWidth());
    }

}
