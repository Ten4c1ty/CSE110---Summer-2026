public class CW06{
    public static void main(String args[]){
        int a = 10;
        int b = 13;
        // Swap using a third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println( a + " " + b); // 13 10
        // Swap without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println( a + " " + b); // 10 13
        // Swap without using a third variable -- another process
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println( a + " " + b); // 13 10
    }
}
