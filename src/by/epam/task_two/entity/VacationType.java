package by.epam.task_two.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public enum  VacationType {

    EXCURSION("Excursion"),
    TREATMENT("Treatment"),
    REST("Rest"),
    SHOPPING("Shopping"),
    CRUISE("Cruise");

    public final String type;
    private final static Map<String, VacationType> VACATIONS_TYPE_BY_NAME = new HashMap<>();
    private final static Logger logger = LogManager.getLogger(VacationType.class);

    VacationType(String type){
        this.type = type;
    }

    static {
        for (VacationType vacationType : values()){
            VACATIONS_TYPE_BY_NAME.put(vacationType.type, vacationType);
        }
    }

    public static VacationType fromString(String value){
        if (VACATIONS_TYPE_BY_NAME.get(value) == null){
            logger.error("There is no such vacation type: " + value);
        }
        return VACATIONS_TYPE_BY_NAME.get(value);
    }

}
