package perulangan;
import java.util.Scanner;
public class PerulanganMenu {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        //deklarasi variabel
        int pilih,pilih2,pilih3;
        double jumlah,total,harga=0,diskon,hargaakhir,tunai,kembalian,tunai2;
        double sateayam=1500,satekambing=3000;
        double pecelayam=13000,pecelempal=15000;
        double penyettahu=5000,penyettelur=7000,penyetayam=10000;
        
        do{
            System.out.println("-------------------------");
            System.out.println("Menu Awal");
            System.out.println("1. Sate");
            System.out.println("2. Pecel");
            System.out.println("3. Penyetan");
            System.out.println("4. Selesai Memilih Menu");
            System.out.print("Pilih Menu = ");
            pilih = a.nextInt();
            
            //pilih case
            switch(pilih){
                case 1 : 
                        do{
                            System.out.println("\nPilihan Jenis Sate");
                            System.out.println("1. Sate Ayam    (@1500)");
                            System.out.println("2. Sate Kambing (@3000)");
                            System.out.println("3. Selesai Memilih Jenis");
                            System.out.print("Pilih Jenis = ");
                            pilih = a.nextInt();
                            if(pilih==1){
                                System.out.print("Banyak /tusuk = ");
                                jumlah = a.nextInt();
                                total = jumlah*sateayam;
                                System.out.println("Harga total = " +total);
                                harga = harga+total;
                                System.out.println("Harga Akhir = " +harga);
                            }
                            else if (pilih==2){
                                System.out.print("Banyak /tusuk = ");
                                jumlah = a.nextInt();
                                total = jumlah*satekambing;
                                System.out.println("Harga total = " +total);
                                harga = harga+total;
                                System.out.println("Harga Akhir = " +harga);
                            }
                            else if(pilih==3){
                                System.out.println("Anda Kembali ke Menu Awal");
                            }
                            else {
                                System.out.println("PILIHAN ANDA TIDAK ADA!");
                            }
                        }
                        while (pilih!=3); 
                    break;
                case 2:
                        do{
                            System.out.println("\nPilihan Jenis Pecel");
                            System.out.println("1. Pecel Ayam  (@13000)");
                            System.out.println("2. Pecel Empal (@15000)");
                            System.out.println("3. Selesai Memilih Jenis");
                            System.out.print("Pilih Jenis = ");
                            pilih = a.nextInt();
                                if(pilih==1){
                                    System.out.print("Banyak /porsi = ");
                                    jumlah = a.nextInt();
                                    total = jumlah*pecelayam;
                                    System.out.println("Harga total = " +total);
                                    harga = harga+total;
                                    System.out.println("Harga Akhir = " +harga); 
                                }
                                else if(pilih==2){
                                    System.out.print("Banyak /porsi = ");
                                    jumlah = a.nextInt();
                                    total = jumlah*pecelempal;
                                    System.out.println("Harga total = " +total);
                                    harga = harga+total;
                                    System.out.println("Harga Akhir = " +harga); 
                                }
                                else if(pilih==3){
                                    System.out.println("Anda Kembali ke Menu Awal");
                                }
                                else{
                                    System.out.println("PILIHAN ANDA TIDAK ADA!");
                                }
                        }
                        while (pilih!=3);
                    break;
                case 3:
                        do{
                            System.out.println("\nPilihan Jenis Penyetan");
                            System.out.println("1. Penyet Tahu Tempe(@5000)");
                            System.out.println("2. Penyet Telur     (@7000)");
                            System.out.println("3. Penyet Ayam      (@10000)");
                            System.out.println("4. Selesai Memilih Jenis");
                            System.out.print("Pilih Jenis = ");
                            pilih2 = a.nextInt();
                                switch(pilih2){
                                    case 1:
                                            System.out.print("Banyak /porsi = ");
                                            jumlah = a.nextInt();
                                            total = jumlah*penyettahu;
                                            System.out.println("Harga total = " +total);
                                            harga = harga+total;
                                            System.out.println("Harga Akhir = " +harga); 
                                        break;
                                    case 2:
                                            System.out.print("Banyak /porsi = ");
                                            jumlah = a.nextInt();
                                            total = jumlah*penyettelur;
                                            System.out.println("Harga total = " +total);
                                            harga = harga+total;
                                            System.out.println("Harga Akhir = " +harga);
                                        break;
                                    case 3:
                                            System.out.print("Banyak /porsi = ");
                                            jumlah = a.nextInt();
                                            total = jumlah*penyetayam;
                                            System.out.println("Harga total = " +total);
                                            harga = harga+total;
                                            System.out.println("Harga Akhir = " +harga);
                                        break;
                                    case 4:
                                            System.out.println("Anda Kembali ke Menu Awal");
                                        break;
                                    default: System.out.println("PILIHAN ANDA TIDAK ADA!");
                                }
                        }
                        while(pilih2!=4);
                    break;
                case 4:
                        System.out.println("-------------------------");
                    break;
                default: System.out.println("PILIHAN ANDA TIDAK ADA!");
            }
        }
        while(pilih!=4);
        do{
            System.out.println("Apakah anda memiliki member?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("Pilih = ");
            pilih3 = a.nextInt();
                if(pilih3==1){
                    System.out.println("Diskon 5%");
                    diskon = 0.05*harga;
                    hargaakhir = harga-diskon;
                    System.out.println("Harga Jual = " +hargaakhir);
                    System.out.print("Tunai      = ");
                    tunai = a.nextDouble();
                    System.out.println("-------------------------");
                    kembalian = tunai-hargaakhir;
                    System.out.println("Kembalian  = " +kembalian);
                    System.out.println("Silakan menunggu pesanan anda...");
                }
                else if(pilih3==2){
                    System.out.println("Harga Jual = " +harga);
                    System.out.print("Tunai      = ");
                    tunai2 = a.nextDouble();
                    kembalian = tunai2-harga;
                    System.out.println("-------------------------");
                    System.out.println("Kembalian  = " +kembalian);
                    System.out.println("Silakan menunggu pesanan anda...");
                }
                else{
                    System.out.println("PILIHAN ANDA TIDAK ADA!");
                }
        }
        while(pilih3!=1&&pilih3!=2);
        
    }
}