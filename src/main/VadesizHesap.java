/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author yusuf
 */
public class VadesizHesap extends BankaHesabi{
    private String hesapTürü;

    public VadesizHesap(int bakiye) {
        super(bakiye);
    }
        
    public static void paraTransfer(BankaHesabi aliciHesabi, BankaHesabi gonderenHesabi, double miktar){
        gonderenHesabi.setBakiye(gonderenHesabi.getBakiye() - miktar);
        aliciHesabi.setBakiye(aliciHesabi.getBakiye() + miktar);
        JOptionPane.showMessageDialog(null, "Para transferi gerçekleşti", "işlem", 1);
    }
    
    public static void krediKartiBorcOdeme(BankaHesabi hesap, KrediKarti kart, double miktar){
        hesap.setBakiye(hesap.getBakiye() - miktar);
        kart.setGuncelBorc(kart.getGuncelBorc() - miktar);   
        JOptionPane.showMessageDialog(null, "kredi kartı borç ödeme işlemi gerçekleşti", "işlem", 1);
    }
       
    
}
