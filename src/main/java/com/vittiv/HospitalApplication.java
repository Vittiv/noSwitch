package com.vittiv;

import com.vittiv.models.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HospitalApplication {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(HospitalApplication.class);
        context.getBean(Znahar.class).heal(Patient.builder().build);
    }
}
