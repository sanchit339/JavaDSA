package NumberTheory;

// to do set bool array to true as it is false

import java.util.Scanner;
/*
    Q :- find all the prime numbers till n
*/
public class SieveAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // the boolean array all set to False initially
        // so prime number false and non-prime true
        boolean[] primes = new boolean[n+1]; // coz (0 - n) == n+1
        sieve(n , primes);
    }

    static void sieve(int n , boolean[] primes){
        // eliminate the multiples till the Sqrt
        for (int i = 2; i*i <= n ; i++) {
            if(!primes[i]){ // false value means it's a prime and make its multiple true
                // increment the j value as per the i 
                for (int j = i*2 ; j <= n ; j+=i) { // as the number is prime we start from *2 of multiples
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n ; i++) {
            if(!primes[i]){ // if false (prime)
                System.out.print(i + " ");
            }
        }
    }
}

/*
    SC = is O(N)
    TC :-
    for each i the array is iterated (n/i) times
    ie = n* (n/2+n/3+n/4....)
    tc = n*log(log(n)) where n is the number itself
*/
