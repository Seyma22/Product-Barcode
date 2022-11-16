package com.example.productbarcode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.stream.Stream;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Barcode {

    public Barcode(String code) {
        this.code = code;
    }


    private String code;
    private String type;
}

//@RepositoryRestResource
//interface BarcodeRepository extends JpaRepository<Barcode, Integer> {}
//
//@Component
//class BarcodeInitializer implements CommandLineRunner {
//
//    private final BarcodeRepository barcodeRepository;
//
//    BarcodeInitializer(BarcodeRepository barcodeRepository) {
//        this.barcodeRepository = barcodeRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Stream.of("1", "2", "3", "4", "5", "6", "7")
//                .forEach(barcode -> BarcodeRepository.save(new Barcode(barcode)));
//
//        barcodeRepository.findAll().forEach(System.out::println);
//    }
//}
