package by.epam.task_two.file_handler;

import by.epam.task_two.entity.Voucher;
import by.epam.task_two.pattern.VoucherFactory;
import by.epam.task_two.validator.StringValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VoucherFileReader {

    private static final Logger logger = LogManager.getLogger(VoucherFileReader.class.getName());
    private List<Voucher> vouchers = new ArrayList<>();

    public List<Voucher> parseStringAndGetVouchers() {
        File file = new File("./resource/voucher.txt");
        StringValidator stringValidator = new StringValidator();
        VoucherFactory voucherFactory = new VoucherFactory();
        Voucher voucher;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                if (stringValidator.validate(temp)) {
                    voucher = voucherFactory.makeVoucherWithFactory(temp);
                    if (voucher != null) {
                        vouchers.add(voucher);
                    }
                } else {
                    logger.error("String " + temp + " is not valid.");
                }
            }
        } catch (IOException e){
            logger.error("File reading problems in " + file.getName());
        } catch (NullPointerException e){
            logger.error("Null returned " + e);
        }
        return vouchers;
    }

}