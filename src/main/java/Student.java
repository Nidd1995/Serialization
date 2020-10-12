import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {

    private String name;
    private int age;

     static  String school;
    private transient List<String> skills;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                '}';
    }

    public Student(String name, int age, String school, List<String> skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
        this.school = school;
    }
}
