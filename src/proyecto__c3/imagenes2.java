package proyecto__c3;


import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class imagenes2 {
      public ImageIcon icoImagen;
    public ImageIcon gifDado2(int Dado2){
        switch(Dado2){
            case 1:
                icoImagen=new ImageIcon(getClass().getResource("/img/gifs/dados-01.gif"));break;
            case 2:
                icoImagen=new ImageIcon(getClass().getResource("/img/gifs/dados-02.gif"));break;
            case 3:
                icoImagen=new ImageIcon(getClass().getResource("/img/gifs/dados-03.gif"));break;
            case 4:
                icoImagen=new ImageIcon(getClass().getResource("/img/gifs/dados-04.gif"));break;
            case 5:
                icoImagen=new ImageIcon(getClass().getResource("/img/gifs/dados-05.gif"));break;
            case 6:
                icoImagen=new ImageIcon(getClass().getResource("/img/gifs/dados-06.gif"));break;
        }
        return icoImagen;
    }
}
