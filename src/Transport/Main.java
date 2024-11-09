package Transport;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport("Flight", "A550");

        Car car1 = new Car("Lexus", "570", 3.5, "B");
        Car car2 = new Car("Lexus", "570", 3.5, "B");

        Train train = new Train("DB", "S23", "to transfer people", "Mechanik");

        Integer integer = Integer.valueOf(10);
        String str = new String("str");



        Transport[] transports = new Transport[]{car1, car2, train};
        for(Transport transport1 : transports){
            System.out.println(transport1.toString());
        }

        Object[] objects = {str, integer, car1, car2,train, Arrays.toString(transports)};
        for(Object object : objects){
            System.out.println(object);

        }

    }
}
