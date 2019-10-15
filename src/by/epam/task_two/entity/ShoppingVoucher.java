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
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }

        ShoppingVoucher shoppingVoucher = (ShoppingVoucher) obj;
        return ((amountOfDays == shoppingVoucher.amountOfDays)
                && (shoppingCenter != null ? shoppingCenter.equals(shoppingVoucher.shoppingCenter) : shoppingVoucher.shoppingCenter == null)
                && (foodType != null ? foodType.equals(shoppingVoucher.foodType) : shoppingVoucher.foodType == null)
                && (transport != null ? transport.equals(shoppingVoucher.transport) : shoppingVoucher.transport == null)
                && (vacationType != null ? vacationType.equals(shoppingVoucher.vacationType) : shoppingVoucher.vacationType == null)
                && (country != null ? country.equals(shoppingVoucher.country) : shoppingVoucher.country == null));

    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + amountOfDays;
        result = 31 * result + (shoppingCenter == null ? 0 : shoppingCenter.hashCode());
        result = 31 * result + (foodType == null ? 0 : foodType.hashCode());
        result = 31 * result + (transport == null ? 0 : transport.hashCode());
        result = 31 * result + (vacationType == null ? 0 : vacationType.hashCode());
        result = 31 * result + (country == null ? 0 : country.hashCode());
        return  result;
    }
    @Override
    public String toString() {
        return super.toString() + ", Shopping center: " + shoppingCenter;
    }
}
