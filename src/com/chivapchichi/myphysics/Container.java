package com.chivapchichi.myphysics;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public boolean collides(Ball ball) {
        float x = ball.getX(), y = ball.getY();
        int radius = ball.getRadius();
        boolean left = x1 <= (x - radius);
        boolean right = x2 >= (x + radius);
        boolean top = y1 <= (y - radius);
        boolean bottom = y2 >= (y + radius);
        return left && top && right && bottom;
    }

    @Override
    public String toString() {
        return "Container[" +
                '(' + x1 +
                ',' + y1 +
                "),(" + x2 +
                ',' + y2 +
                ")]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Container c = (Container) obj;
        return x1 == c.x1 &&
                y1 == c.y1 &&
                x2 == c.x2 &&
                y2 == c.y2;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * x1;
        result += 31 * y1;
        result += 31 * x2;
        result += 31 * y2;
        return result;
    }
}
