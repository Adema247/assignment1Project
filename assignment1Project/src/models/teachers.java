package models;

public final class teachers extends Person {
    private final String subject;
    private int salary;
    public teachers(String name, String surname, int age, boolean gender, String subject, int ignoredYears, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.salary = salary;
    }
    public void giveRaise(double percentage) {
        salary += (int) (salary * percentage / 100);
    }
    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + " with a salary of " + salary + ".";
    }
}


