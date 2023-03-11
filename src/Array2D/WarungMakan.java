package Array2D;
import java.util.Scanner;
public class WarungMakan {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        int reset;
        do{
            //Deklarasi variabel
            String pesanan[][] = new String[5][2];
            int idx=0, idxmkn=0, idxmnm=0;
            int nominal[][] = new int [5][6];
            int pilih1=0, pilih2=0, jumlah,hargaakhir=0,tunai=0,kembalian;
            //menu reset 
            System.out.println("------------------- WARUNG  MAKAN -------------------");
            System.out.println("Apakah Anda ingin memesan?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("Pilih = ");
            reset = sc.nextInt();
            if (reset==1) {
                do{
                    System.out.println("\nMENU");
                    System.out.println("1.Makanan");
                    System.out.println("2.Minuman");
                    System.out.println("3.Selesai");
                    System.out.print("Pilih  = ");
                    pilih1 = sc.nextInt();
                    switch(pilih1){
                        case 1 :
                            System.out.println("\nDAFTAR MAKANAN");
                            System.out.println("1.Sate   ");
                            System.out.println("2.Soto   ");
                            System.out.println("3.Bakso  ");
                            System.out.print("Pilih  = ");
                            pilih2 = sc.nextInt();
                            switch(pilih2) {
                                case 1 :
                                    pesanan[idxmkn][0] = "Sate   ";
                                    nominal[idxmkn][0] = 15000;
                                    break;
                                case 2 :
                                    pesanan[idxmkn][0] = "Soto   ";
                                    nominal[idxmkn][0] = 12000;
                                    break;
                                case 3 :
                                    pesanan[idxmkn][0] = "Bakso  ";
                                    nominal[idxmkn][0] = 10000;
                                    break;
                            }
                            System.out.print("Jumlah = ");
                            jumlah = sc.nextInt();
                            nominal[idxmkn][2]=jumlah; //jumlah makanan
                            //hitung biaya
                            nominal[idxmkn][4]=nominal[idxmkn][0] * nominal[idxmkn][2];
                            hargaakhir = hargaakhir + nominal[idxmkn][4];
                            idxmkn++;
                            break;
                        case 2 :
                            System.out.println("\nDAFTAR MINUMAN");
                            System.out.println("1.Teh    ");
                            System.out.println("2.Kopi   ");
                            System.out.println("3.Mineral");
                            System.out.print("Pilih  = ");
                            pilih2 = sc.nextInt();
                            switch(pilih2) {
                                case 1 :
                                    pesanan[idxmnm][1] = "Teh    ";
                                    nominal[idxmnm][1] = 1500;
                                    break;
                                case 2 :
                                    pesanan[idxmnm][1] = "Kopi   ";
                                    nominal[idxmnm][1] = 2000;
                                    break;
                                case 3 :
                                    pesanan[idxmnm][1] = "Mineral";
                                    nominal[idxmnm][1] = 1000;
                                    break;
                            }
                            System.out.print("Jumlah = ");
                            jumlah = sc.nextInt();
                            nominal[idxmnm][3]=jumlah; //jumlah minuman
                            //hitung biaya
                            nominal[idxmnm][5]=nominal[idxmnm][1] * nominal[idxmnm][3];
                            hargaakhir = hargaakhir + nominal[idxmnm][5];
                            idxmnm++;
                            break;
                        case 3 :
                            System.out.println("Terima Kasih...");
                            break;
                    }
                }while(pilih1!=3);
                System.out.println("\n------------------DAFTAR  PEMBELIAN------------------");
                System.out.println("No Makanan\t@harga\t\tPorsi\tTotal Harga");
                for (int i=0; i<5; i++){
                    if(pesanan[i][0]!=null){
                        System.out.print((i+1)+". "+pesanan[i][0]);
                        System.out.print("\tRp."+nominal[i][0]);
                        System.out.print("\t  "+nominal[i][2]);
                        System.out.println("\tRp."+nominal[i][4]);
                    }
                }
                System.out.println("\nNo Minuman\t@harga\t\tPorsi\tTotal Harga");
                for (int i=0; i<5; i++){
                    if(pesanan[i][1]!=null){
                        System.out.print((i+1)+". "+pesanan[i][1]);
                        System.out.print("\tRp. "+nominal[i][1]);
                        System.out.print("\t  "+nominal[i][3]);
                        System.out.println("\tRp. "+nominal[i][5]);
                    }
                }
                System.out.println("-----------------------------------------------------");
                System.out.println("Harga Akhir\t\t\t\tRp."+hargaakhir);
                while(tunai<hargaakhir) {
                    System.out.print("Tunai\t\t\t\t\tRp." );
                    tunai = sc.nextInt();
                    if(tunai>=hargaakhir){
                        System.out.println("-----------------------------------------------------");
                        kembalian = tunai - hargaakhir;
                        System.out.println("Kembalian\t\t\t\tRp." +kembalian);
                        System.out.println("Terima Kasih... \nAnda Telah Menyelesaikan Transaksi Pembelian\n");
                    }
                    else {
                        System.out.println("UANG ANDA TIDAK CUKUP!\n");
                    }
                }
            }
            if (reset==2){
                System.out.println("Silakan running ulang aplikasi");
            }
        }while(reset!=2);
    }
}