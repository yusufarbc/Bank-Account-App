/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;

/**
 *
 * @author yusuf
 */
public class BankaHesabi {
    Random random = new Random();
    private String iban = String.valueOf(random.nextInt(150));
    private double bakiye;

    public BankaHesabi(double bakiye) {
        this.bakiye = bakiye;
    }    

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    
    
}
