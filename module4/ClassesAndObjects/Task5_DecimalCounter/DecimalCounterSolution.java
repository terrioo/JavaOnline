package epam_intro_online.module_4.ClassesAndObject.Task5_DecimalCounter;

public class DecimalCounterSolution {
    public static void main(String[] args) {
        DecimalCounter decimalCounter = new DecimalCounter(2, 25);
        System.out.println(decimalCounter.getCounter());
        decimalCounter.increaseCounter();
        System.out.println(decimalCounter.getCounter());
        decimalCounter.decreaseCounter();
        System.out.println(decimalCounter.getCounter());
    }
}
