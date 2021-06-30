package student_aspirant; // TODO: rename to studentaspirant

public class Student {

    // TODO: all fields can be final
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

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
