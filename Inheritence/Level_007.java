package Inheritence;

class Person {
    private int age;

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }
}

public class Level_007 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(20);
        System.out.println(p.getAge());
    }
}


