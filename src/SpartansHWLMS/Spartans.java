package SpartansHWLMS;

public class Spartans {
    //Task 3
//    СПАРТАНЦЫ ДЕГЕН КЛАСС
//            ТУЗУНУЗ,
//    АНЫН ЛУЧНИКИ,РЫЦАРИ,
//            ВСАДНИКИ, ФИЛОСОФЫ
//    ДЕГЕН САБКЛАССТАРЫ БОЛСУН,
//    АР КИМДИН АР КАНДАЙ 2 ДЕН
//    ПОЛЯЛАРЫ БОЛСУН,
//    ЖАНА 2 ДЕН МЕТОДДОРУ БОЛСУН,
//    СПАРТАНЦЫ КЛАССЫНДА
//    БААРЫНА ТИЕШЕЛУУ NAME,
//    COUNT ДЕГЕН ПОЛЯЛАРЫ АНАН 1
//    МЕТОД
//    БОЛСУН(ЛЮБОЙ МЕТОД), БААРЫН
//    КОНСОЛЬГО
//    ЧЫГАРГЫЛА.
//    COUNT МЕНЕН СОРТИРОВКА
//    КЫЛГАН МЕТОД ТУЗУНУЗ
//    MAIN DEN
    private String name;
    private int count;

    public Spartans() {
    }

    public Spartans(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "\nname: " + name +
                "\ncount: " + count;
    }
}
