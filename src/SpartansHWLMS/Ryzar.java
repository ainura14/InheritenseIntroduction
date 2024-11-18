package SpartansHWLMS;

public class Ryzar extends Spartans{
    private String strength;//сила
    private String endurance;// выносливость

    public Ryzar(String name, int count, String strength, String endurance) {
        super(name, count);
        this.strength = strength;
        this.endurance = endurance;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getEndurance() {
        return endurance;
    }

    public void setEndurance(String endurance) {
        this.endurance = endurance;
    }

    public void charge() {
        System.out.println(getName() + " is charging with strength: " + strength);
    }

    @Override
    public String toString() {
        return "Ryzar: " + super.toString() +
                "\nstrength: " + strength;
    }
}
