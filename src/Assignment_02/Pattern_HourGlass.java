package Assignment_02;

import java.util.Scanner;

public class Pattern_HourGlass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=2*n+1;
        int space=0;
        int val=n;
        while (row<=2*n+1){
            //space
            int i=1;
            while (i<=space){
                System.out.print("\t");
                i++;
            }
            //star
            int j=1;
            int p=val;
            while (j<=star){
                System.out.print(p+"\t");
                //vertical mirror
                if (j<star/2+1){
                    p--;
                }else {
                    p++;
                }
                j++;
            }
            //horizontal mirror
            if (row<=n){
                space++;
                star-=2;
                val--;
            }else {
                space--;
                star+=2;
                val++;
            }
            //next line preparation
            System.out.println();
            row++;
        }
    }
}
