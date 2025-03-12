package controller;

import model.Patient;

public class Hospital {

    private Patient[] patient;
    private int quantity_patient;
    private int quantity_maxPatient;

    public Hospital() {
        this.quantity_patient = 0;
        this.patient = new Patient[100];

    }

    public Hospital(Patient[] patient, int quantity_patient, int quantity_maxPatient) {
        this.patient = patient;
        this.quantity_patient = quantity_patient;
    }

    public void Add_patient(Patient patient) {
        if (quantity_patient < quantity_maxPatient) {
            this.patient[quantity_patient] = patient;
            quantity_patient++;
        }
    }

    public void Delete_patient(Patient patient) {
        int pos = Search_patient(patient);
        if (pos != -1) {
            for (int i = pos; i < quantity_patient - 1; i++) {
                this.patient[i] = this.patient[i + 1];
            }
            quantity_patient--;
        }
    }

    public int Search_patient(Patient patient) {
        for (int i = 0; i < this.quantity_patient; i++) {
            if (this.patient[i].getId().compareTo(patient.getId()) == 0) {
                return i;
            }
        }
        return -1;
    }

    public double heigth_max_patient() {
        double heigth_max = 0;
        for (int i =0;i<this.quantity_patient;i++){
        if (this.patient[i].getHeigth() > heigth_max) {
                heigth_max = this.patient[i].getHeigth();
            }
        }
        return heigth_max;
    }
    
    public String Id_of_the_tallets(){
      String Id = null;
      double heigth = this.heigth_max_patient();
      for(int i=0; i<this.quantity_patient;i++){
          if(this.patient[i].getHeigth()== heigth){
              Id=this.patient[i].getId();
          }
      }
      return Id;
    }
    
    public int Count_woman_with_dengue(){
        int count=0;
        for(int i=0;i<this.quantity_patient;i++){
            if(this.patient[i].getGender()=='F' && this.patient[i].Has_dengue()){
                count++;
            }
        }
        return count;
    }
}
        
    

