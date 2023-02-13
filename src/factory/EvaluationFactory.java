package factory;

import factory.AbstractFactory;
import interfaces.Evaluation;

public class EvaluationFactory extends AbstractFactory {
    @Override
    public Evaluation getEvaluation(Class<? extends Evaluation> typeEvaluation) {
        if (typeEvaluation == null) {
            return null;
        }
        if (typeEvaluation == Ecrite.class) {
            return new Ecrite();
        } else if (typeEvaluation == Orale.class) {
            return new Orale();
        }
        return null;
    }
}
