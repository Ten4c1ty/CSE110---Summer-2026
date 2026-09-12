public class CW04{
    public static void main(String args[]){
        int a = 1954;
        System.out.println(a%10); // 4
        a = a/10; // 195
        System.out.println(a%10); // 5
        double b = 1954.0;
        System.out.println(b%10); // 4.0
        b = b/10; // 195.4
        System.out.println(b%10); // 5.400000000000006
    }
}
