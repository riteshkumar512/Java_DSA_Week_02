package Self_Practice;

public class Pattern_24 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int space=n-1;
        int num=1;
        while (row<=n){
            //space
            int i=1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            //num
            int j=1;
            while (j<=num){
                System.out.print(row +" ");
                j++;
            }
            //next line preparation
            System.out.println();
            row++;
            space--;
            num+=2;
        }
    }
}
