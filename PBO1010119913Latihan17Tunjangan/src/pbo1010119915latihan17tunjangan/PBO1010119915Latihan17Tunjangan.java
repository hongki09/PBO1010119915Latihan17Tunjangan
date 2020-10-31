/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1010119915latihan17tunjangan;

import java.util.Scanner;


/**
 *
 * @author M Hongki Alfikram
 * Kelas : IF10-K
 * NIM :10119915 */
public class PBO1010119915Latihan17Tunjangan {
public static double value_gaji;
    public static double value_tunjangan;
    public static String value_status;
    
    public void resultTotal(double gaji,double tunjangan){
        System.out.println("=========== Hasil Perhitungan Gaji Anda ===========");
        System.out.println("Gaji Pokok \t\t: "+gaji);
        System.out.println("Tunjangan \t\t: "+tunjangan);
        System.out.println("Total Gaji \t\t: "+(gaji + tunjangan));
    }
    public static void main(String args[]){

        //Masukan Value Gaji
        PBO1010119915Latihan17Tunjangan latihan17 = new PBO1010119915Latihan17Tunjangan();
        Scanner input_gaji = new Scanner(System.in);
        Scanner status = new Scanner(System.in);
        System.out.println("========= Tunjangan =========");
        System.out.print("Berapa Gaji pokok anda perbulan?\t: Rp. ");
        value_gaji = input_gaji.nextInt();
        //Memasukan Value Status
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        value_status = status.nextLine();        
        //Scanner untuk menyimpan value
        if(value_status.equals("Menikah") || value_status.equals("menikah")){
            value_tunjangan = value_gaji*0.35;   
            latihan17.resultTotal(value_gaji,value_tunjangan);
        }else if(value_status.equals("Belum") || value_status.equals("belum")){
            value_tunjangan = 0;
            latihan17.resultTotal(value_gaji,value_tunjangan);
        }else{
            System.out.println();
            System.out.println("================== Error ==================");
            System.out.print("Maaf value status hanya bisa Menikah dan Belum");
        }
        
    }
    
}