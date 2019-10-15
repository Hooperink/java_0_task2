package by.epam.task_two.entity;

public class Voucher {

    protected TransportType transport;
    protected VacationType vacationType;
    protected int amountOfDays;
    protected String country;
    protected FoodType foodType;

    public Voucher(){

    }

    public Voucher(TransportType transport, VacationType vacationType, int amountOfDays, String country, FoodType foodType){
        this.transport = transport;
        this.vacationType = vacationType;
        this.amountOfDays = amountOfDays;
        this.country = country;
        this.foodType = foodType;
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

    public String getCountry() {
        return country;
    }

    public TransportType getTransport() {
        return transport;
    }

    public VacationType getVacationType() {
        return vacationType;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setAmountOfDays(int amountOfDays) {
        this.amountOfDays = amountOfDays;
    }

    public void setTransport(TransportType transport) {
        this.transport = transport;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setVacationType(VacationType vacationType) {
        this.vacationType = vacationType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }

        Voucher voucher = (Voucher) obj;
        return ((amountOfDays == voucher.amountOfDays)
                && (foodType != null ? foodType.equals(voucher.foodType) : voucher.foodType == null)
                && (transport != null ? transport.equals(voucher.transport) : voucher.transport == null)
                && (vacationType != null ? vacationType.equals(voucher.vacationType) : voucher.vacationType == null)
                && (country != null ? country.equals(voucher.country) : voucher.country == null));

    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + amountOfDays;
        result = 31 * result + (foodType == null ? 0 : foodType.hashCode());
        result = 31 * result + (transport == null ? 0 : transport.hashCode());
        result = 31 * result + (vacationType == null ? 0 : vacationType.hashCode());
        result = 31 * result + (country == null ? 0 : country.hashCode());
        return  result;
    }

    @Override
     public String toString() {
         return "Country: " + country + ", transport: " + transport + ", food type: "
                 + foodType + ", amount of days: " + amountOfDays + ", vacation type: " + vacationType;
     }
 }
