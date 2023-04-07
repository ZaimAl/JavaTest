package Method;
import java.util.Arrays;
public class Tugas {
    public static void main(String[] args) {
    String[] arrayString={"CAT", "ACT", "tac", "TCA", "aTC","CtA"};
    String a = arrayString[(int) (Math.random()*arrayString.length)];
    String b = arrayString[(int) (Math.random()*arrayString.length)];
        System.out.println("A= "+ a + " B= "+b);
        a = a.toLowerCase();
        b = b.toLowerCase();
        char [] charA = a.toCharArray();
        Arrays.sort(charA);
        String sortedA = new String(charA);
        char [] charB = b.toCharArray();
        Arrays.sort(charB);
        String sortedB = new String(charB);
        System.out.println(sortedA.equalsIgnoreCase(sortedB));
    }
    }
