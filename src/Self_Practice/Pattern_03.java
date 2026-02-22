package Self_Practice;

public class Pattern_03 {
    public static void main(String [] args){
        int n=5;
        int row=1;
        int star=n;
        int space=0;
        while (row<=n){
            //star
            int i=1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }
            //space
            int j=1;
            while (j<=space){
                System.out.print("  ");
                j++;
            }
            //next line preparation
            System.out.println();
            row++;
            space++;
            star--;
        }

    }
}
