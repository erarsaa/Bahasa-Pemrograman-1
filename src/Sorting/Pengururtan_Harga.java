package Sorting;
import java.util.Scanner;
public class Pengururtan_Harga {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String menu[] = new String[5];
        int harga[] = new int[5];
        int pilih=0;
        //inisialisasi data
        menu[0] = "Sate "; harga[0] = 15000;
        menu[1] = "Soto "; harga[1] = 12000;
        menu[2] = "Pecel"; harga[2] = 20000;
        menu[3] = "Bakso"; harga[3] = 10000;
        menu[4] = "Rawon"; harga[4] = 14000;
        do{//menu
            System.out.println("\n----MENU WARUNG----");
            System.out.println("1.Daftar Makanan");
            System.out.println("2.Urutan Termahal");
            System.out.println("3.Selesai");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("MENU \tHARGA");
                    for (int i=0; i<5; i++){
                        System.out.println(menu[i]+"\t"+harga[i]);
                    }
                    break;
                case 2: 
                    String menu2[] = new String[5];
                    menu2 = menu;
                    int harga2[] = new int[5];
                    menu2 = menu;
                    harga2 = harga;
                    for (int i = 0; i < harga2.length - 1; i++) {
                        for (int j = i+1; j < harga2.length; j++) {
                            if(harga2[i] < harga2[j]){
                                int temp = harga2[j];
                                harga2[j] = harga2[i];
                                harga2[i] = temp;
                                //mengurutkan menu makanan
                                String s = menu2[j];
                                menu2[j] = menu2[i];
                                menu2[i] = s;
                            }
                        }
                    }
                    System.out.println("---HARGA TERMAHAL---");
                    System.out.println("MENU \tHARGA");
                    for (int i=0; i<5; i++){
                        System.out.println(menu2[i]+"\t"+harga2[i]);
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih...");
                    break;
            }
        }while(pilih!=3);
    }
}