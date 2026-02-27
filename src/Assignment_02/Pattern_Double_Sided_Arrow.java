package Assignment_02;

import java.util.Scanner;

public class Pattern_Double_Sided_Arrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int space1=n-1;
        int star=1;
        int space2=-1;
        int val=1;
        while (row<=n){
            //space
            int i=1;
            while (i<=space1){
                System.out.print("\t");
                i++;
            }
            //star
            int j=1;
            int p=val;
            while (j<=star){
                System.out.print(p+"\t");
                j++;
                p--;
            }
            //space
            int k=1;
            while (k<=space2){
                System.out.print("\t");
                k++;
            }
            //star
            if(row!=1 && row!=n) {
                int l = 1;
                while (l <= star) {
                    System.out.print(l+"\t");
                    l++;
                }
            }
            //mirror
            if (row<=n/2){
                star++;
                space1-=2;
                space2+=2;
                val++;
            }else {
                star--;
                space1+=2;
                space2-=2;
                val--;
            }
            //next line preparation
            System.out.println();
            row++;
        }
    }
}
