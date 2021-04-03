package com.vittiv;

import com.vittiv.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;

public class HospitalImpl implements Hospital {
    @Autowired
    private Healer healer;
    @Autowired
    private Znahar znahar;

    @Override
    public void processPatient(Patient patient) {

    }
}
