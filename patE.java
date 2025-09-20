
/*
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
    n=5
    OL =row =i=5
    IL =col =j=row(i)
    print(printValue)
*/
import java.util.*;
public class patE {
    public static void main(String arg[]){
    Scanner sc =new Scanner (System.in);
    int n = sc.nextInt();
    int printValue=1;
    for(int i=1;i<=n;i++){
        printValue= i%2==0?0:1;
        for(int j=1;j<=i;j++){
            System.out.print(printValue+" ");
            printValue= printValue==0?1:0;
        }
        System.out.println();
    }
}
}