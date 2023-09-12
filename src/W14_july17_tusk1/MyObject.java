package W14_july17_tusk1;

import java.io.Serializable;

public class MyObject implements Serializable {
    private String name;
    private int age;

    public MyObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyObject [name=" + name + ", age=" + age + "]";
    }
}
