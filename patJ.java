/*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
    n=5

    outer loop =row times=(n*2)-1;
    inner loop =col times=row or row-1
*/
import java.util.Scanner;
public class patJ{
    public static void main(String arg[]){
        Scanner sc =new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=1;i<=(n*2)-1;i++){
            int rV=i>n?(n*2)-i:i;
            for(int j=1;j<=rV;j++){
                System.out.print("*");
            }
        System.out.println();
        }    
    }
}
