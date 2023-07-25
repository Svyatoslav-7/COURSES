package W7_may8_tusk1;

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("Який "+fullName+" рухається");
    }

    public void talk() {
        System.out.println("Який Person говорить");
    }
}
