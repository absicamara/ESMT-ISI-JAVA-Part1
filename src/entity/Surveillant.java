package entity;

import interfaces.Surveiller;

public class Surveillant extends Personne implements Surveiller {

    public Surveillant(String nom, String prenom, char sexe, int age) {
        super(nom, prenom, sexe, age);
    }

    @Override
    public void surveillerEvaluation() {

    }
}