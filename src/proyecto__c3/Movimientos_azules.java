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
public class Movimientos_azules extends Thread{
    JLabel f_azul;
    int ubicacion;
    Coordenadas ficha_azul []=new Coordenadas[14];
    
    public Movimientos_azules(JLabel ficha,int ubicacion1){
        this.f_azul=ficha;

        this.ubicacion=ubicacion1;
        
         ficha_azul[0]= new Coordenadas(63,90);
        ficha_azul[1]= new Coordenadas(239,102);
        ficha_azul[2]= new Coordenadas(99,240);
        ficha_azul[3]= new Coordenadas(1,319);
        ficha_azul[4]= new Coordenadas(102,339);
        ficha_azul[5]= new Coordenadas(239,478);
        ficha_azul[6]= new Coordenadas(319,578);
        ficha_azul[7]= new Coordenadas(339,479);
        ficha_azul[8]= new Coordenadas(478,338);
        ficha_azul[9]= new Coordenadas(577,262);
        ficha_azul[10]= new Coordenadas(478,241);
        ficha_azul[11]= new Coordenadas(339,102);
        ficha_azul[12]= new Coordenadas(262,2);
        ficha_azul[13]= new Coordenadas(292,223);
    }
            public void run(){
            f_azul.setLocation(ficha_azul[ubicacion].getX(),ficha_azul[ubicacion].getY());
    }
 
}
