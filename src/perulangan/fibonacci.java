package perulangan;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int fibo,fibo1,fibo2,suku;
        fibo1=0; fibo2=1;
        System.out.print("input suku ke = ");
        suku =  a.nextInt();
        System.out.print("deretnya : ");
        System.out.print(fibo1+", "+fibo2+", ");
            for(int i=2; i<=suku-2; i++) {
                fibo = fibo1+fibo2;
                fibo1=fibo2;
                fibo2=fibo;
                if(i<suku-2)
                System.out.print(fibo+", ");
                else if (i==suku-2)
                    System.out.print(fibo + " ");
            }
        System.out.println(" ");
    }
}
