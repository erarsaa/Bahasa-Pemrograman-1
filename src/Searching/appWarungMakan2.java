package Searching;
import java.util.Scanner;
public class appWarungMakan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //array
        String makanan[] = new String[10];
        int harga[] = new int[10];
        int harga2[] = new int[10];
        int porsi[] = new int [10];
        int total[] = new int[10];
        //inisialisasi array
        makanan[0] = "Sate Ayam    "; harga[0] = 12000;
        makanan[1] = "Sate Sapi    "; harga[1] = 15000;
        makanan[2] = "Sate Kambing "; harga[2] = 20000;
        makanan[3] = "Soto Madura  "; harga[3] = 12000;
        makanan[4] = "Soto Lamongan"; harga[4] = 14000;
        makanan[5] = "Gado-gado    "; harga[5] = 10000;
        makanan[6] = "Rawon        "; harga[6] = 13000;
        makanan[7] = "Bakso        "; harga[7] = 8000;
        makanan[8] = "Pecel        "; harga[8] = 7000;
        makanan[9] = "Penyetan     "; harga[9] = 9000;
        int pilih=0;
        String pembelian[] = new String[5];
        String belimakan [] = new String[5];
        int beliharga[] = new int[5];
        int jumlahbeli = 0;
        System.out.println("-----APLIKASI WARUNG MAKAN-----");
        do{
            System.out.println("MENU");
            System.out.println("1.Daftar makanan");
            System.out.println("2.Cari menu berdasarkan nama makanan");
            System.out.println("3.Cari menu berdasarkan harga");
            System.out.println("4.Selesai");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    //urutkan berdasar nama
                    //pakai bubble sort
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 9; j++) {
                            if(makanan[j].compareToIgnoreCase(makanan[j+1])>0){
                                String t = makanan[j];
                                makanan[j] = makanan[j+1];
                                makanan[j+1] = t;
                                int h = harga[j];
                                harga[j] = harga[j+1];
                                harga[j+1] = h;
                            }
                        }
                    }
                    System.out.println("\nDAFTAR MENU");
                    for (int i = 0; i < 10; i++) {
                        System.out.println(makanan[i]+" "+harga[i]);
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("\nCari Menu = ");
                    String cari = sc.next();
                    String carimakan[] = new String [10];
                    int cariharga[] = new int[10];
                    int idx = 0;
                    for (int i = 0; i < makanan.length; i++) {
                        if(makanan[i].indexOf(cari) >= 0){
                            carimakan[idx] = makanan[i];
                            cariharga[idx] = harga[i];
                            idx++;
                            System.out.println(idx+"."+makanan[i]+" "+harga[i]);
                        }
                    }
                    //transaksi pembelian
                    if(idx!=0){
                        System.out.print("Pilih Menu   = ");
                        int pilih2 = sc.nextInt();
                        belimakan[jumlahbeli] = carimakan[pilih2-1];
                        beliharga[jumlahbeli] = cariharga[pilih2-1];
                        System.out.print("Banyak Porsi = ");
                        porsi[jumlahbeli]= sc.nextInt();
                        total[jumlahbeli]=beliharga[jumlahbeli] * porsi[jumlahbeli];
                        jumlahbeli++;
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("\nRentang Harga");
                    System.out.println("*Contoh : batas bawah - batas atas = (0-10000)");
                    System.out.print("Batas bawah harga = ");
                    int bawah = sc.nextInt();
                    System.out.print("Batas atas harga  = ");
                    int atas = sc.nextInt();
                    String carimakan2[] = new String [10];
                    int cariharga2[] = new int[10];
                    int idx2 = 0;
                    for (int i = 0; i < makanan.length; i++) {
                        if(harga[i]>=bawah && harga[i]<=atas){
                            carimakan2[idx2] = makanan[i];
                            cariharga2[idx2] = harga[i];
                            idx2++;
                            System.out.println(idx2+"."+makanan[i]+" "+harga[i]);
                        }
                    }
                    //transaksi pembelian
                    if(idx2!=0){
                        System.out.print("Pilih Menu   = ");
                        int pilih4 = sc.nextInt();
                        belimakan[jumlahbeli] = carimakan2[pilih4-1];
                        beliharga[jumlahbeli] = cariharga2[pilih4-1];
                        System.out.print("Banyak Porsi = ");
                        porsi [jumlahbeli]= sc.nextInt();
                        total[jumlahbeli]=beliharga[jumlahbeli] * porsi[jumlahbeli];
                        jumlahbeli++;
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("\nTerima Kasih...");
                    break;
            }
        }while(pilih!=4); 
        //cetak daftar beli
        System.out.println("\n--------------DAFTAR PEMBELIAN--------------");
        System.out.println("NO MENU\t\t\t HARGA\t  PORSI\t  HARGA TOTAL");
        for (int i = 0; i < jumlahbeli; i++) {
            System.out.println((i+1)+"  " + belimakan[i]+"\t["+beliharga[i]+"]\t   "
                    + " "+porsi[i]+"\t   Rp. "+total[i]);
        }
    }
}