package com.projet.app_gestion_rh.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name ="customer_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int customerid;
    @Column(name ="customer_name", length = 50)
    private String customername;
    @Column(name ="customer_adresse", length = 60)
    private String customeradresse;
    @Column(name ="mobile", length = 50)

    private int mobile;

    public Customer(int customerid, String customername, String customeradresse, int mobile) {
        this.customerid = customerid;
        this.customername = customername;
        this.customeradresse = customeradresse;
        this.mobile = mobile;
    }

    public Customer() {
    }

    public Customer(String customername, String customeradresse, int mobile) {
        this.customername = customername;
        this.customeradresse = customeradresse;
        this.mobile = mobile;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeradresse() {
        return customeradresse;
    }

    public void setCustomeradresse(String customeradresse) {
        this.customeradresse = customeradresse;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerid=" + customerid +
                ", customername='" + customername + '\'' +
                ", customeradresse='" + customeradresse + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
