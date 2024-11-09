package Transport;

public class Transport {
    private String name;
    private String model;

    public Transport() {
    }

    public Transport(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
