import entity.MultipleUser;
import entity.SingleUser;

public class Main {

    public static void main(String[] args) {
        SingleUser singleUser1 = SingleUser.getInstance();

        MultipleUser multipleUser1 = new MultipleUser();

        SingleUser singleUser2 = SingleUser.getInstance();
        MultipleUser multipleUser2 = new MultipleUser();

        System.out.println(singleUser1 + " - "+multipleUser1);
        System.out.println(singleUser2 + " - "+multipleUser2);

    }
}
