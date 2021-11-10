package com.chivapchichi.figures;

public class Rectangle {
    private float length = 1.f;
    private float width = 1.f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + ']';
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2. * (length + width);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rec = (Rectangle) obj;
        return length == rec.length && width == rec.width;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * Float.floatToIntBits(length);
        result += 31 * Float.floatToIntBits(width);
        return result;
    }
}
