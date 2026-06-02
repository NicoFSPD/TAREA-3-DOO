package org.example.vista;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import org.example.modelo.Expendedor;

public class PanelExpendedor extends JPanel {
    private Expendedor exp;

    public PanelExpendedor(Expendedor exp) {
        this.exp = exp; //recibe y asigna el modelo logico del expendedor para conectar la vista
    }

    public void manejarClick(int x, int y) {
    }

    @Override
    public void paintComponent(Graphics g) { //metodo encargado de dibujar la representacion visual de la maquina expendedora
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(50, 50, 500, 600);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(350, 500, 100, 100);
    }
}
