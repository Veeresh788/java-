import java.util.*;
public class Primenth {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter the perticular number:-"); // getting the perticular position value
        int number = input.nextInt();
        Another obj = new Another(number); // using the constructor
        int count1 = 0,i=2;
        /*
            below piece of code is used to get the percular position prime number
         */
        while(true){

            int j = 2;
            int count = 0;
            while(j<i){
                if(i%j==0){
                    count++;
                }
                j++;
            }
            if(count==0)
                count1++;

            if(count1==number) {
                System.out.println(i);
                break;
            }
            i++;
        }
        System.out.println("the next "+number+" prime numbers  after "+i+" are:-");
        obj.show(i+1); // if the number is found sending to show method to get next values
    }
}

class Another{
    int number = 0;
    public Another(int num){
        number = num; // assing the user input by using the constructor
    }
    /*
    this method is used to get the next prime numbers based on the input user
     */
    public void show(int num){
        int count1 = 0;
        while(true){
            int count = 0,j = 2;
            while(j<num){
                if(num%j==0)
                    count++;
                j++;
            }
            if(count==0){
                System.out.println(num);
                count1++;
            }
            if(count1==number){
                break;
            }
            num++;
        }
    }
}
