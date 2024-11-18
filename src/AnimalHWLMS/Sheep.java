package AnimalHWLMS;

public class Sheep extends Animal{
    private String color;

    public Sheep(String name, char gender, int age, String color) {
        super(name, gender, age);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep: " + super.toString() +
                "\ncolor: " + color;
    }
}
