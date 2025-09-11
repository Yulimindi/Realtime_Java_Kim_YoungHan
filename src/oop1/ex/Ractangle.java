package oop1.ex;

public class Ractangle {
    int width;
    int height;

    int calculateArea() {
        System.out.println("넓이 : " + width * height);
        return width * height;
    }

    int calcularePerimeter() {
        System.out.println("둘레 길이 : " + 2 * (width + height));
        return 2 * (width + height);
    }

    boolean isSquare() {

        boolean square = (width == height);
        System.out.println("정사각형 여부 : " + square);
        return width == height;
    }
}
