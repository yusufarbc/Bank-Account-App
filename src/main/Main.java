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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static BankaPersoneli personel = new BankaPersoneli("Yusuf", "Arabacı", "yusuftalhaarabaci@hotmail.com", "+900000000000");

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        mainWindow.show();
   }   
    
}
