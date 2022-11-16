package com.example.productbarcode.lookup;

//Product-Barcode'dda method injetion uygulanmalı. Product-> Singleton, Barcode-> PrototypeBean

import com.itextpdf.text.pdf.Barcode;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class ProductBarcode {

    @Bean
    public Product product(){
        return new  ProductController();
    }

    @Component
    public class Product{
        doSomething(){
            Barcode();
        }
    }

    @Lookup
    public Barcode barcode(){
        return null;
    }

}

