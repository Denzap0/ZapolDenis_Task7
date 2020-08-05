package Classes;

public class Student implements Comparable<String>{

    private String name;
    private int mark, age;

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

    @Override
    public int compareTo(String o) {
        if(this.name.length() < o.length()){
            return -1;
        }
        if(this. name.length() > o.length()){
            return 1;
        }
        return 0;
    }


}
