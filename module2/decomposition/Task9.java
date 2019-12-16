package epam_intro_online.module_2.decomposition;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("The square of quadrangle is " + calculateSquareQuadrangle(4, 6, 8, 13));
    }


    public static double calculateSquareQuadrangle(int side1, int side2, int side3, int side4) {
        double halfPerimeter = (side1 + side2 + side3 + side4) / 2;
        return Math.sqrt((halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3) *
                (halfPerimeter - side4));
    }

}
