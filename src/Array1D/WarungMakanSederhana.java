package Array1D;
import java.util.Scanner;
public class WarungMakanSederhana {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String menu[] = new String [5];
        int harga[] = new int [5];
        int porsi[] = new int [5];
        int total[] = new int [5];
        int pilih=0,indeks=0,hargaakhir=0,tunai=0,kembalian;
        do { 
            System.out.println("-----WARUNG SEDERHANA-----");
            System.out.println("--------------------------");
            System.out.println("Menu Warung");
            System.out.println("1. Sate \t@15.000");
            System.out.println("2. Soto \t@10.000");
            System.out.println("3. Rawon\t@12.000");
            System.out.println("4. Pecel\t@ 8.000");
            System.out.println("5. Bakso\t@10.000");
            System.out.println("6. Selesai");
            System.out.print("Pilih        : ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1 :
                    menu[indeks] = "Sate";
                    harga[indeks] = 15000;
                    System.out.print("Banyak Porsi : ");
                    porsi[indeks] = sc.nextInt();
                    total[indeks] = harga[indeks]*porsi[indeks];
                    hargaakhir=hargaakhir+total[indeks];
                    break;
                case 2 :
                    menu[indeks] = "Soto";
                    harga[indeks] = 10000;
                    System.out.print("Banyak Porsi : ");
                    porsi[indeks] = sc.nextInt();
                    total[indeks] = harga[indeks]*porsi[indeks];
                    hargaakhir=hargaakhir+total[indeks];
                    break;
                case 3 :
                    menu[indeks] = "Rawon";
                    harga[indeks] = 12000;
                    System.out.print("Banyak Porsi : ");
                    porsi[indeks] = sc.nextInt();
                    total[indeks] = harga[indeks]*porsi[indeks];
                    hargaakhir=hargaakhir+total[indeks];
                    break;
                case 4 :
                    menu[indeks] = "Pecel";
                    harga[indeks] = 8000;
                    System.out.print("Banyak Porsi : ");
                    porsi[indeks] = sc.nextInt();
                    total[indeks] = harga[indeks]*porsi[indeks];
                    hargaakhir=hargaakhir+total[indeks];
                    break;
                case 5 :
                    menu[indeks] = "Bakso";
                    harga[indeks] = 10000;
                    System.out.print("Banyak Porsi : ");
                    porsi[indeks] = sc.nextInt();
                    total[indeks] = harga[indeks]*porsi[indeks];
                    hargaakhir=hargaakhir+total[indeks];
                    break;
            }
            System.out.println("");
            indeks++;
        }while(pilih!=6);
        System.out.println("----------STRUK PEMBELIAN----------");
        System.out.println("No  Menu \tPorsi\tHarga Total");
        for(int i=0; i<indeks-1; i++){
            System.out.println((i+1)+".  " +menu[i]+ " \t  " + porsi[i] + "\tRp. " +total[i]);
        }
        System.out.println("-----------------------------------");
        System.out.println("Harga Akhir\t\tRp. " +hargaakhir);
        while(tunai<hargaakhir) {
            System.out.print("Tunai\t\t\tRp. " );
            tunai = sc.nextInt();
            
            if(tunai>=hargaakhir){
                System.out.println("-----------------------------------");
                kembalian = tunai - hargaakhir;
                System.out.println("Kembalian \t\tRp. " +kembalian);
            }
            else {
                System.out.println("UANG ANDA TIDAK CUKUP!\n");
            }
        }
    }
}