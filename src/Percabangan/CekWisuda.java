package Percabangan;
import java.util.Scanner;
//syarat lulus: ipk >= 2.75 dan poin >=250
public class CekWisuda {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        double ipk;
        int poin;
        //input data
        System.out.print("Masukkan IPK  = ");
        ipk = a.nextDouble();
        System.out.print("Masukkan Poin = ");
        poin = a.nextInt();
        //proses seleksi kelulusan
        if(ipk>=2.75 && ipk<=4){
            if(poin>=250){
                //lulus
                System.out.println("LULUS");
            }else{
                //tidak lulus
                System.out.println("BELUM LULUS");
                System.out.println("POIN KURANG");
            }
        }else if(ipk<2.75 && ipk>=0){
            if(poin>=250){
                //lulus
                System.out.println("BELUM LULUS");
                System.out.println("IPK KURANG");
            }else{
                //tidak lulus
                System.out.println("BELUM LULUS");
                System.out.println("IPK DAN POIN KURANG");
            }
        }
    }
}
