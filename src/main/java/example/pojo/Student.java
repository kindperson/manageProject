package example.pojo;

import java.io.Serializable;

/**
 * @author: wb-tjh438466
 * @date: 2018/8/10
 * @since: 1
 * description:
 */
public class Student implements Serializable {
    private String name;

    private String grade;

    private String id;

    private int age;

    private String score;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
