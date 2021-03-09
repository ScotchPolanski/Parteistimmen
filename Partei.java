/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parteistimmen;

/**
 *
 * @author Admin
 */
public class Partei {
    private String parteiname = "Gewinnerpartei";
    private double stimmenVorher = 500;
    private double stimmenNachher = 600;
    private double Entwicklung = (stimmenNachher-stimmenVorher) / stimmenVorher*100;
    
    
    Partei(String Parteiname, double stimmenVorher, double stimmenNachher)
    {
        this.parteiname = Parteiname;
        this.stimmenVorher = stimmenVorher;
        this.stimmenNachher = stimmenNachher;
        this.Entwicklung = Entwicklung;
    }
    
    public void bestimmeEntwicklung(double Vorher, double Nachher)
    {
        double Entwicklung = ((stimmenNachher-stimmenVorher) / stimmenVorher)*100;
    }
    
    boolean istZuwachs = false;
    public void istZuwachs()
    {
        if(Entwicklung >= 0.01)
        {
            istZuwachs = true;
        }
        else
        {
            istZuwachs = false;
        }
    }
    
    public String toString()
    {
        String Ausgabe1 = "Druecke Enter zum Schliessen";
        if(istZuwachs == true)
        {
            String Ausgabe = "Die Partei '" + parteiname + "' hat einen Zuwachs von " + Entwicklung + "% bekommen.";
            System.out.println(Ausgabe);
        }
        else
        {
            String Ausgabe = "Die Partei '" + parteiname + "' hat einen Verlust von " + Entwicklung + "% bekommen.";
            System.out.println(Ausgabe);
        }
        return Ausgabe1;
    }
}
