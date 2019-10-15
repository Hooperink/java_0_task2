package by.epam.task_two.selector;

import by.epam.task_two.entity.Voucher;

import java.util.ArrayList;
import java.util.List;

public class VoucherSelector {

    public List<Voucher> selectByAmountOfDays(List<Voucher> vouchers, int minAmountOfDays, int maxAmountOfDays) {
        List<Voucher> selectedByAmountOFDays = new ArrayList<>();
        for (Voucher voucher: vouchers) {
            if ((voucher.getAmountOfDays() >= minAmountOfDays) && (voucher.getAmountOfDays() <= maxAmountOfDays)) {
                selectedByAmountOFDays.add(voucher);
            }
        }
        return selectedByAmountOFDays.size() != 0 ? selectedByAmountOFDays : null;
    }

    public List<Voucher> selectByTransport(List<Voucher> vouchers, String transportType) {
        List<Voucher> selectedByTransportVouchers = new ArrayList<>();
        for (Voucher voucher: vouchers) {
            if (voucher.getTransport().transport.equalsIgnoreCase(transportType)) {
                selectedByTransportVouchers.add(voucher);
            }
        }
        return selectedByTransportVouchers.size() != 0 ? selectedByTransportVouchers : null;
    }

    public List<Voucher> selectByFoodType(List<Voucher> vouchers, String foodType) {
        List<Voucher> selectByFoodVouchers = new ArrayList<>();
        for (Voucher voucher: vouchers) {
            if (voucher.getFoodType().foodType.equalsIgnoreCase(foodType)) {
                selectByFoodVouchers.add(voucher);
            }
        }
        return selectByFoodVouchers.size() != 0 ? selectByFoodVouchers : null;
    }
}
