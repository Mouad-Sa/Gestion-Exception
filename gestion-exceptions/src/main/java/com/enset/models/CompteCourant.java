package com.enset.models;

import com.enset.exceptions.FondsInsuffisantsException;

public class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(String numero, String titulaire, double solde, double decouvertAutorise) {
        super(numero, titulaire, solde);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retrait(double montant) throws FondsInsuffisantsException {
        if (solde + decouvertAutorise < montant) throw new FondsInsuffisantsException("Fonds insuffisants même avec découvert");
        solde -= montant;
    }
}
