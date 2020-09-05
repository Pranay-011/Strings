import java.util.Arrays;
public class GetChar {
    public static void main(String[] args) {
        String s = "hello";
        char[] c= new char[10];
        s.getChars(0,3,c,2);
        System.out.println(Arrays.toString(c));

    }
}