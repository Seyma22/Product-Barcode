package com.example.productbarcode.beans;

//SingletonBean.java //Product
public abstract class ProductBean {
    public ProductBean() {
        System.out.println("Product Bean Instantiated !!");
    }

    public abstract BarcodeBean getBarcodeBean();
}
