
import java.util.*;
 class reverse {
  public static void main(String[] args) {
        String rev="";
    Scanner s1 = new Scanner(System.in); 
    System.out.println("Enter a string");
     String n = s1.nextLine();   
    String reversedString = "";
    for(int i = n.length(); i>0; --i){
      rev=rev+(n.charAt(i-1));
    }
    
    System.out.println(rev);
 }
}