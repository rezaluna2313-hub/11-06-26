/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rza110626;

/**
 *
 * @author LAB-SI-PC
 */


abstract class Bentuk {
    public abstract double getArea();
    public abstract String getName();
}

    class Lingkaran extends Bentuk{
        private double radius;

        public Lingkaran (double radius){
            this.radius = radius;
        }

        @Override
        public double getArea(){
            return Math.PI * radius * radius;
        }

        @Override
        public String getName(){
            return "Lingkaran";
        }
    }

    //subclass square
    class Persegi extends Bentuk {
        private double side;

        public Persegi (double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }

        @Override
        public String getName() {
            return "Persegi";
        }
    }

    //main class
    public class AbstractClass{
        public static void main(String[] args){
            Lingkaran lingkaran = new Lingkaran(8);
            Persegi persegi = new Persegi(6);
            
            System.out.println("Nama    : " + lingkaran.getName());
            System.out.println("Luas    : " + lingkaran.getArea());
            System.out.println("Nama    : " + persegi.getName());
            System.out.println("Luas    : " + persegi.getArea());
        }
    }
            



