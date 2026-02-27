package Assignment_02;

import java.util.Scanner;

public class Pattern_Mountain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int star=1;
        int space=2*n-3;
        int val=1;
        while (row<=n){
            //star
            int i=1;
            int p=val;
            while (i<=star){
                System.out.print(p+"\t");
                i++;
                p++;
            }
            //space
            int j=1;
            while (j<=space){
                System.out.print("\t");
                j++;
            }
            //star
            int k=1;
            int r=p-1;
            if (row==n){
                r=p-2;
            }
            if (row==n){
                k=2;
            }
            while (k<=star){
                System.out.print(r+"\t");
                k++;
                r--;
            }
            //next line preparation
            System.out.println();
            row++;
            star++;
            space-=2;
        }
    }
}
