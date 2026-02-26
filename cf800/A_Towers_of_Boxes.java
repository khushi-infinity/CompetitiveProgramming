package cf800;
import java.util.Scanner;

public class A_Towers_of_Boxes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n= sc.nextInt();
            int m=sc.nextInt();
            int d = sc.nextInt();

           int maxHeight = (d / m) + 1;
            
            int towers = (n + maxHeight - 1) / maxHeight; 
            
            System.out.println(towers);
        


        }
    }
}