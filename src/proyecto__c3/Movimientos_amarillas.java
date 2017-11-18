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
public class Movimientos_amarillas extends Thread{
    JLabel f_amarilla;
    int ubicacion;
    Coordenadas ficha_amarillo []=new Coordenadas[14];
    
    public Movimientos_amarillas(JLabel ficha,int ubicacion1){
        this.f_amarilla=ficha;

        this.ubicacion=ubicacion1;
        
        ficha_amarillo[0]= new Coordenadas(92,515);
        ficha_amarillo[1]= new Coordenadas(100,397);
        ficha_amarillo[2]= new Coordenadas(184,474);
        ficha_amarillo[3]= new Coordenadas(260,579);
        ficha_amarillo[4]= new Coordenadas(396,482);
        ficha_amarillo[5]= new Coordenadas(481,399);
        ficha_amarillo[6]= new Coordenadas(577,319);
        ficha_amarillo[7]= new Coordenadas(478,184);
        ficha_amarillo[8]= new Coordenadas(397,101);
        ficha_amarillo[9]= new Coordenadas(318,2);
        ficha_amarillo[10]= new Coordenadas(184,101);
        ficha_amarillo[11]= new Coordenadas(100,182);
        ficha_amarillo[12]= new Coordenadas(3,261);
        ficha_amarillo[13]= new Coordenadas(222,283);
        
    }
public void run(){
            f_amarilla.setLocation(ficha_amarillo[ubicacion].getX(),ficha_amarillo[ubicacion].getY());
    }

}
