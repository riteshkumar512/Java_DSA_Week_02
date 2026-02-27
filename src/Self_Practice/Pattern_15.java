package Self_Practice;

public class Pattern_15 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=n;
        int space=0;
        while (row<=2*n-1){
            //star
            int i=1;
            while (i<=space){
                System.out.print("\t");
                i++;
            }
            //space
            int j=1;
            while (j<=star){
                System.out.print("* \t");
                j++;
            }
            //star
            //mirror
            if (row<n){
                star--;
                space+=2;
            }else {
                star++;
                space-=2;
            }
            //next line preparation
            System.out.println();
            row++;
        }
    }
}
