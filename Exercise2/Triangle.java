package Exercise2;

public class Triangle extends Shape {

    public Triangle(double height, double width)
    {
        super(height,width);
    }

    public double calculateArea()
    {
        return (getHeight() * getWidth())/2;
    }

    public double calculatePerimeter()
    {
        return (getHeight() + getWidth());
    }

}
