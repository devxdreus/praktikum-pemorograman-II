/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String j, p;
        int t;
        
        System.out.print("Judul : ");
        j = input.nextLine();
        
        System.out.print("Penulis : ");
        p = input.nextLine();
        
        System.out.print("Tahun Terbit : ");
        t = input.nextInt();
        
        Buku book = new Buku(j,p,t);
        book.display();
    }
}
