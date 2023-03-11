package Sekuensial;
import java.util.Scanner;
    public class ProgramKasir {
    public static void main (String [] args) {
        //Jumlah beras yang dibeli, Harga satuan per kg beras, uang pembeli
        //Total biaya = jumlah kg beras yang dibeli * harga satuan
        //Diskon = Total biaya x 5%
        //Biaya akhir = total biaya - diskon 
        //Kembalian = uang dari pembeli - biaya akhir
        
        Scanner scn = new Scanner (System.in);
        int jumlah;
        double total,diskon,biaya_akhir,uang_pembeli,kembalian;
        double harga_satuan = 12000;
        
        System.out.println("Program Kasir");
        
        System.out.print("Beras (kg)  = "  );
        jumlah = scn.nextInt();
        
        System.out.println("@ /kg       = Rp. " + harga_satuan);
        
        total = jumlah * harga_satuan;
        System.out.println("Total Harga = Rp. " + total);
        
        diskon = total * 0.05;
        System.out.println("Diskon 5%   = (- Rp. " + diskon + ")");
        
        System.out.println("-------------------------------");
        
        biaya_akhir = total - diskon;
        System.out.println("Harga Jual  = Rp. " + biaya_akhir);
        
        System.out.print("Tunai       = Rp. ");
        uang_pembeli = scn.nextDouble ();
        
        System.out.println("-------------------------------");
        
        kembalian = uang_pembeli - biaya_akhir;
        System.out.println("Kembalian   = Rp. " + kembalian);
    }
}
