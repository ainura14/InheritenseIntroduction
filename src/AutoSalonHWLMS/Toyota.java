package AutoSalonHWLMS;

public class Toyota extends AutoSalon{
    private int price;

    public Toyota(String name, String address, String country, int price) {
        super(name, address, country);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nprice: " + price;
    }
}
