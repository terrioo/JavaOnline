package epam_intro_online.module_4.ClassesAndObject.Task7_Triangle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 6, 7, 13, 1, 8);
        double[] side = triangle.findSides(triangle.xA, triangle.yA, triangle.xB, triangle.yB, triangle.xC, triangle.yC);
        boolean checkTriangle = triangle.checkTriangle(side);
        if (checkTriangle == false) {
            System.out.println("Построить треугольник по таким координатам нельзя. А потому выполнить операции" +
                    "над треугольником невозможно.");
        } else {
            System.out.println("Периметр треугольника: " + triangle.perimetr(side));
            System.out.println("Площадь треугольника: " + triangle.square(side));
            System.out.println("Координаты точки пересечения медиан:" + Arrays.toString(triangle.getPointOfMedians()));
        }
    }
}
