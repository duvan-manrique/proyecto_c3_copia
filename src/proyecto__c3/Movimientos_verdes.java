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
public class Movimientos_verdes extends Thread{
    JLabel f_verde;
    int ubicacion;
    Coordenadas ficha_verde []=new Coordenadas[14];
    public Movimientos_verdes(JLabel ficha,int ubicacion1){
        this.f_verde=ficha;

        this.ubicacion=ubicacion1;
        
        ficha_verde[0]= new Coordenadas(488,65);
        ficha_verde[1]= new Coordenadas(482,202);
        ficha_verde[2]= new Coordenadas(380,101);
        ficha_verde[3]= new Coordenadas(300,2);
        ficha_verde[4]= new Coordenadas(199,101);
        ficha_verde[5]= new Coordenadas(101,199);
        ficha_verde[6]= new Coordenadas(1,280);
        ficha_verde[7]= new Coordenadas(100,378);
        ficha_verde[8]= new Coordenadas(203,479);
        ficha_verde[9]= new Coordenadas(280,578);
        ficha_verde[10]= new Coordenadas(378,479);
        ficha_verde[11]= new Coordenadas(479,376);
        ficha_verde[12]= new Coordenadas(578,298);
        ficha_verde[13]= new Coordenadas(358,292);
    }
            public void run(){
            f_verde.setLocation(ficha_verde[ubicacion].getX(),ficha_verde[ubicacion].getY());
    }

}
