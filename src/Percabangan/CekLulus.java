package Percabangan;
import java.util.Scanner;
public class CekLulus {
    public static void main(String[] args) {
        //syarat lulus, nilai >= 70
        Scanner a = new Scanner (System.in);
        int nilai;
        //1. input
        System.out.print("Masukkan Nilai = ");
        nilai = a.nextInt();
        
        //2. proses --> cek nilai
        //3. output --> lulus atau tidak
        if(nilai>=70 && nilai<=100){
            //apa yang dikerjakan
            System.out.print("SELAMAT ");
            System.out.println("Anda Lulus");
        }
        else if(nilai>100 || nilai<0) {
            System.out.println("Nilai Salah!");
        }
        else {
            System.out.print("MOHON MAAF ");
            System.out.println("Anda Belum Lulus");
        }
    }
}
