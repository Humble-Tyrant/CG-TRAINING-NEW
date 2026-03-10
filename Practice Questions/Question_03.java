public class Question_03 {
    int isValidPassword(String password) {
        if(password.length()<4) return 0;
        if(Character.isDigit(password.charAt(0))) return 0;

        if(!password.matches(".*\\d.*")){
            return 0;
        }
        if(!password.matches(".*[A-Z].*")) return 0;
        if(password.indexOf(' ')!=-1 || password.indexOf('/')!=-1) return 0;
        return 1;


    }

    static void main(String[] args) {
        System.out.println(new Question_03().isValidPassword("a987 abc012"));
    }
}
