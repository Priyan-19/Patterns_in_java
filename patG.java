
/*             
    *****      
    ****   
    ***
    **
    *
    n=5
    OL =row =i=5
    IL =col =j=n-i+1
    print(*)
*/
import java.util.*;
public class patG {
    public static void main(String arg[]){
    Scanner sc =new Scanner (System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}