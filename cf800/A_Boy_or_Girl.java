package cf800;
import java.util.HashSet;
import java.util.Scanner;

public class A_Boy_or_Girl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        HashSet<Character> chr = new HashSet<>();

        for(int i=0;i<a.length();i++){
            chr.add(a.charAt(i));
        }

        int len = chr.size();


        if(len%2!=0){
            System.out.println("IGNORE HIM!");
        }else{
            System.out.println("CHAT WITH HER!");
        }
    }
}