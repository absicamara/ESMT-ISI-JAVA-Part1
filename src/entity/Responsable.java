package entity;

import interfaces.Personne;

public class Responsable implements Personne {
    @Override
    public void sePresenter() {
        System.out.println ("Méthode entity.Responsable::sePresenter().");

    }
}
