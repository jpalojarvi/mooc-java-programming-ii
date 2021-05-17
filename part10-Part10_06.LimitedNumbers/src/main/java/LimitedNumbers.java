
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number < 0) {
                break;
            }
            numbers.add(number);
        }
        numbers.stream()
                .filter(predicate -> predicate > 0 && predicate < 6)
                .forEach(input -> System.out.println(input));
    }
}
