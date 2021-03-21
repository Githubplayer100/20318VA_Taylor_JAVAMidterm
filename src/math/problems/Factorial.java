package math.problems;

import java.util.Scanner;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        int factorial = fact(num);
        System.out.println("Factorial of entered number is: " + factorial);
    }

        static int fact(int n)
        {
            int output;
            if(n==1){
                return 1;
            }
            output = fact(n-1)* n;
            return output;
        }





}
