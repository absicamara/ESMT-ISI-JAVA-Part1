package entity;

import interfaces.Surveiller;

public class EnseignantSurveillant extends Enseignant implements Surveiller {

    public EnseignantSurveillant(String nom, String prenom, char sexe, int age) throws Exception {
        super(nom, prenom, sexe, age);
    }

    @Override
    public void surveillerEvaluation() {

    }
}
