package Self_Practice;

public class Pattern_33 {
    public static void main(String[] args) {
        int n=10;
        int row=1;
        int star=1;
        int val=n;
        int space=n-1;
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
                System.out.print(p%10+"\t");
            if (j<star/2+1){
                p++;
            }else {
                p--;
            }
            j++;
            }
            //next line preparation
            System.out.println();
            row++;
            star+=2;
            space--;
            val--;

        }
    }
}
