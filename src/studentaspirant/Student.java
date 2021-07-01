package studentaspirant;

public class Student {

    private final String firstName;
    private final String lastName;
    private final String group;
    private final double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }


    public int getScholarship() {
        return getAverageMark() == 5 ? 100 : 80;
    }
}
