/*             
    1 2 3 4 5
    1 2 3 4 
    1 2 3
    1 2 
    1
    n=5
    OL =row =i=5
    IL =col =j=n-i+1
    print(pV)
*/
import java.util.*;
public class patI {
    public static void main(String arg[]){
    Scanner sc =new Scanner (System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
}