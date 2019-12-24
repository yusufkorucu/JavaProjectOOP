/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPJava;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author yusuf
 */
public class SP_P {
    
    public double Kokorec;
    
    public double Sucuk;
    
    public double CigKofte;
    
    public double Izgara;
    
    public double Tavuk;
    
    public double Kofte ;
    
    public double Su;
    public double Ayran;
    public double Kola;
    public double Gazoz;
    public double Salgam;
    public double Soda;
    
    
    public double Yiyecek;
    
    public double Icecek;
    
    public double ToplamTutar;
    
    public double GenelToplam;
    
    public double GetirMiktar(){
        
        Yiyecek=Kokorec+Sucuk+CigKofte+Izgara+Tavuk+Kofte;
        Icecek=Su+Ayran+Kola+Gazoz+Salgam+Soda;
        ToplamTutar=Yiyecek+Icecek;
        
        GenelToplam=ToplamTutar;
        
        return GenelToplam;
    }
    
    
    private  JFrame frame;
    
    public void iExitSystem()
    {
        frame=new JFrame("Cikis");
        
        if(JOptionPane.showConfirmDialog(frame,"Çıkış Yapmak mı İstiyorsun","Tepe Kokoreç",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
        
    }
    //=======================================FİŞ===========================================
    
    public double pKokorec=10.50;
    
    public double pSucuk=9.50;
    
    public double pCigKofte=4.50;
    
    public double pIzgara=15.00;
    
    public double pTavuk=8.00;
    
    public double pKofte=12.50 ;
    
    public double pSu=1.00;
    public double pAyran=1.00;
    public double pKola=2.50;
    public double pGazoz=2.50;
    public double pSalgam=2.00;
    public double pSoda=1.25;
    
    
    
    
    
    
    
    //+======================================================================================
    
    public double yk=0.9;
    
    public Double cBul(double cHesap){
    
    
    double cBul=cHesap-(cHesap*yk);
    return cBul;
    }
    
    //======================================================================================
    
}
