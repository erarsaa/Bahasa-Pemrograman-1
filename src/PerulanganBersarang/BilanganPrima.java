package PerulanganBersarang;
import java.util.Scanner;
public class BilanganPrima {
    public static void main(String[] args) {
        Scanner q = new Scanner (System.in);
        int N;
        System.out.println("BILANGAN PRIMA");
        System.out.print("Masukkan banyak N : ");
        N = q.nextInt();
        
        //Proses
        System.out.print(N+" urutan bilangan prima : ");
        int banyak =1;
        int bilangan =2;
        while(banyak <= N){
            int faktor=0;
            for(int i=1;i<=bilangan;i++){
                if(bilangan%i == 0){
                    faktor++;
                }
            }
            if(faktor == 2){
                System.out.print(bilangan+" ");
                banyak++;
            }
            bilangan++;
        }
        System.out.println("");
    }
}
