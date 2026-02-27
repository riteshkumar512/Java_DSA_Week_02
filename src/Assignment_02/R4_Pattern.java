package Assignment_02;

import java.util.Scanner;

public class R4_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int star=1;
        int row=1;
        while (row<=n){
            //star
            int i=1;
            while (i<=star){
                System.out.print("*");
                i++;
            }
            //next line preparation
            System.out.println();
            row++;
            star++;
        }
    }
}
