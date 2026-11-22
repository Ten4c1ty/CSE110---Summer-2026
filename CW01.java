public class CW01 {
    public static void main(String [] args){
        int first = 24;
        int commonDifference = 6; // Camel casing
        int n = 6;
        for(int i = 1; i <= n; i++){ // for(declaration+initialization; condition; increment/decrement) -- use for loop when number of iterations(n) is known
            int term = first - ((i-1) * commonDifference);// process
            System.out.print(term);
            if(i < n) System.out.print(", "); // Condition to check last term; print comma and space [Beautification]
        }
        System.out.println(); // New Line
        first = 18;
        commonDifference = 9; // No need to redeclare again; can be reinitialized same named variables
        for(int i = 1; i <= n; i++){
            int term = first + ((i-1) * commonDifference);
            if(i%2 == 0) term = term * -1; // minus sign before even terms
            System.out.print(term);
            if(i < n) System.out.print(", ");
        }
    }
}
