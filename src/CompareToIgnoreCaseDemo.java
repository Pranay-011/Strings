public class CompareToIgnoreCaseDemo{
    public static void main(String[] args){
       String s="SHO";
       System.out.println("SHO".compareToIgnoreCase("sho"));
       //System.out.println("SHO".compareToIgnoreCase("Sho"));
       String str  = "A";
       System.out.println("A".compareToIgnoreCase("b"));
    }
}