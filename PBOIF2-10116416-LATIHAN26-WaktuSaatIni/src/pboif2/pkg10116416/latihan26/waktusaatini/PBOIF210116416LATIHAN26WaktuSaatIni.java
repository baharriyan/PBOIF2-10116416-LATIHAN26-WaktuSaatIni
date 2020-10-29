/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10116416.latihan26.waktusaatini;

/**
 *
 * @author Riyan bahar
 * nim: 10116416
 * PBOIF2
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class PBOIF210116416LATIHAN26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateTime = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss");
        String showDateTime = dateTime.format(cal.getTime());
        System.out.println("Hari ini adalah hari : " + showDateTime);
        System.out.println("");
    }
    
}
