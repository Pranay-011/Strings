
import java.util.Scanner;
public class AllChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string to input:");
        String str= sc.nextLine();
        int i=0;
        while(i<str.length()) {
            System.out.print(str.charAt(i));


            //  or i!= str.length()-1
            if (i<str.length()-1) {
                System.out.print(",");
            }
            i++;
        }
    }
}