package Self_Practice;

public class Pattern_28 {
    public static void main(String[] args) {
        int n=5;
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
                System.out.print(p+"\t");
                j++;
            //mirror
                if (j <= star/2+1) {
                    p++;
                } else {
                    p--;
                }
        }
            //next line preparation
            System.out.println();
            row++;
            star+=2;
            space--;
            val++;

        }
    }
}
