package by.epam.task_two.entity;

public class CruiseVoucher extends Voucher{

    private String shipName;

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipName() {
        return shipName;
    }

    @Override
    public String toString() {
        return super.toString() + "; Ship name: " + shipName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }

        CruiseVoucher cruiseVoucher = (CruiseVoucher)obj;
        return ((amountOfDays == cruiseVoucher.amountOfDays)
                && (shipName != null ? shipName.equals(cruiseVoucher.shipName) : cruiseVoucher.shipName == null)
                && (foodType != null ? foodType.equals(cruiseVoucher.foodType) : cruiseVoucher.foodType == null)
                && (transport != null ? transport.equals(cruiseVoucher.transport) : cruiseVoucher.transport == null)
                && (vacationType != null ? vacationType.equals(cruiseVoucher.vacationType) : cruiseVoucher.vacationType == null)
                && (country != null ? country.equals(cruiseVoucher.country) : cruiseVoucher.country == null));
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + amountOfDays;
        result = 31 * result + (shipName == null ? 0 : shipName.hashCode());
        result = 31 * result + (foodType == null ? 0 : foodType.hashCode());
        result = 31 * result + (transport == null ? 0 : transport.hashCode());
        result = 31 * result + (vacationType == null ? 0 : vacationType.hashCode());
        result = 31 * result + (country == null ? 0 : country.hashCode());
        return  result;
    }
}
