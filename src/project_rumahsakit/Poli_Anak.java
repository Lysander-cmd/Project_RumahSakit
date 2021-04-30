/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_rumahsakit;


public class Poli_Anak extends Project_rumahSakit {
    int umur;
   
    
    @Override
    int antrian(){
        int antrian = 2*umur;
        return antrian;
    }
}
