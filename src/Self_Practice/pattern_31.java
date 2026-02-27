package Self_Practice;

public class pattern_31 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=5;
        int place=0;

        while (row<=n){
            int i=1;
            int val=n;
            while (i<=star){
                if(i==star-place){
                    System.out.print("*\t");
                }else {
                    System.out.print(val+"\t");
                }
                i++;
                val--;

            }

            //next line preparation
            System.out.println();
            row++;
            place++;
        }
    }
}
