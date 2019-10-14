package by.epam.task_two.entity;


public class ShoppingVoucher extends Voucher {

    private String shoppingCenter;

    public void setShoppingCenter(String shoppingCenter) {
        this.shoppingCenter = shoppingCenter;
    }

    public String getShoppingCenter() {
        return shoppingCenter;
    }

    @Override
    public String toString() {
        return super.toString() + ", Shopping center: " + shoppingCenter;
    }
}
