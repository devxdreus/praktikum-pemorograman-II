/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author User
 */
public class Paint {
    private double coverage;
    
    public Paint(double c){
        coverage = c;
    }
    
    public double amount(Shape s){
        return s.area() / coverage;
    }
}
