package AutoSalonHWLMS;

public class Lexus extends AutoSalon{
    private String model;

    public Lexus(String name, String address, String country, String model) {
        super(name, address, country);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nmodel: " + model;
    }
}
