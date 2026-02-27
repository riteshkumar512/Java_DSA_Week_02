package Assignment_02;

import java.util.Scanner;

public class Fibonacci_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int prev1=0;
        int prev2=1;
        while (row<=n){
            //star
            int i=1;
            while (i<=star){

                int currVal=prev1+prev2;
                System.out.print(prev1);
                prev1=prev2;
                prev2=currVal;
                i++;
            }
            //next line preparation
            System.out.println();
            row++;
            star++;
        }
    }
}
