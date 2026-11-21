import java.util.Scanner;
public class tutorial {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float max = 0.0f, min = 0.0f; // (OPTIONAL) 0.0f is necessary as during compilation time, machine considers 0.0 as double and not float
        if(a > b && a > c){
            max = a;
            if(b > c) min = c;
            else min = b;
        }
        else if(b > a && b > c){
            max = b;
            if(a > c) min = c;
            else min = a;
        }
        else{
            max = c;
            if(a > b) min = b;
            else min = a;
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
        sc.close();
    }
}
