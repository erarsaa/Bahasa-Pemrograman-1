package perulangan;
import java.util.Scanner;
public class faktorial {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int faktorial=1;
        System.out.println("Hitung Faktorial");
        System.out.print("Masukkan Angka = ");
        int angka = a.nextInt();
        for (int i = angka; i>=1 && i<=8; i++){
            faktorial = faktorial*i;
        }
        System.out.println("Hasilnya : " +faktorial);
    }
}
