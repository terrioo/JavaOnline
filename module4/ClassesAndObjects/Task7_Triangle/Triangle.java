package epam_intro_online.module_4.ClassesAndObject.Task7_Triangle;

public class Triangle {
    int xA;
    int yA;
    int xB;
    int yB;
    int xC;
    int yC;
  //  String mistake = "Операция невозможна, так как треугольник с такими координатами построить нельзя";


    public Triangle(int xA, int yA, int xB, int yB, int xC, int yC) {
        this.xA = xA;
        this.yA = yA;
        this.xB = xB;
        this.yB = yB;
        this.xC = xC;
        this.yC = yC;
    }

    public static double[] findSides(int xA, int yA, int xB, int yB, int xC, int yC) {
        double[] side = new double[3];
        side[0] = (double) Math.sqrt(Math.pow(Math.abs(xA - xB), 2) +
                Math.pow(Math.abs(yA - yB), 2));
        side[1] = (double) Math.sqrt(Math.pow(Math.abs(xA - xC), 2) +
                Math.pow(Math.abs(yA - yC), 2));
        side[2] = (double) Math.sqrt(Math.pow(Math.abs(xB - xC), 2) +
                Math.pow(Math.abs(yB - yC), 2));
        return side;
    }


    public boolean checkTriangle(double[] side) {
        boolean check = true;
        double firstSide = side[0];
        double secondSide = side[0];
        double thirdSide = side[0];
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0 || firstSide + secondSide <= thirdSide
                || firstSide + thirdSide <= secondSide || secondSide + thirdSide <= firstSide) {

            check = false;
        }
        return check;
    }

    public double perimetr(double[] side){
        return side[0]+side[1]+side[2];
    }

    public double square(double[] side) {
        double p = (side[0] + side[1] + side[2]) / 2;
        return Math.sqrt(p * (p-side[0]) * (p-side[1]) * (p-side[2]));
    }

    public double[] getPointOfMedians(){
        double[] point = new double[2];
        point[0] = (xA+xB+xC)/3;
        point[1] = (yA+yB+yC)/3;
        return point;
    }
}
