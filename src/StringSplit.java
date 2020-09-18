
import java.util.Arrays;
public class StringSplit{
    public static void main(String[] args){
        String str = new String("the-quick-brown-fox-jumps-over-the-lazy-dog");
        String [] a = str.split("-");
        for(String s:a){
            System.out.println(s);
        }
    }
}