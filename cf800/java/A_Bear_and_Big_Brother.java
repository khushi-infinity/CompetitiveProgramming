package cf800;
import java.util.Scanner;

public class A_Bear_and_Big_Brother {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;

        while(a<=b){
            a = a * 3;
            b = b * 2;
            count++;
        }
        System.out.println(count);
    }
}