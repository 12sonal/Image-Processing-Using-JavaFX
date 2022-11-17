package Exercise2;
public class Square extends Shape {

    public Square(double height, double width)
    {
        super(height, width);
    }

    public double calculateArea()
    {
        return (getHeight() * getHeight());      //(Assuming side of the square is 8 which is a height)
    }

    public double calculatePerimeter()
    {
        return (4* (getHeight()));
    }

}
