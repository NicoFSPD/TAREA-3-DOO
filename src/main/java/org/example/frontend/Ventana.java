package org.example.frontend;

import javax.swing.*;       //esto se agregó automaticamente cuando hice el extends JFrame

//desde aqui se empieza a trabajar en la interfáz gráfica de la ventana visible
public class Ventana extends JFrame {

    public Ventana(){
        super();

        //cnfiguracion base para la ventana
        this.setTitle();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280, 720);    //resolucion
        this.setLocationRelativeTo(null);   //eto hace que se centre la ventana en la pantalla

        this.setVisible(true);  //esto hace que sea visible la ventana
    }


}
