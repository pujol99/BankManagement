package com.pujol.Money.models;

import java.sql.Date;

public class Transaction  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String concept;
    private String sec_concept;
    private Date date;
    private float value;
    private float total_money;

    public Transaction() {}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getSec_concept() {
        return sec_concept;
    }

    public void setSec_concept(String sec_concept) {
        this.sec_concept = sec_concept;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getTotal_money() {
        return total_money;
    }

    public void setTotal_money(float total_money) {
        this.total_money = total_money;
    }
}