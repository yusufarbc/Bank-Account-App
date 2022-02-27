/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author yusuf
 */
public class BankaPersoneli extends Kisi{
    Random random = new Random();
    private String personelID = String.valueOf(random.nextInt(50));
    private ArrayList<Musteri> musteriler = new ArrayList();
    
    public BankaPersoneli(String ad, String soyad, String email, String telefonNumarasi) {
        super(ad, soyad, email, telefonNumarasi);
    }

    public String getPersonelID() {
        return personelID;
    }

    public void setPersonelID(String personelID) {
        this.personelID = personelID;
    }

    public ArrayList<Musteri> getMusteriler() {
        return musteriler;
    }

    public void setMusteriler(ArrayList<Musteri> musteriler) {
        this.musteriler = musteriler;
    }
    
    
}
