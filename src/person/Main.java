package person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Кулинич Вячеслав Сергійович", 17);
        Person person2 = new Person();

        person2.setFullName("Орєхова Дана Вікторівна");
        person2.setAge(18);

        person1.move();
        person2.talk();
    }
}
