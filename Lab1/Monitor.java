package com.company.Lab1;

public class Monitor {
    private String color;
    private String dimensions;
    private String resolution;

    public Monitor(String color, String dimensions, String resolution) {
        this.color = color;
        this.dimensions = dimensions;
        this.resolution = resolution;
    }

    public String getColor() {
        return color;
    }

    public String getDimensions() {
        return dimensions;
    }

    public String getResolution() {
        return resolution;
    }
}
