
public class Population implements Comparable<Population> {

    private String country;
    private int year;
    private String gender;
    private double literacyPercentage;

    public Population(String country, int year, String gender, double literacyPercentage) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacyPercentage = literacyPercentage;

    }

    public double getLiteracyPercentage() {
        return literacyPercentage;
    }

    @Override
    public int compareTo(Population o) {
        if (this.getLiteracyPercentage() < o.getLiteracyPercentage()) {
            return -1;
        } else if (this.getLiteracyPercentage() > o.getLiteracyPercentage()) {
            return 1;
        } else {
            return 0;
        }
    }

}
