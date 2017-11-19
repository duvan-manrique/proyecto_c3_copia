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
public class imagenesResul {
     public ImageIcon icoImagen;
    public ImageIcon Imaen(int vDado){
        switch(vDado){
            case 1:
                icoImagen=new ImageIcon("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\juegosdados\\src\\img\\d1.png");break;
            case 2:
                icoImagen=new ImageIcon("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\juegosdados\\src\\img\\d2.png");break;
            case 3:
                icoImagen=new ImageIcon("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\juegosdados\\src\\img\\d3.png");break;
            case 4:
                icoImagen=new ImageIcon("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\juegosdados\\src\\img\\d4.png");break;
            case 5:
                icoImagen=new ImageIcon("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\juegosdados\\src\\img\\d5.png");break;
            case 6:
                icoImagen=new ImageIcon("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\juegosdados\\src\\img\\d6.png");break;
        }
        return icoImagen;
    }
}
