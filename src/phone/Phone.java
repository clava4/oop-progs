package phone;

public class Phone {

    private String number;
    private String model;
    private double weight;

    //constructors
    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    //getters and setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //methods
    void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Calling " + name + System.lineSeparator() + number);
    }

    void sendMessage(String message, String... numbers) {
        System.out.println("Message: " + "'" + message + "'" + " was send to phone numbers: ");
        for (String number : numbers) {
            System.out.println(number);
        }
    }

}
