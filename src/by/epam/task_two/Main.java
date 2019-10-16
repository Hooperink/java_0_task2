package by.epam.task_two;

import by.epam.task_two.entity.Voucher;
import by.epam.task_two.exception.NotValidStringException;
import by.epam.task_two.file_handler.VoucherFileReader;
import by.epam.task_two.voucher_comparator.AmountOfDaysComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VoucherFileReader vouchersFromFile = new VoucherFileReader();
        List<Voucher> vouchers = new ArrayList<>();
        try {
            vouchers = vouchersFromFile.parseStringAndGetVouchers();
        } catch (NotValidStringException e){
            System.out.println("Not valid string!");
        }

        for (Voucher voucher : vouchers) {
            System.out.println(voucher);
        }
        Comparator<Voucher> voucherComparator = new AmountOfDaysComparator();
        Collections.sort(vouchers, voucherComparator);
        System.out.println();
        for (Voucher voucher : vouchers) {
            System.out.println(voucher);
        }
    }
}