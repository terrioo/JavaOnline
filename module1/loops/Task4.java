package epam_intro_online.module_1.loops;

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(findMultiplication());
    }

    public static BigInteger findMultiplication() {
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= 200; i++) {
            result = result.multiply(BigInteger.valueOf(i * i));
        }
        return result;
    }
}

