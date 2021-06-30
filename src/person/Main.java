package person;

public class Main {

    public static void main(String[] args) {
        // TODO: use english, not ukrainian
        final Person person1 = new Person("Кулинич Вячеслав Сергійович", 17);
        final Person person2 = new Person();

        // TODO: use english, not ukrainian
        person2.setFullName("Орєхова Дана Вікторівна");
        person2.setAge(18);

        person1.move();
        person2.talk();
    }
}
