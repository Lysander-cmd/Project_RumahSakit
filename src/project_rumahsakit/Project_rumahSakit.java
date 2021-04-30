/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_rumahsakit;


public class Project_rumahSakit {
    private String nama_pasien;
    private String jenis_kelamin;
    private int umur;
    public String no_hp;
    protected double jam_buka;
    
    public void setNamaPasien (String nama_pasien){
        this.nama_pasien = nama_pasien;
    }
    public String getNamaPasien(){
        return nama_pasien;
    }
    public void setJenisKelamin (String jenis_kelamin){
        this.jenis_kelamin = jenis_kelamin;
    }
    public String getJenisKelamin(){
        return jenis_kelamin;
    }
    public void setUmur (int umur){
        this.umur = umur ;
    }
    public int getUmur(){
        return umur;
    }
    public void setJamBuka (double jam_buka){
        this.jam_buka = jam_buka ;
    }
    public double getJamBuka(){
        return jam_buka;
    }
    int antrian(){
        return 0;
    }
    public void penutup(){
        System.out.println("Terimakasih sudah memilih rumah sakit kami");
    }
}
