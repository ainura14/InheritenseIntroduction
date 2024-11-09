package Transport;

public class Train extends Transport{
    private String goal;
    private String type;

    public Train() {
    }

    public Train(String name, String model, String goal, String type) {
        super(name, model);
        this.goal = goal;
        this.type = type;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Train{" +
                "goal='" + goal + '\'' +
                ", type='" + type + '\'' +
                super.toString() +
                '}';
    }
}
