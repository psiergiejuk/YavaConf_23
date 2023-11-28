package Example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;


class hohohoTest {

    @Test
    void addition() {
        LocalDate currentDate = LocalDate.now();
        assertEquals(true, hohoho.checkDate(currentDate, currentDate.getDayOfMonth(), currentDate.getMonth()));
    }
}