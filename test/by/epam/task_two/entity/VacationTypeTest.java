package by.epam.task_two.entity;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class VacationTypeTest {

    @Test
    public void testFromStringNullIsGiven() {
        String badValue = "agwe";
        assertEquals(VacationType.fromString(badValue), null);
    }

    @Test
    public void testFromString() {
        String validValue = "Rest";
        assertEquals(VacationType.fromString(validValue), VacationType.REST);
    }
}