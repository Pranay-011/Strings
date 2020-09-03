public class StrConcat{
    public static void main(String[] args){
        String s = "hello" +10 +20;
        System.out.println("concat output 1:"+s);

        String s1 = 10+20+"hello";
        System.out.println("concat output 2:"+s1);
    }
}