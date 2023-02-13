import entity.Etudiant;

public class Main {

    public static void main(String[] args) {
        testException();
        testRuntimeException();
    }

    public static void testRuntimeException() {
        Etudiant etudiant = new Etudiant("CAMARA", "", 'M',  5555, "MP-ISI");
        try {
            etudiant.setAge(2);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }

        etudiant.sePresenter();
    }

    public static void testException() {
        try {
            Etudiant etudiant = new Etudiant("Diallo", "Alimatou", 'M', -5, 972, "ISI");
            etudiant.sePresenter();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
