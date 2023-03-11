package SubProgram;
import java.util.Scanner;
public class appWarungKita {
    //variabel global
    static int hargamkn[] = new int [10];
    static int hargamnm[] = new int [5];
    static int hargasnk[] = new int [6];
    
    static int hitungharga(int hargasatuan, int jumlah) //header method
    {
        //body method
        int harga = hargasatuan*jumlah;
        return harga;
    }
    static String[] sort(String[] menu, int [] harga) //method Sorting
    {
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < menu.length-1; j++) {
                if(menu[j].compareToIgnoreCase(menu[j+1])>0){
                    String t = menu[j];
                    menu[j] = menu[j+1];
                    menu[j+1] = t;
                    int h = harga[j];
                    harga[j] = harga[j+1];
                    harga[j+1] = h;
                }
            }
        }
        return menu;
    }
    
    static String[][] search(String[] menu, int harga[], String cari) //method searching
    {
        String[][] hasil = new String[10][2];
        int idx = 0;
        for (int i = 0; i < menu.length; i++) {
            if(menu[i].indexOf(cari)>=0){
                hasil[idx][0] = menu [i];
                hasil[idx][1] = String.valueOf(harga [i]);
                idx++;
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variabel lokal
        String makanan[] = new String[10];
        String minuman[] = new String[5];
        String snack[] = new String[6];
        //int harga[] = new int[10];
        
        //inisialisasi array
        makanan[0] = "Sate Ayam    "; hargamkn[0] = 12000;
        makanan[1] = "Sate Sapi    "; hargamkn[1] = 15000;
        makanan[2] = "Sate Kambing "; hargamkn[2] = 20000;
        makanan[3] = "Soto Madura  "; hargamkn[3] = 11000;
        makanan[4] = "Soto Lamongan"; hargamkn[4] = 14000;
        makanan[5] = "Gado-gado    "; hargamkn[5] = 10000;
        makanan[6] = "Rawon        "; hargamkn[6] = 13000;
        makanan[7] = "Bakso        "; hargamkn[7] = 8000;
        makanan[8] = "Pecel        "; hargamkn[8] = 7000;
        makanan[9] = "Penyetan     "; hargamkn[9] = 9000;
        
        minuman[0] = "Es Teh      "; hargamnm[0] = 4000;
        minuman[1] = "Es Jeruk    "; hargamnm[1] = 5000;
        minuman[2] = "Air Mineral "; hargamnm[2] = 2000;
        minuman[3] = "Teh Hangat  "; hargamnm[3] = 2500;
        minuman[4] = "Jeruk Hangat"; hargamnm[4] = 3000;
        
        snack[0] = "Kentang Goreng "; hargasnk[0] = 9000;
        snack[1] = "Tempe Mendoan  "; hargasnk[1] = 5000;
        snack[2] = "Tahu Isi       "; hargasnk[2] = 6000;
        snack[3] = "Pisang Goreng  "; hargasnk[3] = 7000;
        snack[4] = "Roti Bakar     "; hargasnk[4] = 8000;
        snack[5] = "Keripik Kentang"; hargasnk[5] = 4000;
        
        int pilih=0;
        int pilih2;
        System.out.println("-----APLIKASI WARUNG KITA-----");
        do{
            System.out.println("MENU");
            System.out.println("1.Makanan");
            System.out.println("2.Minuman");
            System.out.println("3.Snack");
            System.out.println("4.Exit");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            System.out.println("");
            switch(pilih){
                case 1:
                    do{
                        System.out.println("1.Daftar Makanan");
                        System.out.println("2.Cari Makanan");
                        System.out.println("3.Kembali ke menu utama");
                        System.out.print("Pilih = ");
                        pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                String[] urut = sort(makanan,hargamkn);
                                System.out.println("Daftar Makanan");
                                for (int i = 0; i < 10; i++) {
                                    System.out.println((i+1)+"."+urut[i]);
                                }
                                System.out.println("");
                                break;
                            case 2:
                                System.out.print("Cari Makanan = ");
                                String c = sc.next();
                                String hasilcari[][] = search(makanan,hargamkn,c);
                                System.out.println("Hasil Pencarian");
                                for (int i = 0; i < hasilcari.length; i++) {
                                    if(hasilcari[i][0]!=null){ //[i][0] hanya acuan
                                        System.out.print((i+1)+"."+hasilcari[i][0]+" ");
                                        System.out.println(Integer.parseInt(hasilcari[i][1]));
                                    }
                                }
                                System.out.println("");
                                break;
                            case 3: System.out.println(""); break;
                        }
                    }while(pilih2!=3);
                    break;
                case 2:
                    do{
                        System.out.println("1.Daftar Minuman");
                        System.out.println("2.Cari Minuman");
                        System.out.println("3.Kembali ke menu utama");
                        System.out.print("Pilih = ");
                        pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                String[] urut = sort(minuman,hargamnm);
                                System.out.println("Daftar Minuman");
                                for (int i = 0; i < urut.length; i++) {
                                    System.out.println((i+1)+"."+urut[i]);
                                }
                                System.out.println("");
                                break;
                            case 2:
                                System.out.print("Cari Minuman = ");
                                String c = sc.next();
                                String hasilcari[][] = search(minuman,hargamnm,c);
                                System.out.println("Hasil Pencarian");
                                for (int i = 0; i < hasilcari.length; i++) {
                                    if(hasilcari[i][0]!=null){ //[i][0] hanya acuan
                                        System.out.print((i+1)+"."+hasilcari[i][0]+" ");
                                        System.out.println(Integer.parseInt(hasilcari[i][1]));
                                    }
                                }
                                System.out.println("");
                                break;
                            case 3: System.out.println(""); break;
                        }
                    }while(pilih2!=3);
                    break;
                case 3:
                    do{
                        System.out.println("1.Daftar Snack");
                        System.out.println("2.Cari Snack");
                        System.out.println("3.Kembali ke menu utama");
                        System.out.print("Pilih = ");
                        pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                String[] urut = sort(snack,hargasnk);
                                System.out.println("Daftar Snack");
                                for (int i = 0; i < urut.length; i++) {
                                    System.out.println((i+1)+"."+urut[i]);
                                }
                                System.out.println("");
                                break;
                            case 2:
                                System.out.print("Cari Snack = ");
                                String c = sc.next();
                                String hasilcari[][] = search(snack,hargasnk,c);
                                System.out.println("Hasil Pencarian");
                                for (int i = 0; i < hasilcari.length; i++) {
                                    if(hasilcari[i][0]!=null){ //[i][0] hanya acuan
                                        System.out.print((i+1)+"."+hasilcari[i][0]+" ");
                                        System.out.println(Integer.parseInt(hasilcari[i][1]));
                                    }
                                }
                                System.out.println("");
                                break;
                            case 3: System.out.println(""); break;
                        }
                    }while(pilih2!=3);
                    break;
                case 4:
                    System.out.println("Terima Kasih");
                    break;
            }
        }while(pilih!=4);
    }
}