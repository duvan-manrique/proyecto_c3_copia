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
import javax.swing.ImageIcon;
public class imagenes1 {
    public ImageIcon icoImagen;
    public ImageIcon gifDado1(int Dado1){
        switch(Dado1){
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
