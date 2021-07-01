package person;

public class Main {

    public static void main(String[] args) {
        final Person person1 = new Person("Kulynych Vyacheslav Sergeevich", 17);
        final Person person2 = new Person();

        person2.setFullName("Orekhova Dana Viktorivna");
        person2.setAge(18);

        person1.move();
        person2.talk();
    }
}
