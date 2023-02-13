package entity;

public abstract class Personne {
    protected static int nbPersonnes;
    protected String nom;
    protected String prenom;
    protected char sexe;
    protected int age;

    public Personne() {
        nbPersonnes++;
    }

    public Personne(String nom, String prenom, char sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
    }

    public Personne(String nom, String prenom, char sexe, int age) throws Exception {
//        Call empty constructor here by using this()
        this();
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.setAge(age);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age < 0) {
            throw  new Exception("AGE must not be less than zero");
        }
        this.age = age;
    }

    public void sePresenter() {
        if (nom == null || prenom == null) {
            throw  new RuntimeException("Nom or prenom must must not be null");
        }
        if (nom.isEmpty() ||  prenom.isEmpty()) {
            throw  new RuntimeException("Nom or prenom must not be empty");
        }
        System.out.println("Je suis "+ prenom + " " + nom +", j'ai  "+age+ " ans et je suis de sexe "+sexe);
    }

    public static int getNbPersonnes(){
        return nbPersonnes;
    }

}
