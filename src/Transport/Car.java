package Transport;

public class Car extends Transport{
    private Double volume;
    private String category;

    public Car() {

    }

    public Car(String name, String model, Double volume, String category) {
        super(name, model);
        this.volume = volume;
        this.category = category;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Car{" +
                "volume=" + volume +
                ", category='" + category + '\'' +
                super.toString() +
                '}';
    }
}
