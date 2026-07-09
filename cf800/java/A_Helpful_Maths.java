package cf800;
import java.util.*;

public class A_Helpful_Maths {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int[] arr= new int[3];
        Arrays.fill(arr,0);

        int count = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                arr[0] = arr[0] +1;
            }else if(s.charAt(i)=='2'){
                arr[1] = arr[1] + 1;
            }else if(s.charAt(i)=='3'){
                arr[2] = arr[2] + 1;
            }else{
                count++;
            }
        }

       

for(int i =0;i<arr[0];i++){
    System.out.print("1");
    if((arr[0]-i)>1 || arr[1]>0 || arr[2]>0){
System.out.print("+");
    }
}

for(int i=0;i<arr[1];i++){
    System.out.print("2");
    if((arr[1]-i)>1 || arr[2]>0){
System.out.print("+");
    }
}

for(int i=0;i<arr[2];i++){
    System.out.print("3");
    if((arr[2]-i)>1){
System.out.print("+");
    }
}


    
}
}

/*

method 2 

import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
String s =sc.next();

String[] parts = s.split("\\+");

Arrays.sort(parts);

System.out.println(String.join("+", parts));
}
}
 */