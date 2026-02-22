package Self_Practice;

public class Pattern_07 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=n;
        while (row<=5){
            //star
            int i=1;
            while (i<=star){
                if (row==1 || row==n || i==1 ||i==n){
                    System.out.print("* ");
                }else{
                System.out.print("  ");
                }
                i++;
            }
            //next line preparation
            System.out.println();
            row++;
        }
    }
}
