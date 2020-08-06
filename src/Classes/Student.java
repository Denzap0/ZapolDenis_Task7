package Classes;

public class Student implements Comparable<String> {

    protected String name;
    protected int mark, age;

    public Student() {
        this.name = "Vasya";
        this.mark = 8;
        this.age = 15;
    }

    public Student(String name, int mark, int age) {
        this.name = name;
        this.mark = mark;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int compareTo(String name) {
        if (this.name.length() < name.length()) {
            return -1;
        }
        if (this.name.length() > name.length()) {
            return 1;
        }
        return 0;
    }


}
