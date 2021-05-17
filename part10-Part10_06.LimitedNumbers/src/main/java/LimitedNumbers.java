
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            int number = Integer.valueOf(input);
            if (number < 0) {
                break;
            }
            inputs.add(number);
        }
        inputs.stream()
                .filter(predicate -> predicate > 0 && predicate < 6)
                .forEach(input -> System.out.println(input));
    }
}
