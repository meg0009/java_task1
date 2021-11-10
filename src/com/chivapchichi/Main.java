package com.chivapchichi;

import com.chivapchichi.database.Author;
import com.chivapchichi.database.Book;
import com.chivapchichi.database.Employee;
import com.chivapchichi.figures.Circle;
import com.chivapchichi.figures.MyPoint;
import com.chivapchichi.figures.MyTriangle;
import com.chivapchichi.figures.Rectangle;
import com.chivapchichi.mymath.MyComplex;
import com.chivapchichi.mymath.MyPolynomial;
import com.chivapchichi.myphysics.Ball;
import com.chivapchichi.myphysics.Container;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("1 часть заданий");
        System.out.println("#1 Circle class");
        Circle c1 = new Circle();
        Circle c2 = new Circle(15.);
        Circle c3 = new Circle(20., "green");
        System.out.println("Проверка конструкторов и методов getRadius и getColor");
        System.out.println("Конструктор без параметров: c1{" +
                "radius = " + c1.getRadius() +
                ", color = " + c1.getColor() +
                "}");
        System.out.println("Конструктор с параметром radius: c2{" +
                "radius = " + c2.getRadius() +
                ", color = " + c2.getColor() +
                "}");
        System.out.println("Конструктор с параметрами radius и color: c3{" +
                "radius = " + c3.getRadius() +
                ", color = " + c3.getColor() +
                "}");

        c1.setRadius(25.);
        c1.setColor("white");
        System.out.println("Проверка методов setRadius " +
                "и setColor и toString: с1 = " +
                c1);
        System.out.println("Расчёт площади: c1.area = " + c1.calculateArea());

        System.out.println("проверка equals и hashCode");
        Circle c4 = new Circle(20., "green");
        System.out.println("должно быть true: " + c3.equals(c4));
        Circle c5 = c3;
        System.out.println("должно быть true: " + c3.equals(c5));
        System.out.println("должно быть false: " + c3.equals(c1));
        System.out.println("должно быть false: " + c3.equals("1234"));
        System.out.println("hashCode c1 = " + c1.hashCode() +
                ", c3 = " + c3.hashCode() + ", c4 = " + c4.hashCode());

        System.out.println("==========================");
        System.out.println("#2 Rectangle class");


        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5.f, 5.f);
        System.out.println("Проверка кострукторов и методов getLength и " +
                "getWidth");
        System.out.println("Конструктор без параметров: r1{" +
                "length = " + r1.getLength() +
                ", width" + r1.getWidth() +
                "}");
        System.out.println("Конструктор c параметрами длины и ширины: r2{" +
                "length = " + r2.getLength() +
                ", width" + r2.getWidth() +
                "}");
        r1.setLength(15.f);
        r1.setWidth(20.f);
        System.out.println("Проверка сетеров и метода toString");
        System.out.println("r1 = " + r1);
        System.out.println("Площадь r1 = " + r1.calculateArea());
        System.out.println("Периметр r1 = " + r1.calculatePerimeter());

        System.out.println("проверка equals и hashCode");
        Rectangle r3 = new Rectangle(5.f, 5.f);
        System.out.println("должно быть true: " + r2.equals(r3));
        Rectangle r4 = r2;
        System.out.println("должно быть true: " + r2.equals(r4));
        System.out.println("должно быть false: " + r2.equals(r1));
        System.out.println("должно быть false: " + r2.equals("1234"));
        System.out.println("hashCode r1 = " + r1.hashCode() +
                ", r2 = " + r2.hashCode() + ", r3 = " + r3.hashCode());


        System.out.println("==========================");
        System.out.println("#3 Employee class");


        Employee e1 = new Employee(1, "Mike", "Wazowski", 1000);
        Employee e2 = new Employee(2, "Luffy", "Monkey D.", 1500);
        System.out.println("Проверка конструктора и геттеров приватных полей: e1{" +
                "id = " + e1.getId() +
                ", firstName = " + e1.getFirstName() +
                ", lastName = " + e1.getLastName() +
                ", salary = " + e1.getSalary() +
                "}");
        System.out.println("Проверка метода toString: e2 = " + e2);
        System.out.println("e1.getName = " + e1.getName());
        e1.setSalary(2000);
        System.out.println("Результат после setSalary: e1.getSalary = " +
                e1.getSalary());
        System.out.println("e2.getAnnualSalary = " + e2.getAnnualSalary());
        e1.raiseSalary(50);
        System.out.println("Результат после e1.raiseSalary(50) = " +
                e1.getSalary());

        System.out.println("проверка equals и hashCode");
        Employee e3 = new Employee(2, "Luffy", "Monkey D.", 1500);
        System.out.println("должен быть true: " + e2.equals(e3));
        Employee e4 = e2;
        System.out.println("должен быть true: " + e2.equals(e4));
        System.out.println("должен быть false: " + e2.equals(e1));
        System.out.println("должен быть false: " + e2.equals(c1));
        System.out.println("hashCode e1 = " + e1.hashCode() + ", e2 = " + e2.hashCode() +
                ", e3 = " + e3.hashCode());

        System.out.println("==========================");
        System.out.println("#4 Book class");


        Book b1 = new Book("1984", new Author[]{new Author("George Orwell",
                "-", 'm')}, 800);
        Book b2 = new Book("Faust", new Author[]{new Author("Johann Wolfgang von Goethe",
                "-", 'm')}, 1500, 100);
        System.out.println("Поверка конструкторов и " +
                "геттеров приватных полей: b1{" +
                "name = " + b1.getName() +
                ", authors = " + Arrays.toString(b1.getAuthors()) +
                ", price = " + b1.getPrice() +
                ", qty = " + b1.getQty() +
                "}");
        System.out.println("Поверка конструкторов и " +
                "геттеров приватных полей: b2{" +
                "name = " + b2.getName() +
                ", authors = " + Arrays.toString(b2.getAuthors()) +
                ", price = " + b2.getPrice() +
                ", qty = " + b2.getQty() +
                "}");
        b1.setPrice(1000.);
        b1.setQty(200);
        System.out.println("Проверка сеттеров и метода toString: b1 = " + b1);
        System.out.println("Проверка getAuthorNames: " +
                "b1 = " + b1.getAuthorNames() + "\n" +
                "b2 = " + b2.getAuthorNames());
        Book b3 = new Book("Faust", new Author[]{new Author("Johann Wolfgang von Goethe",
                "-", 'm'), new Author("Mike Wazowski", "-", 'f')}, 1500, 100);
        System.out.println("когда несколько авторов b3 = " + b3.getAuthorNames());

        System.out.println("проверка equals и hashCode");
        Book b4 = new Book("Faust", new Author[]{new Author("Johann Wolfgang von Goethe",
                "-", 'm'), new Author("Mike Wazowski", "-", 'f')}, 1500, 100);
        System.out.println("должен быть true: " + b3.equals(b4));
        Book b5 = b3;
        System.out.println("должен быть true: " + b3.equals(b5));
        System.out.println("должен быть false: " + b3.equals(b1));
        System.out.println("должен быть false: " + b3.equals(c1));
        System.out.println("hashCode b3 = " + b3.hashCode() + ", b4 = " + b4.hashCode() +
                ", b1 = " + b1.hashCode());

        System.out.println("==========================");
        System.out.println("#5 MyPoint class");

        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10., 20.);
        System.out.println("Проверка конструктора без аргументов и геттеров: p1{" +
                "x = " + p1.getX() +
                ", y = " + p1.getY() +
                "}\n" +
                "p1.getXY() = " + Arrays.toString(p1.getXY()));
        System.out.println("Проверка коструктора с аргументами: p2{" +
                "x = " + p2.getX() +
                ", y = " + p2.getY() +
                "}");
        p1.setX(11.);
        p1.setY(12.);
        System.out.println("Проверка сетеров setX и setY и toString: p1 = " + p1);
        p1.setXY(15., 16.);
        System.out.println("Проверка метода setXY: p1 = " + p1);
        System.out.println("дистанция от p1 = " + p1 +
                " до точки (8, 8) = " + p1.distance(8., 8.));
        System.out.println("дистанция от p1 = " + p1 +
                " до p2 = " + p2 + " равна " + p1.distance(p2));
        System.out.println("дистанция от p1 = " + p1 +
                " до точки (0, 0) = " + p1.distance());

        System.out.println("проверка equals и hashCode");
        MyPoint p3 = new MyPoint(10., 20.);
        System.out.println("должно быть true: " + p2.equals(p3));
        MyPoint p4 = p2;
        System.out.println("должно быть true: " + p2.equals(p4));
        System.out.println("должно быть false: " + p2.equals(p1));
        System.out.println("должно быть false: " + p2.equals("1234"));
        System.out.println("hashCode p1 = " + p1.hashCode() +
                ", p2 = " + p2.hashCode() + ", p3 = " + p3.hashCode());


        System.out.println("==========================");
        System.out.println("#6 MyTriangle class");


        MyTriangle t1 = new MyTriangle(1., 5., 5., 3., 6., 7.);
        MyTriangle t2 = new MyTriangle(new MyPoint(2., 1.), new MyPoint(4., 5.), new MyPoint(7., 3.));
        System.out.println("Проверка конструкторов и метода toString: t1 = " +
                t1 + "\n t2 = " + t2);
        System.out.println("Результат вычесления периметра t1 = " +
                t1.calculatePerimeter() +
                "\n периметр t2 = " + t2.calculatePerimeter());
        System.out.println("Тип t1 - " + t1.getType());
        MyTriangle isosceles = new MyTriangle(2., 3., 4., 9., 6., 3.);
        System.out.println("Тип треугольника isosceles - " + isosceles.getType());
        MyTriangle equilateral = new MyTriangle(2., 1., 10., 1., 6., 7.92820323);
        System.out.println("Тип треугольника equilateral - " + equilateral.getType());

        System.out.println("проверка equals и hashCode");
        MyTriangle t3 = new MyTriangle(new MyPoint(2., 1.), new MyPoint(4., 5.), new MyPoint(7., 3.));
        System.out.println("должно быть true: " + t2.equals(t3));
        MyTriangle t4 = t2;
        System.out.println("должно быть true: " + t2.equals(t4));
        System.out.println("должно быть false: " + t2.equals(t1));
        System.out.println("должно быть false: " + t2.equals("1234"));
        System.out.println("hashCode t1 = " + t1.hashCode() +
                ", t2 = " + t2.hashCode() + ", t3 = " + t3.hashCode());


        System.out.println("==========================");

        System.out.println("2 часть заданий");
        System.out.println("#1 MyComplex class");


        MyComplex num1 = new MyComplex();
        MyComplex num2 = new MyComplex(2, 4);
        System.out.println("Проверка конструкторов и геттеров:" +
                "\nпо умолчанию: num1{" +
                "real = " + num1.getReal() +
                ", imag = " + num1.getImag() +
                "}" +
                "\nс параметрами: num2{" +
                "real = " + num2.getReal() +
                ", imag = " + num2.getImag() +
                "}");
        num1.setReal(10);
        num1.setImag(47);
        num2.setValue(7, 9);
        System.out.println("проверка сеттеров и toString:" +
                "\nnum1 = " + num1 +
                "\nnum2 = " + num2);
        MyComplex real = new MyComplex(6, 0);
        MyComplex imag = new MyComplex(0, 3);
        System.out.println("проверка методов isReal и isImaginary" +
                "\nreal:" + real.isReal() + ' ' + real.isImaginary() +
                "\nimag:" + imag.isReal() + ' ' + imag.isImaginary());
        System.out.println("проверка метода equals с двумя параметрами:" +
                "\nдолжно быть true: " + num1.equals(10, 47) +
                "\nдолжно быть 3 false: " + num1.equals(9, 47) +
                ' ' + num1.equals(10, 2) +
                ' ' + num1.equals(0, 0));
        MyComplex numEquel = new MyComplex(10, 47);
        MyComplex numCopyRef = num1;
        MyComplex num3 = new MyComplex(10, 3);
        MyComplex num4 = new MyComplex(4, 47);
        System.out.println("проверка переопределённого equals:" +
                "\nдолжно быть 2 true: " + num1.equals(numEquel) +
                ' ' + num1.equals(numCopyRef) +
                "\nдолжно быть 3 false: " + num1.equals(num2) +
                ' ' + num1.equals(num3) +
                ' ' + num1.equals(num4));
        System.out.println("модуль числа num3 = " +
                num3 + " равен " + num3.magnitude());
        System.out.println("модуль числа num4 = " +
                num4 + " равен " + num4.magnitude());
        System.out.println("аргумент num3 = " +
                num3 + " равен " + num3.argument());
        System.out.println("аргумент num4 = " +
                num4 + " равен " + num4.argument());
        System.out.println("num1 = " + num1.toString() + " num2 = " + num2 +
                "после num1.add(num2), num1 = " + num1.add(num2));
        MyComplex num5 = num3.addNew(num4);
        System.out.println("num3 = " + num3 + " num4 = " + num4 +
                "после num5 = num3.addNew(num4), num5 = " + num5);
        System.out.println("num1 = " + num1.toString() + " num3 = " + num3 +
                "после num1.subtract(num3), num1 = " + num1.subtract(num3));
        num5 = num2.subtractNew(num4);
        System.out.println("num2 = " + num2 + " num4 = " + num4 +
                "после num5 = num2.subtractNew(num4), num5 = " + num5);
        System.out.println("num1 = " + num1.toString() + " num2 = " + num2 +
                "после num1.multiply(num2), num1 = " + num1.multiply(num2));
        System.out.println("num3 = " + num3.toString() + " num4 = " + num4 +
                "после num3.divide(num4), num3 = " + num3.divide(num4));
        System.out.println("num1 = " + num1 +
                " num1.conjugate() = " + num1.conjugate());

        System.out.println("проверка equals и hashCode");
        MyComplex num6 = new MyComplex(7, 9);
        System.out.println("должно быть true: " + num2.equals(num6));
        MyComplex num7 = num2;
        System.out.println("должно быть true: " + num2.equals(num7));
        System.out.println("должно быть false: " + num2.equals(num1));
        System.out.println("должно быть false: " + num2.equals("1234"));
        System.out.println("hashCode num1 = " + num1.hashCode() +
                ", num2 = " + num2.hashCode() + ", num6 = " + num6.hashCode());


        System.out.println("==========================");
        System.out.println("#2 MyPolynomial class");


        MyPolynomial poly1 = new MyPolynomial(1., 2., -7., .5);
        System.out.println("проверка конструктора, методов getDegree" +
                "и toString: poly1.getDegree() = " + poly1.getDegree() +
                " poly1 = " + poly1);
        System.out.println("poly1.evaluate(4.) = " + poly1.evaluate(4.));
        MyPolynomial poly2 = new MyPolynomial(0., -2., 1, 7., -12.);
        System.out.println("poly1 = " + poly1 +
                " poly2 = " + poly2 +
                " poly1.add(poly2) = " + poly1.add(poly2));
        System.out.println("poly1 = " + poly1 +
                " poly2 = " + poly2 +
                " poly1.multiply(poly2) = " + poly1.multiply(poly2));

        System.out.println("проверка equals и hashCode");
        MyPolynomial poly3 = new MyPolynomial(0., -2., 1, 7., -12.);
        System.out.println("должно быть true: " + poly2.equals(poly3));
        MyPolynomial poly4 = poly2;
        System.out.println("должно быть true: " + poly2.equals(poly4));
        System.out.println("должно быть false: " + poly2.equals(poly1));
        System.out.println("должно быть false: " + poly2.equals("1234"));
        System.out.println("hashCode poly1 = " + poly1.hashCode() +
                ", poly2 = " + poly2.hashCode() + ", poly3 = " + poly3.hashCode());


        System.out.println("==========================");
        System.out.println("#3 Ball class");


        Ball ball1 = new Ball(4, 5, 1, 2, -30);
        System.out.println("проверка конструкторов и геттеров:" +
                "Ball{x = " + ball1.getX() +
                ", y = " + ball1.getY() +
                ", radius = " + ball1.getRadius() +
                ", xDelta = " + ball1.getxDelta() +
                ", yDelta = " + ball1.getyDelta() +
                "}");
        ball1.setX(2);
        ball1.setY(4);
        ball1.setRadius(2);
        ball1.setxDelta(1.8f);
        ball1.setyDelta(1.1f);
        System.out.println("проверка сеттеров и метода toString: " +
                "ball1 = " + ball1);
        ball1.reflectHorizontal();
        System.out.println("после reflectHorizontal, ball1 = " + ball1);
        ball1.reflectVertical();
        System.out.println("после reflectVertical, ball1 = " + ball1);
        ball1.reflectHorizontal();
        ball1.reflectVertical();

        Container container = new Container(3, 5, 15, 10);
        System.out.println("проверка конструктора контейнера, геттеров и toString:" +
                "\nгеттеры: container{" +
                "x = " + container.getX() +
                ", y = " + container.getY() +
                ", width = " + container.getWidth() +
                ", height = " + container.getHeight() +
                "}" +
                "\ncontainer = " + container);
        System.out.println("ball1 = " + ball1);
        System.out.println("Мячь не в контейнере: " +
                "container.collides(ball1) = " + container.collides(ball1));
        ball1.move();
        System.out.println("после move мячь ещё не в контейнере: " +
                "container.collides(ball1) = " + container.collides(ball1));
        ball1.move();
        System.out.println("ещё move, мячь не в контейнере: " +
                "container.collides(ball1) = " + container.collides(ball1));
        ball1.move();
        System.out.println("после третьего move мячь должен попасть в контейнер: " +
                "container.collides(ball1) = " + container.collides(ball1));

        int i = 0;
        while (container.collides(ball1)) {
            ball1.move();
            i++;
        }
        System.out.println("после совершения move " + i +
                " раз мяч вышел из контейнера");

        System.out.println("проверка equals и hashCode Ball");
        Ball ball2 = new Ball(4, 5, 1, 2, -30);
        Ball ball3 = new Ball(4, 5, 1, 2, -30);
        System.out.println("должно быть true: " + ball2.equals(ball3));
        Ball ball4 = ball2;
        System.out.println("должно быть true: " + ball2.equals(ball4));
        System.out.println("должно быть false: " + ball2.equals(ball1));
        System.out.println("должно быть false: " + ball2.equals("1234"));
        System.out.println("hashCode ball1 = " + ball1.hashCode() +
                ", ball2 = " + ball2.hashCode() + ", ball3 = " + ball3.hashCode());

        System.out.println("проверка equals и hashCode Container");
        Container container2 = new Container(3, 5, 15, 10);
        System.out.println("должно быть true: " + container.equals(container2));
        Container container3 = container;
        System.out.println("должно быть true: " + container.equals(container3));
        Container container4 = new Container(3, 7, 15, 10);
        System.out.println("должно быть false: " + container.equals(container4));
        System.out.println("должно быть false: " + container.equals("1234"));
        System.out.println("hashCode container = " + container.hashCode() +
                ", container2 = " + container2.hashCode() + ", container4 = " + container4.hashCode());
    }
}
