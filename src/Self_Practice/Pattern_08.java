package Self_Practice;

public class Pattern_08 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=n;
        int space=0;
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
                if (j==1 || j==star){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
                j++;
            }
            //mirror
            if (row<=n/2){
                star-=2;
                space++;
            }else {
                star+=2;
                space--;
            }
            //next line preparation
            System.out.println();
            row++;
        }
    }
}
