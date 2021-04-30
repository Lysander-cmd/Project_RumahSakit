/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_rumahsakit;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
            //variabel lokal
            int pilih;
            //Scanner
            Scanner input = new Scanner (System.in);
            //objek
            Project_rumahSakit isi = new Project_rumahSakit();
            Poli_Anak oke = new Poli_Anak();
            Poli_Kandungan ya = new Poli_Kandungan();
            
            //Isi
            System.out.println("Selamat datang di Rumah sakit x");
            System.out.println("Masukan nama anda : ");
            isi.setNamaPasien("Adam");
            System.out.println(isi.getNamaPasien());
            System.out.println("Masukan jenis kelamin anda : ");
            isi.setJenisKelamin("Laki laki");
            System.out.println(isi.getJenisKelamin());
            System.out.println("Masukan umur anda : ");
            isi.setUmur(10);
            System.out.println(isi.getUmur());
            do{
            System.out.println("Berikut daftar poli : ");
            System.out.println("1. Poli anak");
            System.out.println("2. Poli kandungan");
            System.out.println(" Masukan nomor  poli yang anda inginkan ");
            pilih = input.nextInt();
            switch (pilih){
                case 1 : 
                    System.out.println("Anda memilih poli anak");
                    System.out.println("Berikut jam buka poli anak  : ");
                    System.out.println("1. 10.00");
                    System.out.println("2. 15.00");
                    System.out.println("Masukan pilihan anda : ");
                    isi.setJamBuka(10.00);
                    System.out.println(isi.getJamBuka()+"0");
                    oke.umur = 10;
                    System.out.println("Anda mendapat nomor antrian : " +oke.antrian());
                    System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
                    System.out.println("Nama anda adalah : "+isi.getNamaPasien());
                    System.out.println("Jenis Kelamin anda adalah  : "+isi.getJenisKelamin());
                    System.out.println("Umur anda adalah  : "+isi.getUmur());
                    System.out.println("Anda memilih poli anak");
                    System.out.println("Anda memilih jam kedatangan : "+isi.getJamBuka()+"0");
                    System.out.println("Anda mendapat nomor antrian : " +oke.antrian());
                    oke.penutup();
                    break;
                case 2 : 
                    System.out.println("Anda memilih poli Kandungan");
                    System.out.println("Berapa bulan kandungan anda : ");
                    ya.bulan = 7;
                    System.out.println(ya.bulan);
                    System.out.println("Berikut jam buka poli kandungan : ");
                    System.out.println("1. 09.00");
                    System.out.println("2. 13.00");
                    System.out.println("Masukan pilihan anda : ");
                    isi.setJamBuka(13.);
                    System.out.println(isi.getJamBuka()+"0");
                    oke.umur = 10;
                    System.out.println("Anda mendapat nomor antrian : " +ya.antrian());
                    System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
                    System.out.println("Nama anda adalah : "+isi.getNamaPasien());
                    System.out.println("Jenis Kelamin anda adalah  : "+isi.getJenisKelamin());
                    System.out.println("Umur anda adalah  : "+isi.getUmur());
                    System.out.println("Umur kehamilan anda adalah : "+ya.bulan);
                    System.out.println("Anda memilih poli kandungan");
                    System.out.println("Anda memilih jam kedatangan : "+isi.getJamBuka()+"0");
                    System.out.println("Anda mendapat nomor antrian : " +ya.antrian());
                    oke.penutup();
                    break;
            }
    }while(pilih>2);
            }
}
