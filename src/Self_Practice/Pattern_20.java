package Self_Practice;

public class Pattern_20 {
    public static void main(String[] args) {
        int n=7;
        int row=1;
        int space=n/2;
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
                if (j==1 || j==star){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
                j++;
            }
            //mirror
            if(row<=n/2){
                space--;
                star+=2;
            }else {
                space++;
                star-=2;
            }
            //next line preparation
            System.out.println();
            row++;
        }
    }
}
