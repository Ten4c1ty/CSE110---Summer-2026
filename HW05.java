import java.util.Scanner;
public class HW05 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount the customer need to pay(Taka)");
        int pay = sc.nextInt();
        System.out.println("Enter the amount, customer gave(Taka)");
        int gave = sc.nextInt();
        int change = gave-pay;
        if( change > 0) {
            System.out.println("The returned amount is "+change+" taka.");
            System.out.println("100 taka note: "+change/100);
            change = change%100;
            System.out.println("50 taka note: "+change/50);
            change = change%50;
            System.out.println("20 taka note: "+change/20);
            change = change%20;
            System.out.println("10 taka note: "+change/10);
            change = change%10;
            System.out.println("5 taka note: "+change/5);
            change = change%5;
            System.out.println("2 taka note: "+change/2);
            change = change%2;
            System.out.println("1 taka note: "+change/1);
        }
        else if ( change == 0) System.out.println("The returned amount is 0 taka.");
        else System.out.println("Please pay "+(-change)+" taka more.");
        sc.close();
    }
}
