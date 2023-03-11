package perulangan;
import java.util.Scanner;
public class deretangkanaik {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
	int bilangan,counter;
	System.out.println("Program Deret Angka");
	System.out.print("Masukkan Angka = ");
            bilangan = a.nextInt();
	System.out.print("Deret Angkanya : ");
            counter = 1;
	while(counter<=bilangan) {
            System.out.print(counter+ " " );
            counter++;
	}
	System.out.println("\nhalo ");
    }
}
