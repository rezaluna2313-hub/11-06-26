/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kairanisa_1106;

/**
 *
 * @author LAB-SI-PC
 */
public class Main {
    public static void main(String[] args) {

        Shape lingkaran = new Circle(8);
        Shape persegi = new Square(6);

        System.out.println("Nama Bangun : " + lingkaran.getName());
        System.out.println("Luas        : " + lingkaran.getArea());

        System.out.println();

        System.out.println("Nama Bangun : " + persegi.getName());
        System.out.println("Luas        : " + persegi.getArea());
    }
}