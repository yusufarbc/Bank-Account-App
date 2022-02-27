/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author yusuf
 */
public class YatirimHesabi extends BankaHesabi{
    private String hesapTürü;

    public YatirimHesabi(int bakiye) {
        super(bakiye);
    }
    
    public void paraEkle(BankaHesabi aliciHesabi, BankaHesabi gonderenHesabi, double miktar){
        gonderenHesabi.setBakiye(gonderenHesabi.getBakiye() - miktar);
        aliciHesabi.setBakiye(aliciHesabi.getBakiye() + miktar);
    }
    
    public void paraÇek(BankaHesabi aliciHesabi, BankaHesabi gonderenHesabi, double miktar){
        gonderenHesabi.setBakiye(gonderenHesabi.getBakiye() - miktar);
        aliciHesabi.setBakiye(aliciHesabi.getBakiye() + miktar);
    }
    
}
