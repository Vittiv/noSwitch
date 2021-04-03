package com.vittiv.services;

import com.vittiv.Healing;
import com.vittiv.models.Patient;
import com.vittiv.Treatment;

@Treatment(type=Healing.ALKOHOL)
public class Vodka implements Healing {
    @Override
    public void implement(Patient patient) {
        System.out.println("Drinking vodka...");
    }
}
