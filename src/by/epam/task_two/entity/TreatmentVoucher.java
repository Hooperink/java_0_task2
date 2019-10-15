package by.epam.task_two.entity;

public class TreatmentVoucher extends Voucher {
    private String medicalInstitute;

    public void setMedicalInstitute(String medicalInstitute) {
        this.medicalInstitute = medicalInstitute;
    }

    public String getMedicalInstitute() {
        return medicalInstitute;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }

        TreatmentVoucher treatmentVoucher = (TreatmentVoucher) obj;
        return ((amountOfDays == treatmentVoucher.amountOfDays)
                && (medicalInstitute != null ? medicalInstitute.equals(treatmentVoucher.medicalInstitute) : treatmentVoucher.medicalInstitute == null))
                && (foodType != null ? foodType.equals(treatmentVoucher.foodType) : treatmentVoucher.foodType == null)
                && (transport != null ? transport.equals(treatmentVoucher.transport) : treatmentVoucher.transport == null)
                && (vacationType != null ? vacationType.equals(treatmentVoucher.vacationType) : treatmentVoucher.vacationType == null)
                && (country != null ? country.equals(treatmentVoucher.country) : treatmentVoucher.country == null);

    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + amountOfDays;
        result = 31 * result + (medicalInstitute == null ? 0 : medicalInstitute.hashCode());
        result = 31 * result + (foodType == null ? 0 : foodType.hashCode());
        result = 31 * result + (transport == null ? 0 : transport.hashCode());
        result = 31 * result + (vacationType == null ? 0 : vacationType.hashCode());
        result = 31 * result + (country == null ? 0 : country.hashCode());
        return  result;
    }
    @Override
    public String toString() {
        return super.toString() + "; Medical institute: " + medicalInstitute;
    }
}
