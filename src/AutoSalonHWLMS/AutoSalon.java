package AutoSalonHWLMS;

public class AutoSalon {
    // Task 2
//    Авто салон деген класс
//    ачабыз анын полелери
//            (name, address, country,
//             numberCar) болсун, аны
//    мурастаган 2-3 класс
//    болсун жана (model,price,
//                 color,год выпуска)
//    ушулар созсуз болсун
//    жана main маани
//    беребиз 4 аз болбосун !!
    private String name;
    private String address;
    private String country;
    private int numberCar;

    public AutoSalon(String name, String address, String country) {
        this.name = name;
        this.address = address;
        this.country = country;
        numberCar++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(int numberCar) {
        this.numberCar = numberCar;
    }

    @Override
    public String toString() {
        return "AutoSalon - " +
                "\nname: " + name +
                "\naddress: " + address +
                "\ncountry: " + country;
    }
}
