/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2.soal2;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author User
 */
public class Mobil {
    String merek, tahun_keluaran, pemilik;
    int kapasitas, harga;
    
    void info(){
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Harga: " + format(harga));
        System.out.println("Tahun keluaran: " + tahun_keluaran);
        System.out.println("Kapasitas: " + kapasitas + "cc");
    }
    
    void setPemilik(String nama){
        pemilik = nama;
    }
    
    String getPemilik(){
        return pemilik;
    }
    
    String getPajak(){
       return format(harga * 0.02); 
    }
    
    String format(double uang){
        Locale locale = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        return numberFormat.format(uang);
    }
}
