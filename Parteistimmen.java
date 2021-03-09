/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parteistimmen;

public class Parteistimmen {

    public static void main(String[] args) {
        Partei partei = new Partei("Gewinnerpartei", 500, 600);
        partei.istZuwachs();
        System.out.println(partei.toString());
    }
}
