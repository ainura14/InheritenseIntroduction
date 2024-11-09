package PersonHWLMS;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void learn(){
        System.out.println("The singer is always in the progress of learning");
    }
    public void walk(){
        System.out.println("The singer walks when he has free time");
    }
    public void eat(){
        System.out.println("The singer eats to be energetic");
    }
    public void singing(){
        System.out.println("The singer singing to make money");
    }
    public void playGuitar(){
        System.out.println("The singer can play guitar");
    }

    @Override
    public String toString() {
        return "Singer: \n" + super.toString() +
                "\nBand name: " + bandName;
    }
}
