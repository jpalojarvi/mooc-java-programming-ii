
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers, type \"end\" to stop.");
        // Write your program here
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            inputs.add(input);
        }
        
        
    }
}
