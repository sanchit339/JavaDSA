package String;

public class PrettyPrinting {
    public static void main(String[] args) {
        float num =  432.1234f;
        System.out.printf("the formatted string is %.2f" , num); // prints formatted string
        System.out.println();
        System.out.printf("Pie :- %.3f" , Math.PI);
        System.out.println();
        // these are placeholders (%s %f etc)
        System.out.printf("My Name is %s and i study %s" , "Sanchit" , "Computer Science");
    }
}
