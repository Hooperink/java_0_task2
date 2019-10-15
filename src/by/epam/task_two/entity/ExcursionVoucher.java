package by.epam.task_two.entity;

public class ExcursionVoucher extends Voucher {

    private String guide;

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public String getGuide() {
        return guide;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }

        ExcursionVoucher excursionVoucher = (ExcursionVoucher) obj;
        return ((amountOfDays == excursionVoucher.amountOfDays)
                && (guide != null ? guide.equals(excursionVoucher.guide) : excursionVoucher.guide == null)
                && (foodType != null ? foodType.equals(excursionVoucher.foodType) : excursionVoucher.foodType == null)
                && (transport != null ? transport.equals(excursionVoucher.transport) : excursionVoucher.transport == null)
                && (vacationType != null ? vacationType.equals(excursionVoucher.vacationType) : excursionVoucher.vacationType == null)
                && (country != null ? country.equals(excursionVoucher.country) : excursionVoucher.country == null));

    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + amountOfDays;
        result = 31 * result + (guide == null ? 0 : guide.hashCode());
        result = 31 * result + (foodType == null ? 0 : foodType.hashCode());
        result = 31 * result + (transport == null ? 0 : transport.hashCode());
        result = 31 * result + (vacationType == null ? 0 : vacationType.hashCode());
        result = 31 * result + (country == null ? 0 : country.hashCode());
        return  result;
    }
    @Override
    public String toString() {
        return super.toString() + "; Guide: " + guide;
    }
}
