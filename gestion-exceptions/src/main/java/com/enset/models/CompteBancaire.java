package com.enset.models;

import com.enset.exceptions.FondsInsuffisantsException;

public class CompteBancaire {
    protected String numero;
    protected double solde;
    protected String titulaire;

    public CompteBancaire(String numero, String titulaire, double solde) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public void depot(double montant) {
        solde += montant;
    }

    public void retrait(double montant) throws FondsInsuffisantsException {
        if (solde < montant) throw new FondsInsuffisantsException("Fonds insuffisants");
        solde -= montant;
    }

    public double getSolde() {
        return solde;
    }
}
