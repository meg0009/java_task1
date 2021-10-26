package com.chivapchichi.mymath;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder resBuilder = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            switch (i) {
                case 0:
                    resBuilder.append(isPositive(coeffs[i])).append(coeffs[i]);
                    break;
                case 1:
                    resBuilder.append(isPositive(coeffs[i])).append(coeffs[i]).append("x");
                    break;
                default:
                    resBuilder.append(isPositive(coeffs[i])).append(coeffs[i]).append("x^").append(i);
                    break;
            }
        }
        if (resBuilder.charAt(0) == '+') {
            resBuilder.deleteCharAt(0);
        };
        return resBuilder.toString();
    }

    private String isPositive(double n){
        return n >= 0.? "+" : "";
    }

    public double evaluate(double x) {
        double res = 0.;
        for (int i = 0; i < coeffs.length; i++){
            res += coeffs[i] * Math.pow(x, i);
        }
        return res;
    }

    public MyPolynomial add(MyPolynomial right) {
        MyPolynomial res = new MyPolynomial();
        if (coeffs.length >= right.coeffs.length) {
            res.coeffs = coeffs.clone();
            for (int i = 0; i < right.coeffs.length; i++) {
                res.coeffs[i] += right.coeffs[i];
            }
        } else {
            res.coeffs = right.coeffs.clone();
            for (int i = 0; i < coeffs.length; i++) {
                res.coeffs[i] += coeffs[i];
            }
        }
        return res;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        MyPolynomial res = new MyPolynomial(new double[coeffs.length + right.coeffs.length - 1]);
        for (int i = 0; i < coeffs.length; i++){
            for (int j = 0; j < right.coeffs.length; j++){
                res.coeffs[i + j] += coeffs[i] * right.coeffs[j];
            }
        }
        return res;
    }
}
