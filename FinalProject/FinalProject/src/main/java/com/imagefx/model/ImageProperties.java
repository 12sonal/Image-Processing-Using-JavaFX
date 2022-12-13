package com.imagefx.model;

/**
 * ImageProperties class
 */
public class ImageProperties {
    /**
     * instance variables
     */
    private double width;
    private double height;
    private double size;
    private String location;

    /**
     * Constructor
     */
    public ImageProperties(double width, double height, double size, String location) {
        this.width = width;
        this.height = height;
        this.size = size;
        this.location = location;
    }

    /**
     * Getter and setter variables of instance variable
     */
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
