
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-3);
        numbers.add(5);
        System.out.println(positive(numbers));

    }
    
    public static List<Integer> positive(List<Integer> numbers){
        // method 1
//        List<Integer> positiveValues = numbers.stream()
//                .filter(predicate -> predicate > 0)
//                .collect(Collectors.toList());
        // method 2
        List<Integer> positiveValues = numbers.stream()
                .filter(predicate -> predicate > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return positiveValues;
        
    }

}
