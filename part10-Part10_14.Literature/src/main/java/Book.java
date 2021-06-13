
public class Book implements Comparable<Book> {

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

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Book o) {
        if (this.getAge() > o.getAge()) {
            return 1;
        }
        if (this.getAge() < o.getAge()) {
            return -1;
        }
        return 0;
    }
}
