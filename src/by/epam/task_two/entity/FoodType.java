package by.epam.task_two.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public enum FoodType {

    NO_FOOD("No food"),
    BREAKFAST("Breakfast"),
    BUFFET("Buffet"),
    HALF_BOARD("Half board"),
    ALL_INCLUSIVE("All inclusive");

    public final String foodType;
    private static final Map<String, FoodType> FOOD_TYPE_BY_NAME = new HashMap<>();
    private static final Logger logger = LogManager.getLogger(FoodType.class);
    FoodType(String foodType) {
        this.foodType = foodType;
    }

    static {
        for (FoodType caseStatuses : values()) {
            FOOD_TYPE_BY_NAME.put(caseStatuses.foodType, caseStatuses);
        }
    }

    public static FoodType fromString(String value) {
        if(FOOD_TYPE_BY_NAME.get(value) == null){
            logger.error("There is no such food type " + value);
        }
        return FOOD_TYPE_BY_NAME.get(value);
    }
}