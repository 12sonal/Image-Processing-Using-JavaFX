package Exercise3b;

import java.io.Serializable;

public abstract class Shape implements Serializable {
    private double height;
    private double width;
    public double Radius;

    public Shape(double Radius)
    {
        this.Radius= Radius;
    }

    public double getRadius()
    {
        return Radius;
    }
    public void setRadius(double Radius)
    {
        this.Radius = Radius;
    }

    public Shape(double height, double width)
    {
        this.height = height;
        this.width = width;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public abstract double calculateArea();

}


