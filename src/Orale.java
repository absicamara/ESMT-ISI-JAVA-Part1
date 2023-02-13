import interfaces.Evaluation;

public class Orale implements Evaluation {
    @Override
    public void noter() {
        System.out.println("Notation d'une évaluation orale.");
    }
}
