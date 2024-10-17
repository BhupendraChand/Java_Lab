public class Time {
    int hours, minutes, seconds;

    public Time() {
    }

    public Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    public Time add(Time t1) {
        Time t2 = new Time();
        t2.hours = hours + t1.hours;
        t2.minutes = minutes + t1.minutes;
        t2.seconds = seconds + t1.seconds;
        if (t2.seconds >= 60) {
            t2.minutes++;
            t2.seconds -= 60;
        }
        if (t2.minutes >= 60) {
            t2.hours++;
            t2.minutes -= 60;
        }
        return t2;
    }

    public Time subtract(Time t1) {
        Time t2 = new Time();
        t2.hours = hours - t1.hours;
        t2.minutes = minutes - t1.minutes;
        t2.seconds = seconds - t1.seconds;

        if (t2.seconds < 0) {
            t2.minutes--;
            t2.seconds += 60;
        }
        if (t2.minutes < 0) {
            t2.hours--;
            t2.minutes += 60;
        }
        return t2;
    }

    public void display() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}