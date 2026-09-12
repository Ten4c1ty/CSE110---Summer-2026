import java.util.Scanner;
public class CW04{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%100 == 0){
            if(a%400 == 0) System.out.println(a + " is a Leap Year");
            else System.out.println(a + " is not a Leap Year");
        }
        else if(a%4 == 0) System.out.println(a + " is a Leap Year");
        else System.out.println(a + " is not a Leap Year");
        sc.close();// OPTIONAL
        // sc.next --> always creates a new line after taking input. [Beautification of code]
    }
}
