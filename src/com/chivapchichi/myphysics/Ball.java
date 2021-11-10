package com.chivapchichi.myphysics;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    private static final float eps = .000001f;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = speed * (float) Math.cos((double) direction / 180. * Math.PI);
        yDelta = -speed * (float) Math.sin((double) direction / 180. * Math.PI);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[" +
                '(' + x +
                ',' + y +
                "), radius = " + radius +
                ", speed=(" + xDelta +
                ',' + yDelta +
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
        Ball ball = (Ball) obj;
        return Math.abs(x - ball.x) < eps &&
                Math.abs(y - ball.y) < eps &&
                radius == ball.radius &&
                Math.abs(xDelta - ball.xDelta) < eps &&
                Math.abs(yDelta - ball.yDelta) < eps;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * Float.floatToIntBits(x);
        result += 31 * Float.floatToIntBits(y);
        result += 31 * radius;
        result += 31 * Float.floatToIntBits(xDelta);
        result += 31 * Float.floatToIntBits(yDelta);
        return result;
    }
}
