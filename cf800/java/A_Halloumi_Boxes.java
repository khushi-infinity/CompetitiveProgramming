package cf800;
import java.util.*;

public class A_Halloumi_Boxes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Long[] arr = new Long[(int)n];

            for(int i=0;i<n;i++) {
                arr[i] = sc.nextLong();
            }

            Long[] copy_a = Arrays.copyOf(arr, arr.length);
            Arrays.sort(copy_a);

            if(Arrays.equals(copy_a, arr) || k>1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


        }
    }
}