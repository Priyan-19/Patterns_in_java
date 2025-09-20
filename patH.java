/*             
    5 5 5 5 5
    4 4 4 4
    3 3 3
    2 2
    1
    n=5
    OL =row =i=5
    IL =col =j=n-i+1
    print(pV)
*/
import java.util.*;
public class patH {
    public static void main(String arg[]){
    Scanner sc =new Scanner (System.in);
    int n = sc.nextInt();
    int pV=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(pV+" ");
        }
        pV--;
        System.out.println();
    }
}
}