package com.vittiv;

import com.vittiv.models.Patient;
import org.springframework.stereotype.Component;

@Component
public class Znahar implements Healer{
    @Treatment(type = Healing.ALKOHOL)
    private Healing vodka;

    @Override
    public void heal(Patient patient) {
        System.out.println("Seeking for healing method.");
        vodka.implement(patient);
    }
}
