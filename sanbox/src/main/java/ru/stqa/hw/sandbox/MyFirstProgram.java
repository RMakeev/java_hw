package ru.stqa.hw.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("World");
    hello("user");
    hello("Roman");
    Point p1 = new Point(2, 4);
    Point p2 = new Point(5, 6);


    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());


    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());


    System.out.println("Расстояние между точками p1 " + " и " + " p2 " + " = " + p1.distance(p2));
  }




  public static void hello(String somebody) {
    System.out.println("Hello," + somebody + "!");
  }


}