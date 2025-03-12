package model;

import java.util.Date;
class Photo{
  private String photo_name;
  private Date photo_date;
  private String photo_type;
  private String doctor_comments;

    public Photo(String photo_name, Date photo_date, String photo_type, String doctor_comments) {
        this.photo_name = photo_name;
        this.photo_date = photo_date;
        this.photo_type = photo_type;
        this.doctor_comments = doctor_comments;
    }

    public String getPhoto_name() {
        return photo_name;
    }

    public Date getPhoto_date() {
        return photo_date;
    }

    public String getPhoto_type() {
        return photo_type;
    }

    public String getDoctor_comments() {
        return doctor_comments;
    }

    public void setPhoto_name(String photo_name) {
        this.photo_name = photo_name;
    }

    public void setPhoto_date(Date photo_date) {
        this.photo_date = photo_date;
    }

    public void setPhoto_type(String photo_type) {
        this.photo_type = photo_type;
    }

    public void setDoctor_comments(String doctor_comments) {
        this.doctor_comments = doctor_comments;
    }
}
