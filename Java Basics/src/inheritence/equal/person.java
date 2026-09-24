package inheritence.equal;

import java.util.Objects;

public class person {
    private String name;
    private int age;
    private String id;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof person)){
            return false;
        }
        person  Per = (person) obj;
        return Per.name.equals(name) && Per.age == age && Per.id.equals(id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }

    public person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
