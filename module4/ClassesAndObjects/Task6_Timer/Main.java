package epam_intro_online.module_4.ClassesAndObject.Task6_Timer;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(12, 15, 19);
        Time time2 = new Time(37, 12, 80);
        System.out.println("Время(time1): " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        System.out.println("Время(time2): " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
        time1.setHour(6);
        time1.setMinute(45);
        System.out.println("Время (New_time1): " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        int[] newTime1 = time1.changeTime(2,12,22);
        System.out.println("Время(New_time1_change1): " + newTime1[0] + ":" + newTime1[1] + ":" + newTime1[2]);
        int[] newTime2 = time1.changeTime(20,40,60);
        System.out.println("Время(New_time1_change2): " + newTime2[0] + ":" + newTime2[1] + ":" + newTime2[2]);


    }
}
