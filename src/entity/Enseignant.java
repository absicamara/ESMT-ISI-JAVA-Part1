package entity;

import interfaces.Enseigner;

public class Enseignant extends Personne implements Enseigner {

    public Enseignant(String nom, String prenom, char sexe, int age) {
        super(nom, prenom, sexe, age);
    }

    @Override
    public void dispenserCours() {

    }
}