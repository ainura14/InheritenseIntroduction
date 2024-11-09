package InheritensIntroduction;

import java.math.BigDecimal;

public class MAin {
    public static void main(String[] args) {
        Device device = new Device("Deivce", "Model2", BigDecimal.valueOf(1200.00));
        device.setBrend("Device");
        device.setBrend("Model 1");
        device.setPrice(BigDecimal.valueOf(1000.00));

        Laptop laptop = new Laptop();
        laptop.setBrend("HP");
        laptop.setModel("I7");
        laptop.setPrice(BigDecimal.valueOf(790.00));
        laptop.setMemory(512.0);

        Laptop laptop1 = new Laptop("Asus", "Model", BigDecimal.valueOf(500.00));

        Phone phone = new Phone();
        phone.setBrend("Iphone");
        phone.setModel("Xs");
        phone.setPrice(BigDecimal.valueOf(250.00));
        phone.setColor("Grey");

        Phone phone1 = new Phone("Samsung", "S", BigDecimal.valueOf(900.00), "Black");

        Device[] devices = new Device[]{laptop, laptop1, phone, phone1};
        for(Device dev : devices){
            System.out.println(dev.toString());
        }
    }
}
