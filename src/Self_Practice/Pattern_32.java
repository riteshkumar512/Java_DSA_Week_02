package Self_Practice;

public class Pattern_32 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=1;
        int val=row;
        while (row<=2*n-1){
            //star
            int i=1;
            int p=val;
            while (i<=star){

                if (i%2==0){
                    System.out.print("*\t");
                }else {
                    System.out.print(p + "\t");
                }
                i++;
            }
            //mirror
            if (row<n){
                star+=2;
                val++;
            }else {
                star-=2;
                val--;
            }
            //next line preparatiion
            System.out.println();
            row++;
        }
    }
}
