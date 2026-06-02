package org.example.vista;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.example.modelo.Expendedor;

public class PanelPrincipal extends JPanel {
    private PanelComprador com; //referencia a la vista del comprador
    private PanelExpendedor exp; //vista del expendedor que dibuja la maquina y estantes
    private Expendedor modeloExpendedor; //referencia al objeto logico que contiene los depositos

    public PanelPrincipal() {
        this.setBackground(Color.WHITE);
        this.setLayout(null);

        modeloExpendedor = new Expendedor(5); //crea la maquina logica cargando 5 productos por estante
        exp = new PanelExpendedor(modeloExpendedor);
        com = new PanelComprador(modeloExpendedor, this);

        exp.setBounds(0, 0, 600, 700); //asigna posicion y tamano al panel del expendedor en la izquierda
        com.setBounds(600, 0, 400, 700); //asigna posicion y tamano al panel del comprador en la derecha

        this.addMouseListener(new MouseAdapter() { //anade el escuchador para capturar los eventos del mouse
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getX() < 600) {
                    exp.manejarClick(e.getX(), e.getY());
                } else {
                    com.manejarClick(e.getX() - 600, e.getY());
                }
                repaint();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) { //metodo principal encargado de pintar todos los componentes en pantalla
        super.paintComponent(g);
        exp.paintComponent(g);
        com.paintComponent(g);
    }
}
