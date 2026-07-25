/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rza110626;

/**
 *
 * @author LAB-SI-PC
 */
public class InterfaceExample {
    public static void main(String[] args){
        Relation line = new Line(0, 0, 0, 0);
        
        Line line1 = new Line(1, 5, 1, 5);
        Line line2 = new Line(0, 5, 0, 5);
 
        System.out.println(line.isLess(line1, line2));
        System.out.println(line.isGreater(line1, line2));
        System.out.println(line.isEqual(line1, line2));
    }
}
