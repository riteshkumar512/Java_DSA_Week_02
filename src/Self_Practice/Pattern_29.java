package Self_Practice;

public class Pattern_29 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int space=n-1;
        int star=1;
        while (row<=n){
            //space
            int i=1;
            while (i<=space){
                System.out.print("\t");
                i++;
            }
            //star
            int j=1;
            while (j<=star){
                if (j==1 || j==star) {
                    System.out.print(row + "\t");
                }else {
                    System.out.print("0\t");
                }
                j++;
            }
            //next line preparation
            System.out.println();
            row++;
            star+=2;
            space--;

        }
    }
}
