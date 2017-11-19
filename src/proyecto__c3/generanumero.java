package proyecto__c3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.util.Random;

public class generanumero {
    public int valorTira;
    public int calculanumero(){
        Random Generar=new Random();
        valorTira=Generar.nextInt(6)+1;
        return valorTira;
    }
}
