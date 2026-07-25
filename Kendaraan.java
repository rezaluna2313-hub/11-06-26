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
    public abstract double getMaxSpeed();
    public abstract String getName();
}

    //subclass mobil
    class Mobil extends Bentuk{

        private double distance;
        private int time;

        public Mobil (double distance, int time){
            this.distance = distance;
            this.time = time;
        }

        @Override
        public double getMaxSpeed(){
            return distance/time;
        }

        @Override
        public String getName(){
            return "Mobil";
        }
    }

     //subclass motor
    class Motor extends Bentuk {
        
        private double jarak;
        private int waktu;
        
        public Motor (double jarak, int waktu){
            this.jarak = jarak;
            this.waktu = waktu;
        }

        @Override
        public double getMaxSpeed(){
            return jarak/waktu;
        }

        @Override
        public String getName(){
            return "Motor";
        }
    }


    //main class
    public class Kendaraan {
        public static void main(String[] args){
            Mobil mobil = new Mobil(800, 16);
            Motor motor = new Motor(600, 12);
            
            System.out.println("Nama    : " + mobil.getName());
            System.out.println("Luas    : " + mobil.getMaxSpeed());
            System.out.println("Nama    : " + motor.getName());
            System.out.println("Luas    : " + motor.getMaxSpeed());
        }
    }

