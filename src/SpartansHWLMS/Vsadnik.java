package SpartansHWLMS;

public class Vsadnik extends Spartans{
    private String weapon; // оружие
    private String tactic; // тактика

    public Vsadnik(String name, int count, String weapon, String tactic) {
        super(name, count);
        this.weapon = weapon;
        this.tactic = tactic;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getTactic() {
        return tactic;
    }

    public void setTactics(String tactic) {
        this.tactic = tactic;
    }

    public void ride() {
        System.out.println(getName() + " is riding with tactic: " + tactic);
    }

    @Override
    public String toString() {
        return "Vsadnik: " + super.toString() +
                "\nweapon: " + weapon +
                "\ntactics: " + tactic;
    }
}
