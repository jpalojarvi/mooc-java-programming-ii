
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Employees tt = new Employees();
        
        tt.add(new Person("Arto", Education.PHD));
//        NoSuchElementException, in call print(PHD). Check education 
Employees t = new Employees(); 
Person h = new Person("Arto", Education.PHD); 
t.add(h); 
t.print(Education.PHD); 
//output should contain "Arto, PHD
    }
}
