package entity;

import interfaces.Personne;

public class Etudiant implements Personne {
    @Override
    public void sePresenter() {
        System.out.println ("Méthode entity.Etudiant::sePresenter().");
    }
}
