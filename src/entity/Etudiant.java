package entity;

public class Etudiant extends Personne{
    protected int matricule;
    protected String formation;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, char sexe, int matricule, String formation) {
        super(nom, prenom, sexe);
        this.matricule = matricule;
        this.formation = formation;
    }

    public Etudiant(String nom, String prenom, char sexe, int age, int matricule, String formation) throws Exception {
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
        System.out.println("Mon numero matricule est "+matricule+ " et je suis la formation : "+formation);
    }
}
