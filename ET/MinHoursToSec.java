package ET;

public class MinHoursToSec {
    public static int compute(int hours, int minutes) {
        int minSec = minutes * 60;
        int hoursSec = 3600 * hours;
        
        return minSec + hoursSec;
    }
}
