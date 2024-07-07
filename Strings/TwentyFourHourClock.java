package Strings;

public class TwentyFourHourClock{
    public static String clock(int seconds) {
        int hours = (seconds / 3600) % 24;
        // int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        int seconds = 87000;
        System.out.println(clock(seconds));
    }
}
// 87000 // 24:10:00
// 8700 // 02:25:00 
// 870 // 00:14:30



