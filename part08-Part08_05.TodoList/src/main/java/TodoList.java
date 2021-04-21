
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks = new ArrayList<>();

    public TodoList() {

    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 + ": " + tasks.get(i));
        }
    }

    public void remove(int taskNumber) {
        System.out.println("Task " + tasks.get(taskNumber) + " completed");
        this.tasks.remove(taskNumber - 1);

    }

}
