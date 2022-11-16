package com.example.productbarcode.beans;

//PrototypeBean.java //Barcode
public class BarcodeBean {
    private String message;

    public BarcodeBean() {
        System.out.println("Barcode Bean Instantiated !!");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public BarcodeBean getBarcodeBean() {
        return this;
    }
}
