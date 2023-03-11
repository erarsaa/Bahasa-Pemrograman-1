package Percabangan;
import java.util.Scanner;
public class ProgramPembelian {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int jumlah;
        double hargasatuan,total,tunai;
        double diskon1,diskon2,diskon3,diskon4,diskon5,diskon6;
        double hargajual1,hargajual2,hargajual3,hargajual4,hargajual5,hargajual6;
        double kembalian1,kembalian2,kembalian3,kembalian4,kembalian5,kembalian6;
        //input jumlah dan harga barang
            System.out.println("----PEMBELIAN BARANG----");
            System.out.print("Jumlah Barang : ");
            jumlah = a.nextInt();
            System.out.print("Harga Satuan  : ");
            hargasatuan = a.nextDouble();
            total = jumlah * hargasatuan;
        
        if(total>=0 && total<=100000){
            diskon1 = total * 0.00;
            System.out.println("Diskon 0%     : " +diskon1);
            hargajual1 = total - diskon1;
            System.out.println("----------------------------");
            System.out.println("Harga Jual    : " +hargajual1);
            System.out.print("Tunai         : ");
            tunai = a.nextDouble();
            System.out.println("----------------------------");
            kembalian1 = tunai - hargajual1;
                if(kembalian1==0){
                    System.out.println("UANG PAS,TIDAK PERLU KEMBALIAN");
                }
                else{
                    System.out.println("Kembalian     : " +kembalian1);
                }
                System.out.println("TERIMA KASIH, SELAMAT BELANJA KEMBALI");
        }
        else if (total>=100001 && total<=200000){
            diskon2 = total *0.05;
            System.out.println("Diskon 5%     : " +diskon2);
            hargajual2 = total - diskon2;
            System.out.println("----------------------------");
            System.out.println("Harga Jual    : " +hargajual2);
            System.out.print("Tunai         : ");
            tunai = a.nextDouble();
            System.out.println("----------------------------");
            kembalian2 = tunai - hargajual2;
            if(kembalian2==0){
                System.out.println("UANG PAS, TIDAK PERLU KEMBALIAN");
            }
            else{
                System.out.println("Kembalian     : " +kembalian2);
            }
            System.out.println("TERIMA KASIH, SELAMAT BELANJA KEMBALI");
        }
        else if (total>=200001 && total<=300000){
            diskon3 = total *0.1;
            System.out.println("Diskon 10%    : " +diskon3);
            hargajual3 = total - diskon3;
            System.out.println("----------------------------");
            System.out.println("Harga Jual    : " +hargajual3);
            System.out.print("Tunai         : ");
            tunai = a.nextDouble();
            System.out.println("----------------------------");
            kembalian3 = tunai - hargajual3;
                if(kembalian3==0){
                    System.out.println("UANG PAS, TIDAK PERLU KEMBALIAN");
                }
                else{
                    System.out.println("Kembalian     : " +kembalian3);
                }
                System.out.println("TERIMA KASIH, SELAMAT BELANJA KEMBALI");
        }
        else if (total>=300001 && total<=400000){
            diskon4 = total *0.15;
            System.out.println("Diskon 15%    : " +diskon4);
            hargajual4 = total - diskon4;
            System.out.println("----------------------------");
            System.out.println("Harga Jual    : " +hargajual4);
            System.out.print("Tunai         : ");
            tunai = a.nextDouble();
            System.out.println("----------------------------");
            kembalian4 = tunai - hargajual4;
                if(kembalian4==0){
                    System.out.println("UANG PAS, TIDAK PERLU KEMBALIAN");
                }
                else{
                    System.out.println("Kembalian     : " +kembalian4);
                }
                System.out.println("TERIMA KASIH, SELAMAT BELANJA KEMBALI");
        }
        else if (total>=400001 && total<=500000){
            diskon5 = total *0.20;
            System.out.println("Diskon 20%    : " +diskon5);
            hargajual5 = total - diskon5;
            System.out.println("----------------------------");
            System.out.println("Harga Jual    : " +hargajual5);
            System.out.print("Tunai         : ");
            tunai = a.nextDouble();
            System.out.println("----------------------------");
            kembalian5 = tunai - hargajual5;
                if(kembalian5==0){
                    System.out.println("UANG PAS, TIDAK PERLU KEMBALIAN");
                }
                else{
                    System.out.println("Kembalian     : " +kembalian5);
                }
                System.out.println("TERIMA KASIH, SELAMAT BELANJA KEMBALI");
        }
        else if (total>=500000){
            diskon6 = total *0.25;
            System.out.println("Diskon 25%    : " +diskon6);
            hargajual6 = total - diskon6;
            System.out.println("----------------------------");
            System.out.println("Harga Jual    : " +hargajual6);
            System.out.print("Tunai         : ");
            tunai = a.nextDouble();
            System.out.println("----------------------------");
            kembalian6 = tunai - hargajual6;
            if(kembalian6==0){
                System.out.println("UANG PAS, TIDAK PERLU KEMBALIAN");
            }
            else{
                System.out.println("Kembalian     : " +kembalian6);
            }
            System.out.println("TERIMA KASIH, SELAMAT BELANJA KEMBALI");
        }
        else{
            System.out.println("Harga Salah!");
            System.out.println("Silakan masukkan harga yang valid");
        }
    }
}