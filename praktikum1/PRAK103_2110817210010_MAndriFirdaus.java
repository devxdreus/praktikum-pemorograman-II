/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PRAK103_2110817210010_MAndriFirdaus {
    public static void main(String[] args) {
        int angka;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan : ");
        angka = keyboard.nextInt();
        
        int i = 5;
        
        do {            
            if (angka % 7 != 0){
                if (i == 5){
                   System.out.print(angka);
                } else {
                    System.out.print(", " + angka);
                }
            }
            
            angka--;
            i--;
        } while (i > 0);
        
        System.out.println("");
    }
}
