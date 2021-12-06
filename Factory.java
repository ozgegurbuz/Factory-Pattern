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
public class Factory {
    public ICevir CeviriYap(String tur){
        ICevir nesne=null;
        switch(tur){
            case "Java"   :nesne =new Java(".java"); break;
            case "MATLAB" :nesne=new MATLAB(".mat"); break;
            case "Python" :nesne =new Python(".py"); break;
            default: System.out.println("Yanlış tür seçimi"); return null;
        }
        return nesne;
    }
}
