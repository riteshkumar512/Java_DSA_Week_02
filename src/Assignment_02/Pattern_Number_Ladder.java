package Assignment_02;

import java.util.Scanner;

public class Pattern_Number_Ladder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int star=1;
        int val=1;
        while (row<=n){
            //star
            int i=1;
            while (i<=star){
                System.out.print(val+"\t");
                i++;
                val++;
            }
            //next line preparation
            System.out.println();
            row++;
            star++;
        }
    }
}
