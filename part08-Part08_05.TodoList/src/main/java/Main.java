
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        list.add("one");
        list.add("two");
        list.add("three");

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
        list.print();

//        UserInterface ui = new UserInterface(list, scanner);
//        ui.start();
    }
}
