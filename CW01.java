import java.util.Scanner;
public class CW01{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(); // Taking three numbers as input from user in a line
        // You can use if and else if statements without the required brackets "{}" as long as the scopes of the brackets contains only one action to do i.e. only one line of code to execute. The other rules must be maintained.
        if(a >= b && a >= c) System.out.println("Largest Number: " +a);
        else if(b >= a && b >= c) System.out.println("Largest Number: " +b);
        else System.out.println("Largest Number: " +c);
        sc.close();// OPTIONAL
        // sc.next --> always creates a new line after taking input. [Beautification of code]
    }
}
