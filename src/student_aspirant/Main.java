package student_aspirant;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Slavik", "Kulynych", "1-B", 5);
        Aspirant aspirant1 = new Aspirant("Sasha", "Kulynych",
                "4-I", 4.5, "programist");
        Student aspirant2 = new Aspirant("Dana", "Orekhova",
                "1-B", 4.8, "teacher");

        Student[] students = {student, aspirant1, aspirant2};
        for (Student s : students) {
            System.out.println(s.getScholarship());
        }

    }
}
