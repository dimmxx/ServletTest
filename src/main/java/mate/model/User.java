package mate.model;

public class User {

    private String name;

    private int age;

    public User() {
        this.name = "Peter";
        this.age = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
