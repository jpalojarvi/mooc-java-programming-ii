
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int numbersCount = 0;
        while (true) {

            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                numbers += number;
                numbersCount++;
            }
            if (number == 0) {

                if (numbersCount > 0) {
                    System.out.println(1.0*numbers / numbersCount);
                    break;
                }

                System.out.println("Cannot calculate the average");
                break;
            }

        }
    }
}
