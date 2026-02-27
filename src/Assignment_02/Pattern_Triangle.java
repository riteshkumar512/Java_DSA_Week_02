package Assignment_02;

import java.util.Scanner;

public class Pattern_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        int star=1;
        int val=1;
        while (row<=n){
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
                System.out.print(p +"\t");
                if (j < star/2 +1){
                    p++;
                }else {
                    p--;
                }
                j++;
            }

            //next line preparation
            System.out.println();
            row++;
            space--;
            star+=2;
            val++;
        }
    }
}
