package Observer;

import Subject.FenetrePrincipale;

public abstract class Observer {

    protected FenetrePrincipale fenetrePrincipale;
    public abstract void update();
}
