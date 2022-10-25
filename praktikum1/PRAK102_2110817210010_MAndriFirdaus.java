package praktikum1;

import java.util.Scanner;

public class PRAK102_2110817210010_MAndriFirdaus {
    public static void main(String[] args) {
        int angka, bil;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan : ");
        angka = keyboard.nextInt();
        
        int i = 7;
        while (i >= 0) {            
            if (angka % 2 == 0){
                bil = (angka / 2) - 1;
            } else {
                bil = angka;
            }
            
            if (i == 7){
               System.out.print(bil);
            } else {
                System.out.print(", " + bil);
            }
            
            angka++;
            i--;
        }
        System.out.println("");
    }
}
