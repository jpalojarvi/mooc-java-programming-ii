
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        System.out.println(read("pom.xml"));

    }

    public static List<String> read(String file) {
        List<String> readFile = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(row -> readFile.add(row));
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
        return readFile;
    }
// model solution
//        try {
//            return Files.lines(Paths.get(file)).collect(Collectors.toList());
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
//        return new ArrayList<>();
//    }
}
