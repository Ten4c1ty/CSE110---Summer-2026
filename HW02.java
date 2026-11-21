import java.util.Scanner;
public class tutorial {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Electricity Consumed: ");
        int elecon= sc.nextInt();
        double total = elecon*15.0;
        if(age < 18) total = total - (double)(20.0/100*total);// Mathematically can also write total = .8*total
        else if(age > 60) total = total - (10.0/100*total);// Mathematically can also write total = .9*total
        if(elecon > 100) total = total + (5.0/100*total);// Mathematically can also write total = 1.05*total
        System.out.println("Final Bill: "+total+" Taka");
        sc.close();
    }
}
