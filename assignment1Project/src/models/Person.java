package models;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final boolean gender;
    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
    @Override
    public String toString() {
        String genderStr = (gender) ? "Male" : "Female";
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + genderStr + ".";
    }
}