package oop1.ex;

public class RactangleProceduralMain {
    public static void main(String[] args) {

        Ractangle ractangle = new Ractangle();
        ractangle.width = 5;
        ractangle.height = 5;

        int area = ractangle.calculateArea();

        int perimeter = ractangle.calcularePerimeter();

        boolean square = ractangle.isSquare();

        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(square);
    }

}
