package by.epam.task_two.entity;

public class RestVoucher extends Voucher {
    private String hotel;

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getHotel() {
        return hotel;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }

        RestVoucher restVoucher = (RestVoucher)obj;
        return ((amountOfDays == restVoucher.amountOfDays)
                && (hotel != null ? hotel.equals(restVoucher.hotel) : restVoucher.hotel == null)
                && (foodType != null ? foodType.equals(restVoucher.foodType) : restVoucher.foodType == null)
                && (transport != null ? transport.equals(restVoucher.transport) : restVoucher.transport == null)
                && (vacationType != null ? vacationType.equals(restVoucher.vacationType) : restVoucher.vacationType == null)
                && (country != null ? country.equals(restVoucher.country) : restVoucher.country == null));
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + amountOfDays;
        result = 31 * result + (hotel == null ? 0 : hotel.hashCode());
        result = 31 * result + (foodType == null ? 0 : foodType.hashCode());
        result = 31 * result + (transport == null ? 0 : transport.hashCode());
        result = 31 * result + (vacationType == null ? 0 : vacationType.hashCode());
        result = 31 * result + (country == null ? 0 : country.hashCode());
        return  result;
    }

    @Override
    public String toString() {
        return super.toString() + "; Hotel: " + hotel;
    }
}
