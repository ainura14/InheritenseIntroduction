package SpartansHWLMS;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Spartans luchnik = new Luchnik("Leonidas", 4, 2, 3);
        Spartans philosopher = new Philosopher("Socrates", 5, "Analytical thinking", "Truth");
        Spartans ryzar = new Ryzar("Achilles", 7, "Middle strength", "High endurance");
        Spartans vsadnik = new Vsadnik("Xerxes", 9, "Spear", "Cavalry charge");

        Spartans[] spartans = {luchnik, philosopher, ryzar, vsadnik};

        for (int i = 0; i < spartans.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < spartans.length; j++) {
                if (spartans[j].getCount() < spartans[minIndex].getCount()) {
                    minIndex = j;
                }
            }
            Spartans temp = spartans[i];
            spartans[i] = spartans[minIndex];
            spartans[minIndex] = temp;
        }
        for (Spartans spartan : spartans) {
            System.out.println(spartan.toString());
            System.out.println("------------------");
        }



    }
}
