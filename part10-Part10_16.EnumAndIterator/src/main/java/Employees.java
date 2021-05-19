
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> roster = new ArrayList<>();

    public void add(Person personToAdd) {
        this.roster.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(personToAdd -> add(personToAdd));
    }

    public void print() {
        roster.forEach(person -> System.out.println(person));
    }

    public void print(Education education) {
        Iterator<Person> iterator = roster.iterator();

        while (iterator.hasNext()) {
                Person inspected = iterator.next();
                if (inspected.getEducation() == education){
                    System.out.println(inspected);
                }
            }
        }
    }
