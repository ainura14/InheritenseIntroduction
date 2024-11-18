package AnimalHWLMS;

public class Main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("Choik", 'F', 2, "grey");
        Tiger tiger = new Tiger("Raf", 'M', 3, 2);
        System.out.println(sheep.toString());
        System.out.println(tiger.toString());
    }
}
