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
public class KrediKarti {
    Random random = new Random();
    private String KartNumarasi = String.valueOf(random.nextInt(150));
    private double limit;
    private double guncelBorc;
    private double kullanılabilirLimit;

    public KrediKarti(double limit, double guncelBorc) {
        this.limit = limit;
        this.guncelBorc = guncelBorc;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getKartNumarasi() {
        return KartNumarasi;
    }

    public void setKartNumarasi(String KartNumarasi) {
        this.KartNumarasi = KartNumarasi;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getGuncelBorc() {
        return guncelBorc;
    }

    public void setGuncelBorc(double guncelBorc) {
        this.guncelBorc = guncelBorc;
    }

    public double getKullanılabilirLimit() {
        return kullanılabilirLimit;
    }

    public void setKullanılabilirLimit(double kullanılabilirLimit) {
        this.kullanılabilirLimit = kullanılabilirLimit;
    }
    
    
    
    
        
}
