package student_aspirant;

public class Aspirant extends Student {
    String work;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    @Override
    public int getScholarship() {
        return getAverageMark() == 5 ? 200 : 180;
    }
}
