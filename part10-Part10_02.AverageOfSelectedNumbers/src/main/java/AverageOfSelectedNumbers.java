
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList();
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            inputs.add(input);
        }
        
        
        System.out.println("Print the average of the negative numbers or the positive numbers?\n(n/p)");
        String selection = scanner.nextLine();
        if (selection.equals("n")){
            double average = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(predicate -> predicate < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }
        if (selection.equals("p")){
            double average = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(predicate -> predicate > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
        
    }
}
