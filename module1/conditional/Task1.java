package epam_intro_online.module_1.conditional;

public class Task1 {
    static boolean isTriangleExist = false;
    static boolean isTriangleRight = false;

    public static void main(String[] args) {
        System.out.println(isTriangleExist + " " + isTriangleRight);
        triangle(30, 60);
        System.out.println(isTriangleExist + " " + isTriangleRight);

        System.out.println("Triangle exist: " + isTriangleExist);
        if (isTriangleExist) {
            System.out.println("It is right triangle: " + isTriangleRight);
        }
    }

    public static void triangle(double firstAngle, double secondAngle) {
        double sumOfAngles = firstAngle + secondAngle;
        if (sumOfAngles > 0 && sumOfAngles < 180) {
            isTriangleExist = true;
            if ((isTriangleExist) && (sumOfAngles == 90 || sumOfAngles == 90 || sumOfAngles == 90)) {
                isTriangleRight = true;
            }
        }
    }
}


