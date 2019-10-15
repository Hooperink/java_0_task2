package by.epam.task_two;

import by.epam.task_two.entity.Voucher;
import by.epam.task_two.file_handler.VoucherFileReader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VoucherFileReader vouchersFromFile = new VoucherFileReader();
        List<Voucher> vouchers = vouchersFromFile.parseStringAndGetVouchers();
        for (Voucher voucher : vouchers) {
            System.out.println(voucher);
        }
    }
}