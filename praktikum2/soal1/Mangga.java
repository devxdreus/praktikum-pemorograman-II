/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2.soal1;

/**
 *
 * @author User
 */
class Mangga {
    int jumlahBeli, harga;
    float berat;
    
    public void nama(String nama){
        System.out.println("Nama Mangga : " + nama);
    }
    
    public void berat(float berat){
        this.berat = berat;
        System.out.println("Berat : " + berat + " kg");
    }
    
    public void beli(int jumlah) {
        jumlahBeli = jumlah;
        System.out.println("Jumlah Beli : " + jumlah);
    }
    
    public void totalBerat(){
        System.out.println("Total berat : " + jumlahBeli * berat + " kg");
    }
    
    public void totalHarga(){
        System.out.println("Total harga : Rp. " + harga * jumlahBeli);
    }
}