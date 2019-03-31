import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        Person choreDoer = new Person("John", 4, true);
        ChoresList choresList = new ChoresList(Arrays.asList("dishes"), Arrays.asList("John"));
        Chores chores = new Chores("mow the lawn", "do the dishes", "wash the windows");
        Dishes dishes = new Dishes(Arrays.asList("glasses", "silverware"), 15);
        Windows windows = new Windows(Arrays.asList(4), Arrays.asList("north side of house"), Arrays.asList(5));
        Lawn lawn = new Lawn(8, 2500);

        System.out.println(choreDoer);
        System.out.println(choresList);
        System.out.println(chores);
        System.out.println(dishes);
        System.out.println(windows);
        System.out.println(lawn);

    }
}
