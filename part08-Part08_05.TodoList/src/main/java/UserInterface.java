
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("add")){
                System.out.print("Task: ");
                String task = scanner.nextLine();
                list.add(task);
            }
            if (input.equals("stop")){
                break;
            }
            
            if (input.equals("remove")){
                System.out.print("Which task was completed?");
                int taskNumber = Integer.valueOf(scanner.nextLine());
                list.remove(taskNumber);
            }
            
            if (input.equals("list")){
                list.print();
            }
        }
    }

}
