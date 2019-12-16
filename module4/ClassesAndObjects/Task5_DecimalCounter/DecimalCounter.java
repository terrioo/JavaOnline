package epam_intro_online.module_4.ClassesAndObject.Task5_DecimalCounter;

public class DecimalCounter {
    private int minBorder;
    private int maxBorder;
    private int counter;

    //default value
    public DecimalCounter(int minBorder, int maxBorder) {
        this.minBorder = minBorder;
        this.maxBorder = maxBorder;
        this.counter = (int) (Math.random() * (maxBorder - minBorder));
    }

    public DecimalCounter(int minBorder, int maxBorder, int counter) {
        this.minBorder = minBorder;
        this.maxBorder = maxBorder;
        this.counter = counter;
    }

    public int getMinBorder() {
        return minBorder;
    }

    public int getMaxBorder() {
        return maxBorder;
    }

    public int getCounter() {
        return counter;
    }

    public void increaseCounter() {
        if (counter > minBorder && counter < maxBorder) {
            ++counter;
        } else System.out.println("Счетчик за пределами диапазона");
    }


    public void decreaseCounter() {
        if (counter > minBorder && counter < maxBorder) {
            --counter;
        } else System.out.println("Счетчик за пределами диапазона");
    }
}

