public class CW03{
    public static void main(String args[]){
        int a = 4;
        double b = 2d * Math.PI * (double)a; // float b will not work because Math.PI is a double data type
        System.out.println(b); // Circumference of a circle with radius 4
        double c = 4f;
        double d = 2.0 * Math.PI * c; // same but different way to declare a double variable
        System.out.println(d); // Circumference of a circle with radius 4
        float area = (float)Math.PI * a * a; // Area of a circle with radius 4
        System.out.println(area);
    }
}
