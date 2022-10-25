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
public class PRAK104_2110817210010_MAndriFirdaus {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int scoreAndi = 0, scoreBudi = 0;
        
        System.out.print("Kartu Andi : ");
        int andi1 = keyboard.nextInt();
        int andi2 = keyboard.nextInt();
        int andi3 = keyboard.nextInt();
        
        System.out.print("Kartu Budi : ");
        int budi1 = keyboard.nextInt();
        int budi2 = keyboard.nextInt();
        int budi3 = keyboard.nextInt();
        
        int [] andi = {andi1, andi2, andi3};
        int [] budi = {budi1, budi2, budi3};
        
        for (int i = 0; i < 3; i++){
            if (andi[i] > budi[i]){
                scoreAndi++;
            } else if (andi[i] < budi[i]){
                scoreBudi++;
            }
        }
        
        if (scoreAndi > scoreBudi){
            System.out.println("Andi");
        } else if (scoreAndi < scoreBudi){
            System.out.println("Budi");
        }
        else {
            System.out.println("Seri");
        }
        
        System.out.println("");
    }
}
