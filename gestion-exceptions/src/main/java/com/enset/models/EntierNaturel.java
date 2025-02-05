package com.enset.models;

import com.enset.exceptions.NombreNegatifException;

public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) throws NombreNegatifException {
        if (val < 0) throw new NombreNegatifException("Valeur négative interdite", val);
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if (val < 0) throw new NombreNegatifException("Valeur négative interdite", val);
        this.val = val;
    }

    public void decrementer() throws NombreNegatifException {
        if (val - 1 < 0) throw new NombreNegatifException("Décrémentation interdite", val - 1);
        val--;
    }
}