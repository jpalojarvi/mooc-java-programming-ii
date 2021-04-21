
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container(0);
        Container second = new Container(0);
        
        while (true) {
            System.out.println("First: " + first.getCurrentCapacity() + "/100");
            System.out.println("Second: " + second.getCurrentCapacity() + "/100");
            System.out.print("> ");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            if (input.contains("add")) {
                String[] parts = input.split(" ");
                int amount = Integer.valueOf(parts[1]);
                first.add(amount);
            }

        }
    }

}
