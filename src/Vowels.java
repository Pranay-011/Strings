/*
print the vowels in the input string.
*/
import java.util.Scanner;
public class Vowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = sc.nextLine();
        char ch ;
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'
                    || str.charAt(i)=='o' || str.charAt(i)=='u'||
                    str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'
                    ||str.charAt(i)=='O'|| str.charAt(i)=='U'){
                System.out.print(str.charAt(i));
                System.out.println(":"+i);

            }
            i++;
        }

    }
}