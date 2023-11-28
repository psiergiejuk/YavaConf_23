package Example;

import java.time.LocalDate;
import java.time.Month;

public class hohoho {

    public static void main(String args[]) {
        String hoHo = "Ho Ho Ho, ";
        String isChristmas = "it is Christmas :)";
        String noChristmas = "NO it is not Christmas :(";
        int chDay = 24;
        Month chMount = Month.DECEMBER;
        LocalDate currentDate = LocalDate.now();


        if (checkDate(currentDate, chDay, chMount)){
            System.out.println(hoHo + isChristmas);
        }
        else {
            System.out.println(hoHo + noChristmas);
        }
    }

    static boolean checkDate(LocalDate currentDate, int chDay, Month chMount) {

        int date = currentDate.getDayOfMonth();
        Month month = currentDate.getMonth();

        return (date == chDay && month == chMount);
    }


}
