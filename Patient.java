package model;

import model.Disease;
 import java.util.Date;
public class Patient {
    private String id;
    private double weigth;
    private String first_name;
    private String surname;
    private double heigth;
    private String address;
    private char gender;
    private Date birth_date;
    private Photo[] photo;
    private Disease[] disease;
    private int quantity_photo;
    private int quantity_max;
    private int quantity_disease;
    private int quantity_maxdisease;

public void Patient(String id, double weigth, String first_name, String surname, double heigth, String address, char gender, Photo[] photo, Disease[] disease, int quantity_photo, int quantity_max, int quantity_disease, int quantity_maxdisease) {
        this.id = id;
        this.weigth = weigth;
        this.first_name = first_name;
        this.surname = surname;
        this.heigth = heigth;
        this.address = address;
        this.gender = gender;
        this.photo = photo;
        this.disease = disease;
        this.quantity_photo = quantity_photo;
        this.quantity_max = quantity_max;
       }

    public String getId() {
        return id;
    }

    public double getWeigth() {
        return weigth;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getSurname() {
        return surname;
    }

    public double getHeigth() {
        return heigth;
    }

    public String getAddress() {
        return address;
    }

    public char getGender() {
        return gender;
    }

    public Photo[] getPhoto() {
        return photo;
    }

    public Disease[] getDisease() {
        return disease;
    }

    public int getQuantity_photo() {
        return quantity_photo;
    }

    public int getQuantity_max() {
        return quantity_max;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public int getQuantity_disease() {
        return quantity_disease;
    }

    public int getQuantity_maxdisease() {
        return quantity_maxdisease;
    } 
    
    public void setId(String id) {
        this.id = id;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPhoto(Photo[] photo) {
        this.photo = photo;
    }

    public void setDisease(Disease[] disease) {
        this.disease = disease;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public void setQuantity_photo(int quantity_photo) {
        this.quantity_photo = quantity_photo;
    }

    public void setQuantity_max(int quantity_max) {
        this.quantity_max = quantity_max;
    }

    public void setQuantity_disease(int quantity_disease) {
        this.quantity_disease = quantity_disease;
    }

    public void setQuantity_maxdisease(int quantity_maxdisease) {
        this.quantity_maxdisease = quantity_maxdisease;
    }
    
    public void Add_photo(Photo photo){
        if(quantity_photo < quantity_max){
            this.photo[quantity_photo]= photo;
            quantity_photo ++;   
        }
    }
        
        public void Delete_photo(Photo photo){
            int pos = Search_photo(photo);
            if(pos!=-1){
                for(int i=pos; i<quantity_photo-1; i++){
                    this.photo[i] = this.photo[i+1];
                   }
                quantity_photo--;    
        }
        }
        
        public int Search_photo(Photo photo){
            for(int i=0; i<quantity_photo; i++){
                if(this.photo[i].getPhoto_name().compareTo(photo.getPhoto_name())==0){
                    return i;
            }
            }
            return -1;
        }

            
        public void Add_disease(Disease disease){
            if(quantity_disease < quantity_maxdisease){
                this.disease[quantity_disease]= disease;
                quantity_disease ++;
            }
            }
        
        public void Delete_disease(Disease disease){
            int pos = Search_disease(disease);
            if(pos!=-1){
                for(int i=pos; i<quantity_disease-1; i++){
                    this.disease[i] = this.disease[i+1];
                   }
                quantity_disease--;    
        }
        }
        
        public int Search_disease(Disease disease){
            for(int i=0; i<quantity_disease; i++){
            if(this.disease[i].getDisease_name().compareTo(disease.getDisease_name())==0){
                return i;
            }
            }
            return -1;
        }
        
    public boolean Has_dengue(){
        for(int i=0; i<this.disease.length;i++){
            if(this.disease[i].getDisease_name().compareToIgnoreCase("dengue")==0){
            return true;
        }
        }
            return false;
        }
}
           
        
