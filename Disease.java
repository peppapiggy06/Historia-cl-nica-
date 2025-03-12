package model;

import java.util.Date;
class Disease {
    private String disease_name;
    private Date diagnosis_date;
    private String treatment;

    public Disease(String disease_name, Date diagnosis_date, String treatment) {
        this.disease_name = disease_name;
        this.diagnosis_date = diagnosis_date;
        this.treatment = treatment;
    }

    public String getDisease_name() {
        return disease_name;
    }

    public Date getDiagnosis_date() {
        return diagnosis_date;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setDisease_name(String disease_name) {
        this.disease_name = disease_name;
    }

    public void setDiagnosis_date(Date diagnosis_date) {
        this.diagnosis_date = diagnosis_date;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
