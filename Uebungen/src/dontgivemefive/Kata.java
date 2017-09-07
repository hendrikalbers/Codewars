/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dontgivemefive;

/**
 *
 * @author Hendrik.Albers
 */
public class Kata {

    public static int dontGiveMeFive(int start, int end) {
        int zaehler = 0;
        System.out.println("---------");
        System.out.println("Start: " + start);
        System.out.println("Ende: " + end);
        System.out.println("---------");
                             
                // von start bis ende iterieren
        for (int i = start ; i <= end; i++) {

            // Werte in String konvertieren und prüfen auf 5
            Boolean intVorhanden = String.valueOf(i).contains("5");
            
            
            // Wenn 5 nicht vorhanden -> zaehlen
            if (intVorhanden != true) {
                zaehler += 1;
                System.out.println("Zahl = " + i);
            }
        }

        // hochgezaehlten Wert zurückgeben
        return zaehler;
    }
}
