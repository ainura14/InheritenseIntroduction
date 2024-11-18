package AutoSalonHWLMS;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Lexus lexus = new Lexus("Lexus", "Nieuwe Kerk", "Amsterdam", "RX");
        MersedesBenz mers = new MersedesBenz("MersedesBenz", "Berlin", "Germany","Black", LocalDate.of(2022, 02, 2));
        Toyota toyota = new Toyota("Toyota", "Tokyo", "Japonya", 16000);
        AutoSalon[] autoSalons = { lexus, mers, toyota};
        for (AutoSalon autoSalon : autoSalons) {
            System.out.println(autoSalon.toString());
        }

    }
}
