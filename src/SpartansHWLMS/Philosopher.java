package SpartansHWLMS;

public class Philosopher extends Spartans{
    private String thinkingStyle;
    private String mainPhilosophy;

    public Philosopher(String name, int count, String thinkingStyle, String mainPhilosophy) {
        super(name, count);
        this.thinkingStyle = thinkingStyle;
        this.mainPhilosophy = mainPhilosophy;
    }

    public String getThinkingStyle() {
        return thinkingStyle;
    }

    public void setThinkingStyle(String thinkingStyle) {
        this.thinkingStyle = thinkingStyle;
    }

    public String getMainPhilosophy() {
        return mainPhilosophy;
    }

    public void setMainPhilosophy(String mainPhilosophy) {
        this.mainPhilosophy = mainPhilosophy;
    }

    public void think() {
        System.out.println(getName() + " is thinking in style: " + thinkingStyle);
    }

    @Override
    public String toString() {
        return "Philosopher: " + super.toString() +
                "\nthinkingStyle: " + thinkingStyle +
                "\nmainPhilosophy: " + mainPhilosophy;
    }
}
