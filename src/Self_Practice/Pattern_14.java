package Self_Practice;

public class Pattern_14 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int space=n-1;
        int star=1;
        while (row<=2*n-1){
            //space
            int i=1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            while (j<=star){
                System.out.print("* ");
                j++;
            }
            //mirror
            if (row<n){
                space--;
                star++;
            }else {
                space++;
                star--;
            }
            //next line preparation
            System.out.println();
            row++;
        }
    }
}
