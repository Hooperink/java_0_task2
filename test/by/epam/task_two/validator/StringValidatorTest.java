package by.epam.task_two.validator;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringValidatorTest {

    StringValidator stringValidator;

    @BeforeTest
    public void setup() {
        stringValidator = new StringValidator();
    }

    @Test
    public void testValidateWithValidValue() {
        String valid = "Vacation type: Cruise; Transport: Train; Country: Egypt; Food type: Half board; Amount of days: 2; Ship: asd;";
        assertEquals(stringValidator.validate(valid), true);
    }

    @Test
    public void testValidateWithBadValue() {
        String valid = "Vacation typasdasdasfdge: Halsef board; Amount of days: 2; Ship: asd;";
        assertEquals(stringValidator.validate(valid), false);
    }
}