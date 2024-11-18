package Transport;//08.11.2024
//Inheritens
//CRUD

import java.util.Arrays;

public class Main {
    static Transport[] transports = new Transport[0];
    public static void main(String[] args) {
//        Transport transport = new Transport("Flight", "A550");
//
//        Car car1 = new Car("Lexus", "570", 3.5, "B");
//        Car car2 = new Car("Lexus", "570", 3.5, "B");
//
//        Train train = new Train("DB", "S23", "to transfer people", "Mechanik");
//
//        Integer integer = Integer.valueOf(10);
//        String str = new String("str");
//
//
//        Transport[] transports = new Transport[]{car1, car2, train};
//        for (Transport transport1 : transports) {
//            System.out.println(transport1.toString());
//        }
//
//        Object[] objects = {str, integer, car1, car2, train, Arrays.toString(transports)};
//        for (Object object : objects) {
//            System.out.println(object);
//        }

        addNewTransport(new Car("Range rover", "230", 2.3, "B"));
        System.out.println(Arrays.toString(getAll()));
        addNewTransport(new Car("Toyota", "camry", 3.5, "B"));
        System.out.println(Arrays.toString(getAll()));
        Main main = new Main();
        System.out.println(Arrays.toString(main.getTransports()));
        System.out.println("--------------------------------------");
        deleteTransport("Range rover");
        System.out.println(Arrays.toString(getAll()));
        updateTransport("Toyota", new Car("Range rover", "230", 2.3, "B"));
        System.out.println(Arrays.toString(getAll()));


    }
        public static void addNewTransport(Transport transport){
        transports = Arrays.copyOf(transports, transports.length + 1);
        transports[transports.length - 1] = transport;
        }

        public static Transport[] getAll(){
            return transports;
        }
        //CRUD
        public static Transport[] getTransports(){
            return new Transport[]{
                    new Car("Toyota", "camry", 3.5, "B"),
                    new Car("Honda", "Cr-v", 2.2, "B"),
                    new Car("Lexus", "570", 3.5, "B")
            };
        }
        public static void deleteTransport(String name){
            for (int i = 0; i < transports.length; i++) {
                if (transports[i].getName().equals(name)) {
                    Transport[] newTransports = new Transport[transports.length - 1];
                    System.arraycopy(transports, 0, newTransports, 0, i);
                    System.arraycopy(transports, i + 1, newTransports, i, transports.length - i - 1);
                    transports = newTransports;
                }
            }
        }

        public static void updateTransport(String oldName, Transport newTransport){
            for (int i = 0; i < transports.length; i++) {
                if(transports[i].getName().equals(oldName)){
                    transports[i] = newTransport;
                }
            }
        }

}
