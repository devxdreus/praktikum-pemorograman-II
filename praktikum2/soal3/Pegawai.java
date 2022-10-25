/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2.soal3;

/**
 *
 * @author User
 */
//Dibaris ini adalah kesalahan penulis nama kelas sehingga diganti menjadi kelas PEgawai
//public class Employee {
public class Pegawai {
    public String nama;
    
//    Terjadi error karena kesalah tipe data, ubah tipe data dari char ke String
//    public char asal;
    public String asal;
    
    public String jabatan;
    public int umur;
    
    public String getNama() {
        return nama;
    }
    
    public String getAsal() {
        return asal;
    }
    
//    Dibaris ini perlu ditambahkan parameter agar argumen bisa disimpan
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}