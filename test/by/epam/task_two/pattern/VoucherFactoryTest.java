package by.epam.task_two.pattern;

import by.epam.task_two.entity.FoodType;
import by.epam.task_two.entity.TransportType;
import by.epam.task_two.entity.TreatmentVoucher;
import by.epam.task_two.entity.VacationType;
import by.epam.task_two.entity.Voucher;
import by.epam.task_two.parser.ValueParser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class VoucherFactoryTest {

    VoucherFactory voucherFactory;
    TreatmentVoucher treatmentVoucher;
    TreatmentVoucher voucherToTest;

    @BeforeMethod
    public void setUp() {
        voucherFactory = new VoucherFactory();
        treatmentVoucher = new TreatmentVoucher();
        treatmentVoucher.setMedicalInstitute("qwerty");
        treatmentVoucher.setVacationType(VacationType.TREATMENT);
        treatmentVoucher.setAmountOfDays(30);
        treatmentVoucher.setFoodType(FoodType.NO_FOOD);
        treatmentVoucher.setTransport(TransportType.SHIP);
        treatmentVoucher.setCountry("By");
    }

    @Test
    public void testMakeVoucherWithFactoryAndValidValue() {
        String validValue = "Vacation type: Treatment; Transport: Ship; Country: By; Food type: No food; Amount of days: 30; Medical institution: qwerty;";
        voucherToTest = (TreatmentVoucher)voucherFactory.makeVoucherWithFactory(validValue);
        assertEquals(voucherToTest.getMedicalInstitute(), treatmentVoucher.getMedicalInstitute());
        assertEquals(voucherToTest.getAmountOfDays(), treatmentVoucher.getAmountOfDays());
        assertEquals(voucherToTest.getCountry(), treatmentVoucher.getCountry());
        assertEquals(voucherToTest.getFoodType(), treatmentVoucher.getFoodType());
        assertEquals(voucherToTest.getVacationType(), treatmentVoucher.getVacationType());
        assertEquals(voucherToTest.getTransport(), treatmentVoucher.getTransport());
    }

    @Test
    public void testMakeVoucherWithFactoryAndNotValidValue() {
        String badValue = "asdfsdg";
        voucherToTest = (TreatmentVoucher)voucherFactory.makeVoucherWithFactory(badValue);
        assertEquals(voucherToTest, null);
    }
}