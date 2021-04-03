package com.vittiv.services;

import com.vittiv.Healing;
import com.vittiv.models.Patient;

public class Pray implements Healing {
    @Override
    public void implement(Patient patient) {
        System.out.println("Praing..");
    }
}
