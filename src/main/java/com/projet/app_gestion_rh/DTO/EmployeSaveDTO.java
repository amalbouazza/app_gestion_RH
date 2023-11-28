package com.projet.app_gestion_rh.DTO;

public class CustomerSaveDTO {
    private String customername;
    private String customeradresse;
    private int mobile;

    public CustomerSaveDTO(String customername, String customeradresse, int mobile) {
        this.customername = customername;
        this.customeradresse = customeradresse;
        this.mobile = mobile;
    }

    public CustomerSaveDTO() {
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
                ", customername='" + customername + '\'' +
                ", customeradresse='" + customeradresse + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
