
public class Book {
    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }    

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.age + " year-olds or older)";
    }
    
    
}
