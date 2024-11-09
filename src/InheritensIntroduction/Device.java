package InheritensIntroduction;

import java.math.BigDecimal;

public class Device {
    private String brend;
    private String model;
    private BigDecimal price;

    public Device() {
    }

    public Device(String brend, String model, BigDecimal price) {
        this.brend = brend;
        this.model = model;
        this.price = price;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

//    public void showInfo(){
//        System.out.println("brend: " + brend);
//        System.out.println("model: " + model);
//        System.out.println("price: " + price);
//    }


    @Override
    public String toString() {
        return "Device{" +
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
