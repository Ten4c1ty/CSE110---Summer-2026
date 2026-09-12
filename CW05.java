import java.util.Scanner;
public class CW05{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>=5) System.out.println("output: "+(x*x*3+2));
        else if(x >= 2) System.out.println("output: "+(x*x-1));
        else if(x >= 0) System.out.println("output: "+(x+1));
        else System.out.println("output: " + 2*x);
        sc.close();// OPTIONAL
        // sc.next --> always creates a new line after taking input. [Beautification of code]
    }
}
