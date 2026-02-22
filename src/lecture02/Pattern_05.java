package lecture02;

public class Pattern_05 {
    public static void main(String[] args){
        int n=5;
        int row=1;
        int space=0;
        int star=5;
        while (row<=5){
            //space
            int i=1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            while (j<=star){
                System.out.print("* ");
                j++;
            }
            //next line preparation
            System.out.println();
            row ++;
            space++;
            star--;
        }
    }
}
