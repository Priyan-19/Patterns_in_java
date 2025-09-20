/*
         *
        **
       ***
      ****
     *****
    n=5

    outer loop =row times=5;
    inner loop =col times=
*/

import java.util.Scanner;
public class patK{
    public static void main(String arg[]){
        Scanner sc =new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

        System.out.println();
        }    
    }
}