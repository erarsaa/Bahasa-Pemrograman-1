package scwithcase;
import java.util.Scanner;
public class warungsederhana {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        //Deklarasi variabel
        int pilih,pilih2;
        double jumlah,total,diskon,hargaakhir;
        double sateayam = 1500;
        double satekambing = 3000;
        double pecelayam = 13000;
        double pecelempal = 15000;
        double penyettahutempe = 5000;
        double penyettelur = 7000;
        double penyetayam = 10000;
        
        //Input
        System.out.println("Warung Sederhana");
        System.out.println("MENU");
        System.out.println("1. Sate");
        System.out.println("2. Pecel");
        System.out.println("3. Penyetan");
        
        //Input pilihan
        System.out.print("Pilih Menu = ");
            pilih = a.nextInt();
        
        //Seleksi pilihan
        switch(pilih){
            case 1:
                System.out.println("\nSate");
                System.out.println("1. Sate Ayam");
                System.out.println("2. Sate Kambing");
                System.out.print("Pilih jenis = ");
                    pilih = a.nextInt();
                        if(pilih==1){
                            System.out.print("\nJumlah per Tusuk = ");
                                jumlah = a.nextDouble();
                            total = sateayam*jumlah;
                            System.out.println("Total Harga      = " +total);
                            System.out.println("\nApakah punya kartu member?");
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            System.out.print("Pilih = ");
                                pilih = a.nextInt();
                                    if(pilih==1){
                                            diskon = 0.05*total;
                                        System.out.println("\nPotongan 5% = " +diskon);
                                            hargaakhir = total-diskon;
                                        System.out.println("Harga Jual  = " +hargaakhir);
                                    }
                                    else if(pilih==2){
                                        System.out.println("\nHarga jual = " +total);
                                    }
                                    else{
                                        System.out.println("\nPILIHAN TIDAK ADA!");
                                    }
                        }
                        else if (pilih==2){
                            System.out.print("\nJumlah per Tusuk = ");
                                jumlah = a.nextDouble();
                            total = satekambing*jumlah;
                            System.out.println("Total Harga      = " +total);
                            System.out.println("\nApakah punya kartu member?");
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            System.out.print("Pilih = ");
                                pilih = a.nextInt();
                                    if(pilih==1){
                                            diskon = 0.05*total;
                                        System.out.println("\nPotongan 5% = " +diskon);
                                            hargaakhir = total-diskon;
                                        System.out.println("Harga Jual  = " +hargaakhir);
                                    }
                                    else if(pilih==2){
                                        System.out.println("\nHarga jual = " +total);
                                    }
                                    else{
                                        System.out.println("\nPILIHAN TIDAK ADA!");
                                    }
                        }
                        else{
                            System.out.println("PILIHAN TIDAK ADA!");
                        }
                break;
            case 2:
                System.out.println("\nPecel");
                System.out.println("1. Pecel Ayam");
                System.out.println("2. Pecel Empal");
                System.out.print("Pilih Jenis = ");
                    pilih = a.nextInt();
                        if(pilih==1){
                            System.out.print("\nJumlah Porsi = ");
                                jumlah = a.nextDouble();
                            total = pecelayam*jumlah;
                            System.out.println("Total Harga = " +total);
                            System.out.println("\nApakah punya kartu member?");
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            System.out.print("Pilih = ");
                                pilih = a.nextInt();
                                    if(pilih==1){
                                            diskon = 0.05*total;
                                        System.out.println("\nPotongan 5% = " +diskon);
                                            hargaakhir = total-diskon;
                                        System.out.println("Harga Jual  = " +hargaakhir);
                                    }
                                    else if(pilih==2){
                                        System.out.println("\nHarga jual = " +total);
                                    }
                                    else{
                                        System.out.println("\nPILIHAN TIDAK ADA!");
                                    }
                        }
                        else if (pilih==2){
                            System.out.print("\nJumlah Porsi = ");
                                jumlah = a.nextDouble();
                            total = pecelempal*jumlah;
                            System.out.println("Total Harga = " +total);
                            System.out.println("\nApakah punya kartu member?");
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            System.out.print("Pilih = ");
                                pilih = a.nextInt();
                                    if(pilih==1){
                                            diskon = 0.05*total;
                                        System.out.println("\nPotongan 5% = " +diskon);
                                            hargaakhir = total-diskon;
                                        System.out.println("Harga Jual  = " +hargaakhir);
                                    }
                                    else if(pilih==2){
                                        System.out.println("\nHarga jual = " +total);
                                    }
                                    else{
                                        System.out.println("\nPILIHAN TIDAK ADA!");
                                    }
                        }
                        else{
                            System.out.println("PILIHAN TIDAK ADA!");
                        }
                break;
            case 3:
                System.out.println("\nPenyetan");
                System.out.println("1. Penyetan Tahu/Tempe");
                System.out.println("2. Penyetan Telur");
                System.out.println("3. Penyetan Ayam");
                System.out.print("Pilih Jenis = ");
                    pilih2 = a.nextInt();
                            switch(pilih2){
                                case 1:
                                    System.out.print("\nJumlah Porsi = ");
                                        jumlah = a.nextDouble();
                                    total = penyettahutempe*jumlah;
                                    System.out.println("Total Harga = " +total);
                                    System.out.println("\nApakah punya kartu member?");
                                    System.out.println("1. Ya");
                                    System.out.println("2. Tidak");
                                    System.out.print("Pilih = ");
                                        pilih = a.nextInt();
                                            if(pilih==1){
                                                    diskon = 0.05*total;
                                                System.out.println("\nPotongan 5% = " +diskon);
                                                    hargaakhir = total-diskon;
                                                System.out.println("Harga Jual  = " +hargaakhir);
                                            }
                                            else if(pilih==2){
                                                System.out.println("\nHarga jual = " +total);
                                            }
                                            else{
                                                System.out.println("\nPILIHAN TIDAK ADA!");
                                            }
                                    break;
                                case 2:
                                    System.out.print("\nJumlah Porsi = ");
                                        jumlah = a.nextDouble();
                                    total = penyettelur*jumlah;
                                    System.out.println("Total Harga = " +total);
                                    System.out.println("\nApakah punya kartu member?");
                                    System.out.println("1. Ya");
                                    System.out.println("2. Tidak");
                                    System.out.print("Pilih = ");
                                        pilih = a.nextInt();
                                            if(pilih==1){
                                                    diskon = 0.05*total;
                                                System.out.println("\nPotongan 5% = " +diskon);
                                                    hargaakhir = total-diskon;
                                                System.out.println("Harga Jual  = " +hargaakhir);
                                            }
                                            else if(pilih==2){
                                                System.out.println("\nHarga jual = " +total);
                                            }
                                            else{
                                                System.out.println("\nPILIHAN TIDAK ADA!");
                                            }
                                    break;
                                case 3:
                                    System.out.print("\nJumlah Porsi = ");
                                        jumlah = a.nextDouble();
                                    total = penyetayam*jumlah;
                                    System.out.println("Total Harga = " +total);
                                    System.out.println("\nApakah punya kartu member?");
                                    System.out.println("1. Ya");
                                    System.out.println("2. Tidak");
                                    System.out.print("Pilih = ");
                                        pilih = a.nextInt();
                                            if(pilih==1){
                                                    diskon = 0.05*total;
                                                System.out.println("\nPotongan 5% = " +diskon);
                                                    hargaakhir = total-diskon;
                                                System.out.println("Harga Jual  = " +hargaakhir);
                                            }
                                            else if(pilih==2){
                                                System.out.println("\nHarga jual = " +total);
                                            }
                                            else{
                                                System.out.println("\nPILIHAN TIDAK ADA!");
                                            }
                                    break;
                                default:
                                    System.out.println("PILIHAN TIDAK ADA!");
                            }
                break;
            default:
                System.out.println("PILIHAN TIDAK ADA!");
        }
    }

}