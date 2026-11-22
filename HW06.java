import java.util.Scanner;
public class HW06 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = sc.nextInt();
        String s = "";
        if(num1 == num2 && num2 == num3) s = "All numbers are equal";
        if(num1 != num2 && num2 != num3 && num3 != num1) s = "All numbers are different";
        else s = "Neither all are equal or different";
        System.out.println(s);
        sc.close();
    }
}
