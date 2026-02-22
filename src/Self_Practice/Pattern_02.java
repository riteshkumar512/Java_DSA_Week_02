package Self_Practice;

public class Pattern_02 {
    public static void main(String[] args){
        int n=5;
        int row=1;
        int star=1;
        int space=4;

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
                System.out.print(" ");
                j++;
            }
            //next line preparation
            System.out.println();
            row++;
            space--;
            star++;
        }
    }
}
