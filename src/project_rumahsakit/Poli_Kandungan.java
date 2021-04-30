/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_rumahsakit;

/**
 *
 * @author USER
 */
public class Poli_Kandungan extends Project_rumahSakit {
    int bulan;
    
    @Override
    int antrian(){
        int antrian = 2*bulan;
        return antrian;
    }
}
