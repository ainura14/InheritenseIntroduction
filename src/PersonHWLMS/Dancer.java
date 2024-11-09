package PersonHWLMS;

public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void learn(){
        System.out.println("The dancer is always in the progress of learning");
    }
    public void walk(){
        System.out.println("The dancer walks when he has free time");
    }
    public void eat(){
        System.out.println("The dancer eats to be energetic");
    }
    public void dancing(){
        System.out.println("The dancer dancing to make money");
    }

    @Override
    public String toString() {
        return "Dancer: \n" + super.toString() +
        "\nGroup name: " + groupName;
    }
}
