package entity;

import interfaces.Surveiller;

public class EtudiantSurveillant extends Etudiant implements Surveiller {

    public EtudiantSurveillant(String nom, String prenom, char sexe, int age, int matricule, String formation) throws Exception {
        super(nom, prenom, sexe, age, matricule, formation);
    }

    @Override
    public void surveillerEvaluation() {

    }
}
