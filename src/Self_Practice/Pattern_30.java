package Self_Practice;

public class Pattern_30 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while (row<=n){
            //num
            int num =5;
            while (num >= 1){
            System.out.print(num +" ");
            num--;
            }
            //next line preparation
            System.out.println();
            row++;
        }
    }
}
