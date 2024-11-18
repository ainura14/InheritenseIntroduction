package AnimalHWLMS;

public class Tiger extends Animal{
    private int number;

    public Tiger(String name, char gender, int age, int number) {
        super(name, gender, age);
        this.number = number;
    }

    @Override
    public String toString() {
        return "Tiger: " + super.toString() +
                "\nnumber: " + number;
    }
}
