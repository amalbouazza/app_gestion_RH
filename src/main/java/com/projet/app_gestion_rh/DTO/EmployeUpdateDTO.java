package com.projet.app_gestion_rh.DTO;

public class CustomerUpdateDTO {

    private  int customerid;
    private String customername;
    private String customeradresse;
    private int mobile;

    public CustomerUpdateDTO(int customerid, String customername, String customeradresse, int mobile) {
        this.customerid = customerid;
        this.customername = customername;
        this.customeradresse = customeradresse;
        this.mobile = mobile;
    }

    public CustomerUpdateDTO() {
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
        return "CustomerDTO{" +
                "customerid=" + customerid +
                ", customername='" + customername + '\'' +
                ", customeradresse='" + customeradresse + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
