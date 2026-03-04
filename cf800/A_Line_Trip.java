package cf800;
import java.util.*;
public class A_Line_Trip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            arr[0] = sc.nextInt();
            int max = arr[0];

            for(int i=1;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i] - arr[i-1] > max){
                    max = arr[i] - arr[i-1];
                } 
                
                
                    }


                    if(((x - arr[n-1])*2) > max){
                        max = (x - arr[n-1])*2;
                    }

                    System.out.println(max);
        }
    }
}