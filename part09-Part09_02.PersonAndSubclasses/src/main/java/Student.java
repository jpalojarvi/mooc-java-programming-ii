
public class Student extends Person {
    private int studyCredits;

    public Student(String name, String address) {
        super(name, address);
    }
    
    public void study(){
        this.studyCredits++;
    }

    public int credits() {
        return this.studyCredits;
    }

}
