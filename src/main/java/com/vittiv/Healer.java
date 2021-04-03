package com.vittiv;

import com.vittiv.models.Patient;

public interface Healer {
    void heal(Patient patient);

    String TRADITIONAL = "traditional";
    String FOLK = "folk";
}
