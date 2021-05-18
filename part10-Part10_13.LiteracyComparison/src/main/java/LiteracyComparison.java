
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison implements Comparable<Population>{
    
    public static void main(String[] args) {
        ArrayList<Population> populations = new ArrayList<>();
     try {
         // reading the file line by line
         Files.lines(Paths.get("literacy.csv"))
         // splitting the rows into parts seperated by commas
                 .map(row -> row.split(","))
                 // deleting the rows that have less than three parts, as we need all the data
                 .filter(parts -> parts.length >= 3)
                 // creating Populations from the parts
                 .map(parts -> new Population(parts[3], Integer.valueOf(parts[4]), parts[2], Double.valueOf(parts[5])))
                 // and finally add the Population to the list
                 .forEach(Population -> populations.add(Population));
                 ;
     }   catch (Exception e){
         System.out.println("Error: " + e);
     }
    }

    @Override
    public int compareTo(Population o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
