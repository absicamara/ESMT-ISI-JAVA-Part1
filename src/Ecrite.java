import interfaces.Evaluation;

public class Ecrite implements Evaluation {
    @Override
    public void noter() {
        System.out.println("Notation d'une évaluation écrite.");
    }
}
