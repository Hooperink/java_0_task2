package by.epam.task_two.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public enum TransportType {

    TRAIN("Train"),
    BUS("Bus"),
    AIRPLANE("Airplane"),
    SHIP("Ship");

    public final String transport;
    private final static Map<String, TransportType> TRANSPORT_TYPE_BY_NAME = new HashMap<>();
    private final static Logger logger = LogManager.getLogger(TransportType.class);

    TransportType(String transport){
        this.transport = transport;
    }

    static {
        for (TransportType typeCase : values()){
            TRANSPORT_TYPE_BY_NAME.put(typeCase.transport, typeCase);
        }
    }

    public static TransportType fromString(String value){
        if (TRANSPORT_TYPE_BY_NAME.get(value) == null){
            logger.error("There is no such transport type: " + value);
        }
        return TRANSPORT_TYPE_BY_NAME.get(value);
    }
}
