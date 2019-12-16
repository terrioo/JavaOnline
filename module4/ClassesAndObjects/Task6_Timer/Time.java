package epam_intro_online.module_4.ClassesAndObject.Task6_Timer;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        checkHour(hour);
        checkMinute(minute);
        checkSeconds(second);
    }

    public void checkHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public void checkMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            this.hour = 0;
        }
    }

    public void checkSeconds(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        checkHour(hour);
    }

    public void setMinute(int minute) {
        checkMinute(minute);
    }

    public void setSecond(int second) {
        checkSeconds(second);
    }

    public int[] changeTime(int hour, int minute, int second) {
        int newHour = getHour();
        int newMinute = getMinute();
        int newSecond = getSecond();
        if (newSecond + second >= 60) {
            newMinute += 1;
            newSecond = newSecond + second - 60;
        } else newSecond += second;
        if (newMinute + minute >= 60) {
            newHour += 1;
            newMinute = newMinute + minute - 60;
        } else newMinute += minute;
        if (newHour + hour >= 24) {
            newHour = newHour + hour - 24;
        } else newHour += hour;
        int[] time = {newHour, newMinute, newSecond};
        return time;
    }

}


