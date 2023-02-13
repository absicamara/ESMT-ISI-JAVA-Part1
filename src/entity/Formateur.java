package entity;

import interfaces.Personne;

public class Formateur implements Personne {
    @Override
    public void sePresenter() {
        System.out.println ("Méthode entity.Formateur::sePresenter().");
    }
}
