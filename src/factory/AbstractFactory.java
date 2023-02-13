package factory;

public  abstract class AbstractFactory {
    public Personne getPersonne (Class<? extends Personne> typePersonne) {
        return null ;
    }
    public Evaluation getEvaluation (Class<? extends Evaluation> typeEvaluation) {
        return null ;
    }
}
