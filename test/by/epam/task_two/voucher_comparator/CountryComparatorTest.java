package by.epam.task_two.voucher_comparator;

import by.epam.task_two.entity.FoodType;
import by.epam.task_two.entity.TransportType;
import by.epam.task_two.entity.VacationType;
import by.epam.task_two.entity.Voucher;
import by.epam.task_two.selector.VoucherSelector;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.testng.Assert.*;

public class CountryComparatorTest {

    VoucherSelector voucherSelector;
    Voucher voucher;
    Voucher voucher2;
    Voucher voucher3;
    List<Voucher> vouchersToTest = new ArrayList<>();
    List<Voucher> expectedVouchers = new ArrayList<>();

    @BeforeMethod
    public void setUp() {

        voucherSelector = new VoucherSelector();
        voucher = new Voucher();
        voucher.setVacationType(VacationType.SHOPPING);
        voucher.setAmountOfDays(30);
        voucher.setFoodType(FoodType.NO_FOOD);
        voucher.setTransport(TransportType.SHIP);
        voucher.setCountry("China");

        voucher2 = new Voucher();
        voucher2.setVacationType(VacationType.REST);
        voucher2.setAmountOfDays(21);
        voucher2.setFoodType(FoodType.BREAKFAST);
        voucher2.setTransport(TransportType.BUS);
        voucher2.setCountry("Turkey");

        voucher3 = new Voucher();
        voucher3.setVacationType(VacationType.TREATMENT);
        voucher3.setAmountOfDays(10);
        voucher3.setFoodType(FoodType.ALL_INCLUSIVE);
        voucher3.setTransport(TransportType.AIRPLANE);
        voucher3.setCountry("BY");

        vouchersToTest.add(voucher);
        vouchersToTest.add(voucher2);
        vouchersToTest.add(voucher3);

        expectedVouchers.add(voucher3);
        expectedVouchers.add(voucher);
        expectedVouchers.add(voucher2);
    }

    @Test
    public void testCompareCountryComparator() {
        Comparator<Voucher> country = new CountryComparator();
        vouchersToTest.sort(country);
        assertEquals(vouchersToTest, expectedVouchers);
    }
}