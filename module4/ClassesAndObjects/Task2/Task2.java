package epam_intro_online.module_4.ClassesAndObject;

public class Task2 {
    private static int valume1, valume2;

    public Task2() {
    }

    public Task2(int valume1, int valume2) {
        this.valume1 = valume1;
        this.valume2 = valume2;
    }

    public static int getValume1() {
        return valume1;
    }

    public static void setValume1(int valume1) {
        Task2.valume1 = valume1;
    }

    public static int getValume2() {
        return valume2;
    }

    public static void setValume2(int valume2) {
        Task2.valume2 = valume2;
    }

    public static void main(String[] args) {

    }
}
