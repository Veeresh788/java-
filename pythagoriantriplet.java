
import java.util.*;
public class PythogerenTriplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the limit:- ");
        int num = input.nextInt();
        int i = 1;

        while(i<=num){
            double sq = Math.pow(i,2);
            double div = sq/2;
            System.out.println(i+" "+Math.floor(div)+" "+Math.ceil(div));
            i++;

        }
    }
}
