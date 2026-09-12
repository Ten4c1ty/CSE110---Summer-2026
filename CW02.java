import java.util.Scanner;
public class CW02{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a <= 100 && a >= 90) System.out.println("Your grade is A");
        if(a <= 89 && a >= 85) System.out.println("Your grade is A-");
        if(a <= 84 && a >= 70) System.out.println("Your grade is B");
        if(a <= 69 && a >= 57) System.out.println("Your grade is C");
        if(a <= 56 && a >= 50) System.out.println("Your grade is D");
        if(a < 50) System.out.println("Your grade is F");
        sc.close();// OPTIONAL
        // sc.next --> always creates a new line after taking input. [Beautification of code]
    }
}
