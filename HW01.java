public class HW01{
    public static void main(String args[]){
        int minutes = 3456789;
        int years = minutes / (60*24*365); // 6
        int days = minutes / (60*24) - (years*365); // 210
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}
