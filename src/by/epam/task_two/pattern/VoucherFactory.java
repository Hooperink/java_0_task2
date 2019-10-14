package by.epam.task_two.pattern;

import by.epam.task_two.entity.CruiseVoucher;
import by.epam.task_two.entity.ExcursionVoucher;
import by.epam.task_two.entity.RestVoucher;
import by.epam.task_two.entity.ShoppingVoucher;
import by.epam.task_two.entity.TreatmentVoucher;
import by.epam.task_two.entity.VacationType;
import by.epam.task_two.entity.Voucher;
import by.epam.task_two.parser.ValueParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static by.epam.task_two.regular_expressions.PatternsRegEx.COUNTRY_PATTERN;
import static by.epam.task_two.regular_expressions.PatternsRegEx.GUIDE_NAME_PATTERN;
import static by.epam.task_two.regular_expressions.PatternsRegEx.HOTEL_NAME_PATTERN;
import static by.epam.task_two.regular_expressions.PatternsRegEx.MEDICAL_INSTITUTION_NAME_PATTERN;
import static by.epam.task_two.regular_expressions.PatternsRegEx.SHIP_NAME_PATTERN;
import static by.epam.task_two.regular_expressions.PatternsRegEx.SHOPPING_CENTERS_NAME_PATTERN;

public class VoucherFactory {

    private static final Logger logger = LogManager.getLogger(VoucherFactory.class);

    public Voucher makeVoucherWithFactory(String stringFromFile) {
        ValueParser valueParser = new ValueParser();
        Voucher voucher;
        VacationType vacationType = valueParser.getVacationType(stringFromFile);
        if (vacationType == null){
            return null;
        }
        switch (vacationType){
            case TREATMENT:
                voucher = new TreatmentVoucher();
                ((TreatmentVoucher)voucher).setMedicalInstitute(valueParser.parseString(stringFromFile, MEDICAL_INSTITUTION_NAME_PATTERN));
                break;
            case REST:
                voucher = new RestVoucher();
                ((RestVoucher)voucher).setHotel(valueParser.parseString(stringFromFile,HOTEL_NAME_PATTERN));
                break;
            case CRUISE:
                voucher = new CruiseVoucher();
                ((CruiseVoucher)voucher).setShipName(valueParser.parseString(stringFromFile, SHIP_NAME_PATTERN));
                break;
            case SHOPPING:
                voucher = new ShoppingVoucher();
                ((ShoppingVoucher)voucher).setShoppingCenter(valueParser.parseString(stringFromFile, SHOPPING_CENTERS_NAME_PATTERN));
                break;
            case EXCURSION:
                voucher = new ExcursionVoucher();
                ((ExcursionVoucher)voucher).setGuide(valueParser.parseString(stringFromFile, GUIDE_NAME_PATTERN));
                break;
            default:
                logger.error("Null returned instead voucher." + VoucherFactory.class.getName());
                return null;
        }

        voucher.setTransport(valueParser.getTransportType(stringFromFile));
        voucher.setFoodType(valueParser.getFoodType(stringFromFile));
        voucher.setCountry(valueParser.parseString(stringFromFile, COUNTRY_PATTERN));
        voucher.setVacationType(valueParser.getVacationType(stringFromFile));
        voucher.setAmountOfDays(valueParser.getAmountOfDays(stringFromFile));
        return voucher;
    }


}
