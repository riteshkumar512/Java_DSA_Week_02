package Assignment_02;

import java.util.Scanner;

public class Pattern_InvertedHourGlass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int row=1;
        int val=n;
        int space=2*n-1;
        while (row <= 2*n+1){
            //star
            int i=1;
            while (i<=star){
                System.out.print(val+"\t");
                i++;
                val--;
            }
//            space
            int j=1;
            while (j<=space){
                System.out.print("\t");
                j++;
            }
            //star
            int k=1;
            if (row==n+1){
                k=2;
                val++;
            }
            while (k<=star){
                System.out.print((val+1)+"\t");
                k++;
                val++;
            }
            //mirror
            if(row<=n){
                star++;
                space-=2;
            }
            else{
                star--;
                space+=2;
            }
            //next line preparation
            System.out.println();
            row++;
        }
    }
}
