package org.example.vista;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana() {
        super("Maquina Expendedora");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,700); //establece las dimensiones fijas de la ventana
        this.setResizable(false); //bloquea la opcion de cambiar el tamano de la ventana con el mouse
        this.add(new PanelPrincipal());
        this.setVisible(true);
    }
}

