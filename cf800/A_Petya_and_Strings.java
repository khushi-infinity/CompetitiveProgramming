package cf800;
import java.util.Scanner;

public class A_Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

       int n=  a.compareToIgnoreCase(b);

       if(n>0){
        System.out.println(1);
       }else if(n<0){
        System.out.println(-1);
       }else{
        System.out.println(0);
       }

       
    }
}
