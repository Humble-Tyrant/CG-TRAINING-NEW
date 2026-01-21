package Inheritence;

class Secure {
    final void access() {
        System.out.println("Secure access");
    }
}

class User extends Secure {
}

public class Level_005 {
    public static void main(String[] args) {
        User u = new User();
        u.access();
    }
}


