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

        int date = currentDate.getDayOfMonth();
        Month month = currentDate.getMonth();

        if(date == chDay && month == chMount) {
            System.out.println(hoHo + isChristmas);
        }
        else {
            System.out.println(hoHo + noChristmas);
        }
    }
}
