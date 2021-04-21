
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

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }

            if (command.equals("move")) {
                if (amount <= first.getCurrentCapacity()) {
                    second.add(amount);
                    first.setCurrentCapacity(first.getCurrentCapacity() - amount);

                }

                else if (amount > first.getCurrentCapacity()) {
                    second.setCurrentCapacity(first.getCurrentCapacity());
                    first.setCurrentCapacity(0);

                }

            }
        }
    }
}
