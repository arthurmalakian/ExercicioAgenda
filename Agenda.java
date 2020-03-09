package br.imd.ufrn.agenda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Agenda {
    private Date date;
    private String annotation;
    private String padrao_data;

    public Agenda(String padrao_data) {
        this.padrao_data = padrao_data;
    }

    public Date getDate() {
        return date;
    }
    public String getDateString() {
        SimpleDateFormat formater = new SimpleDateFormat(this.padrao_data);
        return formater.format(getDate());
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public boolean setDate(String date) {
        SimpleDateFormat formater = new SimpleDateFormat(this.padrao_data);
        formater.setLenient(false);
        try {
            setDate(formater.parse(date));
        } catch (ParseException e) {
            System.out.println("Data Inválida.");
            return false;
        }
        return true;
    }
    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }
}
