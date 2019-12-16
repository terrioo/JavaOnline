package epam_intro_online.module_2.decomposition;

public class Task17 {
    public static void main(String[] args) {
        System.out.println(findCountOfOperations(52));
    }

    public static int findCountOfOperations(int number) {
        int count = 0;
        while (number > 0) {
            number = number - SumOfDigits(number);
            count++;
        }
        return count;
    }


    public static int SumOfDigits(int number) {
        int summa = 0;
        while (number > 0) {
            summa += number % 10;
            number /= 10;
        }
        return summa;
    }
}

