package InheritensIntroduction;

import java.math.BigDecimal;

public class Laptop extends Device{
    private Double memory;
    public Laptop(){}

    public Laptop(String brend, String model, BigDecimal price) {
        super(brend, model, price);
    }

    public Double getMamory() {
        return memory;
    }
    public void setMemory(Double memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "memory=" + memory +
                super.toString() +
                '}';
    }
}
