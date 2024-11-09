package PersonHWLMS;

public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void learn(){
        System.out.println("The programmer is always in the progress of learning");
    }
    public void walk(){
        System.out.println("The programmer walks when he has free time");
    }
    public void eat(){
        System.out.println("The programmer eats to be energetic");
    }
    public void coding(){
        System.out.println("The programmer codes to make money");
    }

    @Override
    public String toString() {
        return "Programmer: \n" + super.toString() +
                "\nCompany name: " + companyName;
    }
}
