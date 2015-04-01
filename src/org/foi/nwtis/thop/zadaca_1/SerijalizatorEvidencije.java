/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.nwtis.thop.zadaca_1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.foi.nwtis.thop.konfiguracije.Konfiguracija;

/**
 *
 * @author NWTiS_3 test
 */
public class SerijalizatorEvidencije extends Thread {

    Konfiguracija konfig;
    boolean kraj;

    public SerijalizatorEvidencije(Konfiguracija konfig) {
        super();
        this.konfig = konfig;
        this.kraj = false;
    }

    public void setKraj(boolean kraj) {
        this.kraj = kraj;
    }
    

    @Override
    public void interrupt() {
        super.interrupt(); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public void run() {

        while (kraj == false) {
            try {
                    TimeUnit.SECONDS.sleep(30);
                } catch (InterruptedException ex) {
                    Logger.getLogger(KlijentSustava.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            System.out.println("PROLAZ KROZ DRETVU SERIJALIZACIJE");
            
            
            Evidencija e = new Evidencija("evidDatoteka");

        }
    }

    @Override
    public synchronized void start() {
        super.start(); //To change body of generated methods, choose Tools | Templates.
    }

}
