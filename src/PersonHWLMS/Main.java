package PersonHWLMS;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Ainura", "Who coding", "Megacom");
        Dancer dancer = new Dancer("Mirgul", "who dancing", "Ajar danceGroup");
        Singer singer = new Singer("Gauhar", "who sing", "BigTeam");

        Person[] persons = new Person[] {programmer, dancer, singer};
        for (Person person : persons){
            System.out.println(person.toString());
            System.out.println("**************");
        }

    }
}
