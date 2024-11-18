package AutoSalonHWLMS;

import java.time.LocalDate;

public class MersedesBenz extends AutoSalon{
    private String color;
    private LocalDate yearOfManufacture;

    public MersedesBenz(String name, String address, String country, String color, LocalDate yearOfManufacture) {
        super(name, address, country);
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(LocalDate yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncolor: " + color +
                "\nyearOfManufacture: " + yearOfManufacture;
    }
}
