package by.epam.task_two.entity;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TransportTypeTest {

    @Test
    public void testFromStringNullIsGiven() {
        String badValue = "qweqwe";
        assertEquals(TransportType.fromString(badValue), null);
    }

    @Test
    public void testFromString() {
        String validValue = "Bus";
        assertEquals(TransportType.fromString(validValue), TransportType.BUS);
    }
}