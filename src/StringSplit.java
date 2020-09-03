
import java.util.Arrays;
public class StringSplit{
    public static void main(String[] args){
        String str = new String("the quick brown fox jumps over the lazy dog");
        String [] a = str.split("@");
        System.out.println(a);
        System.out.println(Arrays.toString(a));
    }
}