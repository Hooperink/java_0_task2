package by.epam.task_two.entity;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FoodTypeTest {

    @Test
    public void testFromStringNullIsGiven() {
        String badFoodType = "asdas";
        assertEquals(FoodType.fromString(badFoodType), null);
    }

    @Test
    public void testFromString(){
        String goodFoodType = "No food";
        assertEquals(FoodType.fromString(goodFoodType), FoodType.NO_FOOD);
    }
}