package entity;

public class Etudiant extends Personne{
    private int matricule;
    private String formation;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, char sexe, int age, int matricule, String formation) {
        super(nom, prenom, sexe, age);
        this.matricule = matricule;
        this.formation = formation;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        System.out.println("Mon matricule est le "+matricule+ " et je inscrit en : "+formation);
    }
}
