import java.util.*;
public class validusername 
{
public static void main(String[] args)
{
String s1,s2;
System.out.println("enter the user name:");
Scanner sc=new Scanner(System.in);
s1 = sc.nextLine();
System.out.println("re-enter the user name:");
s2 = sc.nextLine();
if(s1.equals(s2))
{
System.out.println("User name is valid");
}
 else
{
System.out.println("user name is invalid");
}
}
}
