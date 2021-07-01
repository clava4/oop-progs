package studentaspirant;

public class Main {

    public static void main(String[] args) {
        final Student student = new Student("Slavik", "Kulynych", "1-B", 5);

        final Aspirant aspirant1 = new Aspirant("Sasha", "Kulynych", "4-I", 4.5, "programmer");
        final Student aspirant2 = new Aspirant("Dana", "Orekhova", "1-B", 4.8, "teacher");

        final Student[] students = {student, aspirant1, aspirant2};
        for (Student s : students) {
            System.out.println(s.getScholarship());
        }
    }
}
