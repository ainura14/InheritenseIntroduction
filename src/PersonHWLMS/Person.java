package PersonHWLMS;

public class Person {
    private String name;
    private String designation;
    public Person(){}

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public void learn(){}
    public void walk(){

    }
    public void eat(){}

    @Override
    public String toString() {
        return "Name: " + name + "\nDesignation: " + designation;
    }
}
