package org.example.vista;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import org.example.modelo.Expendedor;

public class PanelComprador extends JPanel {
    private Expendedor exp;
    private PanelPrincipal parent;

    public PanelComprador(Expendedor exp, PanelPrincipal parent) {
        this.exp = exp;
        this.parent = parent;
    }

    public void manejarClick(int x, int y) {
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(600, 0, 400, 700);
    }
}
