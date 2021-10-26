package com.chivapchichi.mymath;

public class MyComplex {
    private double real = 0.;
    private double imag = 0.;

    private static final double eps = .000001;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + (imag >= 0.? '+' : "") + imag + "i)";
    }

    public boolean isReal() {
        return Math.abs(imag) < eps;
    }

    public boolean isImaginary() {
        return Math.abs(real) < eps;
    }

    public boolean equals(double real, double imag) {
        return Math.abs(this.real - real) < eps &&
                Math.abs(this.imag - imag) < eps;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyComplex)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        MyComplex another = (MyComplex) obj;
        return Math.abs(real - another.real) < eps &&
                Math.abs(imag - another.imag) < eps;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan(imag / real);
    }

    public MyComplex add(MyComplex right) {
        real += right.real;
        imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex res = new MyComplex(this.real, this.imag);
        return res.add(right);
    }

    public MyComplex subtract(MyComplex right) {
        real -= right.real;
        imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex res = new MyComplex(this.real, this.imag);
        return res.subtract(right);
    }

    public MyComplex multiply(MyComplex right) {
        double real = this.real, imag = this.imag;
        this.real = real * right.real - imag * right.imag;
        this.imag = imag * right.real + real * right.imag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double real = this.real, imag = this.imag;
        double denominator = Math.pow(right.real, 2) + Math.pow(right.imag, 2);
        this.real = (real * right.real + imag * right.imag) / denominator;
        this.imag = (imag * right.real - real * right.imag) / denominator;
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }
}
