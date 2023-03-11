package Buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bufferReader {
    public static void main(String[] args)throws IOException{ // Exception handling necessary for readLine
        int a , b , c;
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the 1st number:- ");
        a = Integer.parseInt(br.readLine());
        System.out.print("enter the 2nd number:- ");
        b = Integer.parseInt(br.readLine());
        c = a + b;
        System.out.println( "answer :- " + c);
    }
}
