/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author ÖZGE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factory factory=new Factory();
        factory.CeviriYap("MATLAB").Ceviri();
        factory.CeviriYap("Java").Ceviri();
        factory.CeviriYap("Python").Ceviri();
    }
    
}
