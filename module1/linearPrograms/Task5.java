package epam_intro_online.module_1.linearPrograms;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(timeConverter(1028));

    }

    public static String timeConverter(int timeInSeconds) {
        if (timeInSeconds <= 0) {
            System.out.println("Incorrect data. Time must be >0");
        }
        int hour = timeInSeconds / 3600;
        int minute = (timeInSeconds - hour * 3600) / 60;
        int second = timeInSeconds - hour * 3600 - minute * 60;
        return hour + "ч " + minute + "мин " + second + "с";
    }
}





