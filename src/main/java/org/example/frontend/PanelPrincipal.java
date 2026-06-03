package org.example.frontend;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.example.Expendedor;

/**
 * Clase contenedora que unifica la interfaz grafica de la aplicacion.
 * Actua como el panel central de la ventana, integrando el comprador y el expendedor dentro de si.
 * Se encarga de interceptar y distribuir los eventos del mouse.
 * @author Daniel Lopez
 * @version 1, 2 de junio de 2026
 */

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;
    private Expendedor modeloExpendedor;

    /**
     * Constructor de la clase PanelPrincipal.
     * Inicializa el fondo, desactiva el layout por defecto, instancia el modelo logico,
     * monta las vistas de los paneles fijando sus limites y configura el escuchador de eventos de mouse.
     */
    public PanelPrincipal() {
        this.setBackground(Color.WHITE);
        this.setLayout(null);

        modeloExpendedor = new Expendedor(5);
        exp = new PanelExpendedor(modeloExpendedor);
        com = new PanelComprador(modeloExpendedor, this);

        exp.setBounds(0, 0, 600, 700);
        com.setBounds(600, 0, 400, 700);


        this.addMouseListener(new MouseAdapter() {
            /**
             * Evalua la posicion del click del mouse para redirigir el evento al panel correcto.
             * @param e el evento del mouse que contiene las coordenadas del click.
             */
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

    /**
     * Coordina el dibujo en cascada de toda la interfaz grafica.
     * Limpia la pantalla invocando a la superclase y luego solicita consecutivamente
     * que el panel del expendedor y el del comprador pinten sus componentes.
     * @param g el objeto graphics utilizado para pintar en el componente.
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        exp.paintComponent(g);
        com.paintComponent(g);
    }
}
