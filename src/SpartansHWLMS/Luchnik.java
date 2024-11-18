package SpartansHWLMS;

public class Luchnik extends Spartans{
    private int range;
    private int accuracy;

    public Luchnik(String name, int count, int range, int accuracy) {
        super(name, count);
        this.range = range;
        this.accuracy = accuracy;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void shoot() {
        System.out.println(getName() + " is shooting with accuracy: " + accuracy);
    }

    @Override
    public String toString() {
        return "Luchnik: " + super.toString() +
                "\nrange: " + range +
                "\naccuracy:" + accuracy;
    }
}
