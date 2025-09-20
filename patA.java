/* 
***** 
*****
*****
*****
*****
outer loop = row times = i =5
inner loop = col times = j =5
*/
import java.util.Scanner;
class PatA{
    public static void main(String agr[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}