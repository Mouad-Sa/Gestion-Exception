package com.enset;

import com.enset.exceptions.FondsInsuffisantsException;
import com.enset.models.CompteBancaire;
import com.enset.models.CompteCourant;
import com.enset.models.CompteEpargne;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CompteBancaire> comptes = new ArrayList<>();
        comptes.add(new CompteCourant("12345", "Alice", 1000, 500));
        comptes.add(new CompteEpargne("67890", "Bob", 2000, 2.5));

        try {
            CompteBancaire compte1 = comptes.get(0);
            compte1.retrait(1200);
            System.out.println("Solde après retrait : " + compte1.getSolde());
        } catch (FondsInsuffisantsException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
