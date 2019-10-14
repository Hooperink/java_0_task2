package by.epam.task_two.parser;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static by.epam.task_two.regular_expressions.PatternsRegEx.VACATION_TYPE_PATTERN;

public class ValueParserTest {

    ValueParser valueParser;

    @BeforeMethod
    public void setUp() {
        valueParser = new ValueParser();
    }

    @Test
    public void testParseStringWithValidString() {
        String validString = "Vacation type: Treatment; Transport: Ship; Country: By; Food type: No food; Amount of days: 30; Medical institution: qwerty;";
        assertEquals(valueParser.parseString(validString, VACATION_TYPE_PATTERN), "Treatment");
    }

    @Test
    public void testParseStringWithBadValue() {
        String badValue = "awgg";
        assertEquals(valueParser.parseString(badValue, VACATION_TYPE_PATTERN), "");
    }
}