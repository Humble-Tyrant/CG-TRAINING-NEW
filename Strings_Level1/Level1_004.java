package Strings_Level1;

class Level1_004 {

    static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: String is null");
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}

