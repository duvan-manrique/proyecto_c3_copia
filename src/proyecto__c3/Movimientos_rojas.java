/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto__c3;

import javax.swing.JLabel;

/**
 *
 * @author rojas
 */
public class Movimientos_rojas extends Thread{
    JLabel f_roja;
    int ubicacion;
    Coordenadas ficha_rojo []=new Coordenadas[14];
    
    public Movimientos_rojas(JLabel ficha,int ubicacion1){
        this.f_roja=ficha;

        this.ubicacion=ubicacion1;
        
        ficha_rojo[0]= new Coordenadas(513,490);
        ficha_rojo[1]= new Coordenadas(357,479);
        ficha_rojo[2]= new Coordenadas(478,357);
        ficha_rojo[3]= new Coordenadas(578,280);
        ficha_rojo[4]= new Coordenadas(477,223);
        ficha_rojo[5]= new Coordenadas(357,101);
        ficha_rojo[6]= new Coordenadas(280,3);
        ficha_rojo[7]= new Coordenadas(224,101);
        ficha_rojo[8]= new Coordenadas(99,220);
        ficha_rojo[9]= new Coordenadas(1,299);
        ficha_rojo[10]= new Coordenadas(100,359);
        ficha_rojo[11]= new Coordenadas(222,478);
        ficha_rojo[12]= new Coordenadas(300,576);
        ficha_rojo[13]= new Coordenadas(290,352);
    }
        public void run(){
            f_roja.setLocation(ficha_rojo[ubicacion].getX(),ficha_rojo[ubicacion].getY());
    }
}
