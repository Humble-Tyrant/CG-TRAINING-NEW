package Methods_Level2;
import java.util.Scanner;
public class Level2_008 {
    void checkYoungest(int amarAge,int anthonyAge,int akbarAge){
        if(amarAge<anthonyAge && amarAge<akbarAge){
            System.out.println("Amar is YOUNGEST");
        }
        else if(amarAge>anthonyAge && anthonyAge<akbarAge){
            System.out.println("Anthony is YOUNGEST");
        }
        else{
            System.out.println("Akbar is YOUNGEST");
        }
    }
    void checkTallest(int amarHeight,int anthonyHeight,int akbarHeight){
        if(amarHeight>anthonyHeight && amarHeight>akbarHeight){
            System.out.println("Amar is TALLEST");
        }
        else if(amarHeight<anthonyHeight && anthonyHeight>akbarHeight){
            System.out.println("Anthony is TALLEST");
        }
        else{
            System.out.println("Akbar is TALLEST");
        }
    }
    public static void main(String[] args){
        Level2_008 l = new Level2_008();
        Scanner sc = new Scanner(System.in);
        int amarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        l.checkYoungest(amarAge,anthonyAge,akbarAge);
        int amarHeight = sc.nextInt();
        int anthonyHeight = sc.nextInt();
        int akbarHeight = sc.nextInt();
        l.checkTallest(amarHeight,anthonyHeight,akbarHeight);
        sc.close();

    }
}
