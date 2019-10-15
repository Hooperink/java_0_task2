package by.epam.task_two.selector;

import by.epam.task_two.entity.FoodType;
import by.epam.task_two.entity.TransportType;
import by.epam.task_two.entity.Voucher;
import by.epam.task_two.entity.VacationType;
import by.epam.task_two.pattern.VoucherFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class VoucherSelectorTest {

    VoucherSelector voucherSelector;
    Voucher voucher;
    Voucher voucher2;
    Voucher voucher3;
    List<Voucher> vouchersToTest = new ArrayList<>();
    List<Voucher> vouchersAfterTest;

    @BeforeMethod
    public void setUp() {

        voucherSelector = new VoucherSelector();


        voucher = new Voucher();
        voucher.setVacationType(VacationType.TREATMENT);
        voucher.setAmountOfDays(30);
        voucher.setFoodType(FoodType.NO_FOOD);
        voucher.setTransport(TransportType.SHIP);
        voucher.setCountry("By");

        voucher2 = new Voucher();
        voucher2.setVacationType(VacationType.TREATMENT);
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

    }

    @Test
    public void testSelectByAmountOfDays() {
        vouchersAfterTest = voucherSelector.selectByAmountOfDays(vouchersToTest, 11, 24);
        List<Voucher> expectedVoucher = new ArrayList<>();
        expectedVoucher.add(voucher2);
        assertEquals(vouchersAfterTest,expectedVoucher);
    }

    @Test
    public void testSelectByTransport() {
        vouchersAfterTest = voucherSelector.selectByTransport(vouchersToTest, "Airplane");
        List<Voucher> expectedVoucher = new ArrayList<>();
        expectedVoucher.add(voucher3);
        assertEquals(vouchersAfterTest,expectedVoucher);
    }

    @Test
    public void testSelectByFoodType() {
        vouchersAfterTest = voucherSelector.selectByFoodType(vouchersToTest, "No food");
        List<Voucher> expectedVoucher = new ArrayList<>();
        expectedVoucher.add(voucher);
        assertEquals(vouchersAfterTest,expectedVoucher);
    }

    @Test
    public void testSelectByAmountOfDaysBadFilterNullReturn() {
        vouchersAfterTest = voucherSelector.selectByAmountOfDays(vouchersToTest, 0, 1);
        assertEquals(vouchersAfterTest,null);
    }

    @Test
    public void testSelectByTransportBadFilterNullReturn() {
        vouchersAfterTest = voucherSelector.selectByTransport(vouchersToTest, "Aasd");
        assertEquals(vouchersAfterTest, null);
    }

    @Test
    public void testSelectByFoodTypeBadFilterNullReturn() {
        vouchersAfterTest = voucherSelector.selectByFoodType(vouchersToTest, "Nasod");
        assertEquals(vouchersAfterTest, null);
    }
}