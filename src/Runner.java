import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        Person person = new Person("John", 6, false);
        ChoreList choreList = new ChoreList(Arrays.asList("dishes"), Arrays.asList("John"));
        Chore chore = new Chore("mow the lawn", "do the dishes", "wash the windows");
        Dishes dishes = new Dishes(Arrays.asList("glasses", "silverware"), 15);
        Windows windows = new Windows(Arrays.asList(4), Arrays.asList("north side of house"), Arrays.asList(5));
        Lawn lawn = new Lawn(8, 2500);

        System.out.println(person);
        System.out.println(choreList);
        System.out.println(chore);
        System.out.println(dishes);
        System.out.println(windows);
        System.out.println(lawn);

    }
}
