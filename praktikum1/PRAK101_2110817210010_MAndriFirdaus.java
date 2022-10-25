package praktikum1;

import java.util.Scanner;

public class PRAK101_2110817210010_MAndriFirdaus {
    public static void main(String[] args) {
        String nama, tempat, bulanLahir;
        int tanggal, bulan, tahun, tinggi;
        float berat;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Praktikum Pemograman II Pertemuan ke-1");
        System.out.println("Nama : M. Andri Firdaus");
        System.out.println("NIM  : 2110817210010");
        
        System.out.print("Masukkan Nama Lengkap : ");
        nama = keyboard.nextLine();

        System.out.print("Masukkan Tempat Lahir : ");
        tempat = keyboard.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir : ");
        tanggal = keyboard.nextInt();
        
        System.out.print("Masukkan Bulan Lahir : ");
        bulan = keyboard.nextInt();
        
        System.out.print("Masukkan Tahun Lahir : ");
        tahun = keyboard.nextInt();
        
        System.out.print("Masukkan Tinggi Badan : ");
        tinggi = keyboard.nextInt();
        
        System.out.print("Masukkan Berat Badan : ");
        berat = keyboard.nextFloat();
        
        switch (bulan) {
            case 1 -> bulanLahir = "Januari";
            case 2 -> bulanLahir = "Februari";
            case 3 -> bulanLahir = "Maret";
            case 4 -> bulanLahir = "April";
            case 5 -> bulanLahir = "Mei";
            case 6 -> bulanLahir = "Juni";
            case 7 -> bulanLahir = "Juli";
            case 8 -> bulanLahir = "Agustus";
            case 9 -> bulanLahir = "September";
            case 10 -> bulanLahir = "Oktober";
            case 11 -> bulanLahir = "November";
            case 12 -> bulanLahir = "Desember";
            default -> throw new AssertionError();
        }
        
        System.out.println("Data telah ditambahkan,");
        System.out.print("Nama Lengkap " + nama);
        System.out.print(", Lahir di " + tempat);
        System.out.println(" pada Tanggal " + tanggal + " " + bulanLahir + " " + tahun);
        System.out.print("Tinggi Badan " + tinggi + " cm ");
        System.out.println("dan Berat Badan " + berat + " Kilogram");
    }
}
