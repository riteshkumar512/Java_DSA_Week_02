package Self_Practice;

public class Pattern_25 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int space=n-1;

        while (row<=n){
            //space
            int i=1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            //num
            int num=1;
            while (num<=row){
                System.out.print(num + " ");
                num++;
            }
            //next line preparation
            System.out.println();
            row++;
            space--;
            //num++;
        }
    }
}
