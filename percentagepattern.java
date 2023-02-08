import java.util.*;  
public class Main  
{
public static void main(String args[])   
{   
Scanner sc= new Scanner(System.in); 
System.out.print("Input a character: ");  
char a = sc.next().charAt(0);
System.out.println("Enter row:");
int row = sc.nextInt();
for(int i=0; i<row; i++)   
{ 
    for(int j=0; j<=i; j++)   
{ 
    System.out.print(a);   
} 
System.out.println();   
}   
}   
}
