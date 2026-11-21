import java.util.Scanner;
public class HW04 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(); // if you write int a, b, c = sc.nextInt();, a and b will be 0 and c will get the input
        if(a == b && b == c) System.out.println("This is an Equilateral Triangle");
        else if(a == b || b == c || a == c) System.out.println("This is an Isosceles Triangle");
        else System.out.println("This is a Scalene Triangle");
        sc.close();
    }
}
