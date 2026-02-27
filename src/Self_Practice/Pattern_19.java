package Self_Practice;

public class Pattern_19 {
    public static void main(String[] args) {
        int n=7;
        int row=1;
        int star=n/2 +1;
        int space=-1;
        while (row<=n){
            //star
            int i=1;
            while (i<=star){
                System.out.print("*\t");
                i++;
            }
            //space
            int j=1;
            while (j<=space){
                System.out.print("\t");
                j++;
            }

            //star
            int k=1;
            if (row==1 ||row==n){
                k=2;
            }
            while (k<=star){
                System.out.print("*\t");
                k++;
            }
            //mirror
            if(row<=n/2){
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
