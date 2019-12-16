package epam_intro_online.module_2.decomposition;

public class Task3 {
    public static void main(String[] args) {
        int sideOfhexagone = 5;
        System.out.println("The square of the regular hexagon is " + hexagoneSquare(triangleSquare(sideOfhexagone)));

    }

    public static double triangleSquare(int side) {
        return Math.sqrt(3) / 4 * Math.pow(side, 2);
    }

    public static double hexagoneSquare(double triangleArea) {
        return 6 * triangleArea;
    }
}
