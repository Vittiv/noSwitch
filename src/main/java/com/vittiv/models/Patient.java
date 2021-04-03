package com.vittiv.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Patient {
    private String name;
    private int age;
    private String method;
    public static Patient.PatientBuilder builder() {
        return new Patient.PatientBuilder();
    };

    public static class PatientBuilder {
        public Patient build;
    }
}
