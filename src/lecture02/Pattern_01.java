package lecture02;

public class Pattern_01 {
    public static void main(String[] args){
        int n=5;
        int row=1;
        int star=n;
        while (row<=n){
            //star
            int  i=1 ;
            while (i<=star){
                System.out.print("* ");
                i++;
            }
            //next line preparation
            System.out.println();
            row++;
        }
    }
}
