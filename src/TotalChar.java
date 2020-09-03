/*
print the total number of characters in the string input by user
*/
import java.util.Scanner;
public class TotalChar{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a string:");
        String str= sc.nextLine();
        int i;
        i=0;
        while(i<str.length()){
            i++;
        }
        System.out.println("total characters in string:"+(i));
    }
}