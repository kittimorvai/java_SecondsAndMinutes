package academy.learnprogramming;

public class Main {
    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(345));
    }

    public static String getDurationString (int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return INVALID_VALUE_MESSAGE;
        }
        int calcHours = minutes / 60;
        int calcMinutes = minutes % 60;



        String hoursString = calcHours + "h ";
        if (calcHours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = calcMinutes + "m ";
        if (calcMinutes < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s ";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString + minutesString + secondsString;


    }


    public static String getDurationString (int seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        int Minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(Minutes, remainingSeconds);    
    }
}
