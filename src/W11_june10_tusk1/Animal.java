package W11_june10_tusk1;

public class Animal {

    enum Animals {
        TIGER(3),
        WOLF(5),
        CAT(2),
        DOG(4);

        private int age;

        Animals(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return name() + " (age: " + age + ")";
        }
    }
}
