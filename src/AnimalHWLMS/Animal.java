package AnimalHWLMS;

public class Animal {
    // Task 1
//    Animals деген класс тузобуз
//    полелери (name,gender, age) жана
//    аны мурастаган Sheep (color) and Tiger (number)
//    болот ушуларды main чакырып маани беребиз

    private String name;
    private char gender;
    private int age;

    public Animal() {
    }

    public Animal(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "\nname: " + name +
                "\ngender: " + gender +
                "\nage: " + age;
    }
}
