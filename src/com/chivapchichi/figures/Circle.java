package com.chivapchichi.figures;

public class Circle {
    private double radius = 1.;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + ']';
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle circle = (Circle) obj;
        return radius == circle.radius && color.equals(circle.color);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * radius;
        result += 31 * color.hashCode();
        return result;
    }
}
