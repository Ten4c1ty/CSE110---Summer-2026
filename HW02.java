import java.util.Scanner;
public class tutorial {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Electricity Consumed: ");
        int elecon= sc.nextInt();
        double total = elecon*15.0;
        if(age < 18) total = total - (double)(20.0/100*total);// Mathematically can also write 80/100*total
        else if(age > 60) total = total - (10.0/100*total);// Mathematically can also write 90/100*total
        if(elecon > 100) total = total + (5.0/100*total);// Mathematically can also write 105/100*total
        System.out.println("Final Bill: "+total+" Taka");
        sc.close();
    }
}
