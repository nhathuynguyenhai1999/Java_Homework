package James_Module2;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculator {
    public static LocalDate calculateNextDay(int day, int month, int year) {
        LocalDate currentDate = LocalDate.of(year, month, day);
        return currentDate.plusDays(1);
    }

    @Nested
    class NextDayCalculatorTest {
        @Test
        void testNextDay() {
            // Test cases
            LocalDate result1 = NextDayCalculator.calculateNextDay(1, 1, 2018);
            assertEquals(LocalDate.of(2018, 1, 2), result1);

            LocalDate result2 = NextDayCalculator.calculateNextDay(31, 1, 2018);
            assertEquals(LocalDate.of(2018, 2, 1), result2);

            LocalDate result3 = NextDayCalculator.calculateNextDay(30, 4, 2018);
            assertEquals(LocalDate.of(2018, 5, 1), result3);

            LocalDate result4 = NextDayCalculator.calculateNextDay(28, 2, 2018);
            assertEquals(LocalDate.of(2018, 3, 1), result4);

            LocalDate result5 = NextDayCalculator.calculateNextDay(29, 2, 2020);
            assertEquals(LocalDate.of(2020, 3, 1), result5);

            LocalDate result6 = NextDayCalculator.calculateNextDay(31, 12, 2018);
            assertEquals(LocalDate.of(2019, 1, 1), result6);
        }
    }
}
