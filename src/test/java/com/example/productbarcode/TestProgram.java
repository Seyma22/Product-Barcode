package com.example.productbarcode;

import com.example.productbarcode.beans.BarcodeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestProgram {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        BarcodeBean singleton = (BarcodeBean) context.getBean("barcodeBean");
        BarcodeBean prototypeBeanA = singleton.getBarcodeBean();
        BarcodeBean prototypeBeanB = singleton.getBarcodeBean();
        System.out.println(prototypeBeanA);
        System.out.println(prototypeBeanB);
        System.out.println("Is prototypeBeanA and prototypeBeanA  same ? " + (prototypeBeanA==prototypeBeanB));
    }
}