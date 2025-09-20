/*
    1 1 1 1
    2 2 2 2
    3 3 3 3
    4 4 4 4

    n=4

    num of row =i =4
    num of col =j =4 
*/
import java.util.*;
public class patB {
    public static void main(String[] ares){
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
