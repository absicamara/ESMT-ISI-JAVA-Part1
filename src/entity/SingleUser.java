package entity;

public class SingleUser {

    private static SingleUser singleUser = new SingleUser();

    private SingleUser() {
    }

    public static SingleUser getInstance () {
        return singleUser ;
    }
}
