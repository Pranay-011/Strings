
import java.util.Scanner;
public class EqualsIgnoreCase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s1 = sc.nextLine();
        System.out.println("enter the another string:");
        String s = sc.nextLine();
        if(s1.equalsIgnoreCase(s)){
            System.out.println("roasted potato");
        }
        else{
            System.out.println("dafa ho jao");
        }

    }
}