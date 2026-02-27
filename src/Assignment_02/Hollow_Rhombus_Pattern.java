package Assignment_02;

import java.util.Scanner;

public class Hollow_Rhombus_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        int space=n-1;
        while (row<=n){
            //space
            int i=1;
            while (i<=space){
                System.out.print("\t");
                i++;
            }

            //star
            int j=1;
            while (j<=star) {
                if (row == 1 || row == n || j == 1 || j == n) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
                j++;
            }
                //next line preparation
                System.out.println();
                row++;
                space--;
        }
    }
}
