package Methods_Level1;
import java.util.Scanner;
public class Level1_006 {
    String checkSpringSeason(int date, int month) {

        if (month < 1 || month > 12 || date < 1) {
            return "Invalid date";
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && date > 30) {
            return "Invalid date";
        }

        if (month == 2 && date >29) {
            return "Invalid date";
        }

        if ((month == 3 && date >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && date <= 20)) {
            return "Its a Spring Season";
        }

        return "Not a Spring Season";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Level1_006 obj = new Level1_006();
        int date = sc.nextInt();
        int month = sc.nextInt();
        System.out.println(obj.checkSpringSeason(date,month));
        sc.close();
    }

}
