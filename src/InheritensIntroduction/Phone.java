package InheritensIntroduction;

import java.math.BigDecimal;

public class Phone extends Device{
    private String color;

    public Phone() {
    }

    public Phone(String brend, String model, BigDecimal price, String color) {
        super(brend, model, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "color='" + color + '\'' +
                super.toString() +
                '}';
    }
}
