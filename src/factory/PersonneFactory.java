package factory;

import factory.AbstractFactory;
import interfaces.Personne;

public class PersonneFactory  extends AbstractFactory {
    @Override
    public Personne getPersonne(Class<? extends Personne> typePersonne) {
        if ( typePersonne == null ) {
            return null;
        }
        if (typePersonne == Responsable.class) {
            return new Responsable();
        } else if (typePersonne == Formateur.class) {
            return new Formateur();
        } else if (typePersonne == Etudiant.class) {
            return new Etudiant();
        }
        return null;
    }
}
