package cf800;
import java.util.*;

public class A_Cover_in_Water {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            boolean te = false;
            int count = 0;

           for (int i = 0; i < n; i++) { 
				if (s.charAt(i) == '.' && i + 1 < n && s.charAt(i + 1) == '.' && i + 2 < n && s.charAt(i + 2) == '.') {
					te = true; 
					break; 
				}
				if (s.charAt(i) == '.') {
					count++;
				}

			}


            if (te) {
				System.out.println(2);
			} else {
				System.out.println(count);
			}

        }


    }
}

