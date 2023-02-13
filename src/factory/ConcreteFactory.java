package factory;

public class ConcreteFactory {
    public static AbstractFactory getFactory (Class<? extends AbstractFactory> factory) {
        if (factory == null) {
            return null;
        }
        if (factory == PersonneFactory.class) {
            return new PersonneFactory();
        } else if (factory == EvaluationFactory.class) {
            return new EvaluationFactory();
        }
        return null;
    }
}
