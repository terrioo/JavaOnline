package epam_intro_online.module_2.array;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 9, 10, 11, 12, 16, 18, 29, 30, 32};
        int divider = 3;
        System.out.println(summa(array,divider));
    }

    public static int summa(int[] array, int divider ){
        int summa = 0;
        for (int i=0; i<array.length; i++){
            if (array[i]%divider==0){
                summa+=array[i];
            }
        }
        return summa;
    }
}
