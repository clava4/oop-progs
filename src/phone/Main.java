package phone;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("+380686594320", "Apple", 188);
        Phone phone2 = new Phone("+380934465791", "Samsung");
        Phone phone3 = new Phone();

        phone2.setWeight(222);

        phone3.setNumber("+380979134267");
        phone3.setModel("Xiaomi");
        phone3.setWeight(196);

        System.out.println(phone1.getModel() + " " + phone1.getNumber() + " with weight " + phone1.getWeight());
        System.out.println(phone2.getModel() + " " + phone2.getNumber() + " with weight " + phone2.getWeight());
        System.out.println(phone3.getModel() + " " + phone3.getNumber() + " with weight " + phone3.getWeight());
        System.out.println();

        phone1.receiveCall("Slavik");
        System.out.println(phone1.getNumber());
        System.out.println();
        phone2.receiveCall("Vlad");
        System.out.println(phone2.getNumber());
        System.out.println();
        phone3.receiveCall("David");
        System.out.println(phone3.getNumber());
        System.out.println();
        phone1.receiveCall("Olga", "+380973461097");
        System.out.println();
        phone1.sendMessage("Hi!", "+380979134267", "+380686594320", "+380934465791");

    }
}
