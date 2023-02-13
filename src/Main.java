import entity.Etudiant;

public class Main {

    public static void main(String[] args) {
        testException2();
    }

    public static void testException2() {
        try {
            testException1();
        } catch (Exception e) {

            System.err.println(e.getMessage());
        }
    }

    public static void testException1() throws  Exception{

            Etudiant etudiant = new Etudiant();
            etudiant.setAge(-5);


    }
}
