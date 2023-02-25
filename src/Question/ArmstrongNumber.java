package Question;

/*
 sum of cube of individual numbers
 153 = 1^3 + 5^3 + 3^3
 */
public class ArmstrongNumber {
    public static void main(String[] args) {

//        int a = 153;
//        boolean ans = armStrong(a);
//        System.out.println(ans);

        //print all the 3 digit armstrong numbers
        for (int i = 100; i < 1000; i++) {
            if(armStrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean armStrong(int a){
        int original = a;
        int sum = 0;
        while (a > 0){
            int rem = a%10;
            sum += rem*rem*rem;
            a /= 10;
        }
        return (sum == original);
    }
}
