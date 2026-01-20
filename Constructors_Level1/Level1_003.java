package Constructors_Level1;

public class Level1_003 {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        Person(Person p) {
            this.name = p.name;
            this.age = p.age;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person(p1);

        System.out.println(p2.name + " " + p2.age);
    }
}

