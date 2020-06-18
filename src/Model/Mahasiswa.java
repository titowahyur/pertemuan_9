/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tito Wahyu
 */
public class Mahasiswa {
    private String NRP, Nama, NoHP, Alamat;
    
    public Mahasiswa() {
        
    }

    public Mahasiswa(String NRP, String Nama, String NoHP, String Alamat) {
        this.NRP = NRP;
        this.Nama = Nama;
        this.NoHP = NoHP;
        this.Alamat = Alamat;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setNoHP(String NoHP) {
        this.NoHP = NoHP;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNRP() {
        return NRP;
    }

    public String getNama() {
        return Nama;
    }

    public String getNoHP() {
        return NoHP;
    }

    public String getAlamat() {
        return Alamat;
    }
    
    
}
