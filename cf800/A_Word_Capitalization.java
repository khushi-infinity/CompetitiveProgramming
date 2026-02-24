package cf800;
import java.util.*;

public class A_Word_Capitalization {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.next();

       char ch = Character.toUpperCase(s.charAt(0));

     System.out.println(ch + s.substring(1));
    }
}