/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author yusuf
 */
public class Musteri extends Kisi{
    Random random = new Random();
    private String musteriNumarasi = String.valueOf(random.nextInt(100));
    private ArrayList<BankaHesabi> hesaplar = new ArrayList();
    private ArrayList<KrediKarti> krediKartlari = new ArrayList();

    public Musteri(String ad, String soyad, String email, String telefonNumarasi) {
        super(ad, soyad, email, telefonNumarasi);      
    }
    
    public BankaHesabi hesapEkle(String hesapTuru){
        BankaHesabi hesap = new BankaHesabi(0);
        if(hesapTuru == "1"){
            BankaHesabi bankaHesabi = new VadesizHesap(1000);
            hesaplar.add(bankaHesabi);
            JOptionPane.showMessageDialog(null, "Vadesiz hesap eklendi\n ıban = " + bankaHesabi.getIban(), "işlem", 1);
            hesap = bankaHesabi;
        }
        else if(hesapTuru == "2"){
            BankaHesabi bankaHesabi = new YatirimHesabi(1000);
            hesaplar.add(bankaHesabi);
            JOptionPane.showMessageDialog(null, "Yarırım hesabı eklendi\n ıban = " + bankaHesabi.getIban(), "işlem", 1);
            hesap = bankaHesabi;
        }
        return hesap;
    }
    
    public KrediKarti krediKartiEkle(){
        KrediKarti krediKarti = new KrediKarti(1000, 0);
        krediKartlari.add(krediKarti);
        JOptionPane.showMessageDialog(null, "kredi kartı eklendi\n kart numarası = " + krediKarti.getKartNumarasi(), "işlem", 1);
        return krediKarti;
    }
    
    public void hesapSil(BankaHesabi hesap){
        if (hesap.getBakiye() != 0){
            JOptionPane.showMessageDialog(null,"lütfen öncelikle bakiyenizi başka bir hesaba aktarınız","uyarı",2); 
        }
        else{
            hesaplar.remove(hesap);
            JOptionPane.showMessageDialog(null, "hesap silindi\n ıban = " + hesap.getIban(), "işlem", 1);
            
            
            
        }
    }
    
    public void krediKartiSil(KrediKarti kart){
        if(kart.getGuncelBorc() != 0){
            JOptionPane.showMessageDialog(null,"lütfen öncelikle borç ödemesi yapınız","uyarı",2); 
        }
        else{
            krediKartlari.remove(kart);
            JOptionPane.showMessageDialog(null, "kredi kartı silindi\n kart numarası = " + kart.getKartNumarasi(), "işlem", 1);
        }
    }
    
    public String getMusteriNumarasi() {
        return musteriNumarasi;
    }

    public void setMusteriNumarasi(String musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }    

    public ArrayList<BankaHesabi> getHesaplar() {
        return hesaplar;
    }

    public void setHesaplar(ArrayList<BankaHesabi> hesaplar) {
        this.hesaplar = hesaplar;
    }

    public ArrayList<KrediKarti> getKrediKartlari() {
        return krediKartlari;
    }

    public void setKrediKartlari(ArrayList<KrediKarti> krediKartlari) {
        this.krediKartlari = krediKartlari;
    }
    
    
    
}
