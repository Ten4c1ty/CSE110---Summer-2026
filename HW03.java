public class HW03{
    public static void main(String args[]){
        int a = 1000054943;
        int b = (10*(a%10))+((a%100)/10);// 10*3 + 43/10 = 34
        System.out.println(b);
    }
}
