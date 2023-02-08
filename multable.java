import java.util.*;
public class Main  {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int m,n;
        System.out.print("enter the starting number:- ");
        m = input.nextInt();
        System.out.print("enter the endin number:- ");
        n = input.nextInt();
        if(m<0 && n<0)
            fun1(m,n);
        else
            fun2(m,n);
    }
    public static void fun1(int m,int n){
        int i;
        for(i=-1;i>=n;i--){
            System.out.println(i+"*"+m+"="+(i*m));
        }
    }
    public static void fun2(int m,int n){
        int i;
        for(i=1;i<=n;i++){
            System.out.println(i+"*"+m+"="+(i*m));
        }
    }
}
