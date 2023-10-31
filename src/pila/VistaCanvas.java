/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author alepd
 */
public class VistaCanvas extends Canvas {

    Object[] objetos;

    public VistaCanvas(int ancho, int alto) {
        setSize(new Dimension(alto, ancho));
        this.setBackground(Color.DARK_GRAY);
        repaint();
        objetos = new Object[6];
        for (int i = 0; i < objetos.length; i++) {
            objetos[i] = null;
        }
    }
    
    
    
    /**
     *
     * @param datos
     */
    public void representa(Object[] objetos)
    {
        this.objetos = objetos;
        repaint();
    }

    @Override
    public void paint(Graphics g) {

        // Se crea un buffer intermedio para que montar la salida completa
        // y luego pintarla de una vez, evitando el parpadeo
        Image offscreen = createImage(getWidth(), getHeight());
        Graphics og = offscreen.getGraphics();

        Font f1 = new Font("Calibri", Font.PLAIN, 50);
        Font f2 = new Font("Banschrift", Font.PLAIN, 25);

        og.setFont(f1);
        og.setColor(Color.white);
        og.drawRect(85, 170, 100, 100);
        og.drawString(String.valueOf(objetos[0]), 115, 240);
        og.drawRect(185, 170, 100, 100);
        og.drawString(String.valueOf(objetos[1]), 215, 240);
        og.drawRect(285, 170, 100, 100);
        og.drawString(String.valueOf(objetos[2]), 315, 240);
        og.drawRect(385, 170, 100, 100);
        og.drawString(String.valueOf(objetos[3]), 415, 240);
        og.drawRect(485, 170, 100, 100);
        og.drawString(String.valueOf(objetos[4]), 515, 240);
        og.drawRect(585, 170, 100, 100);
        og.drawString(String.valueOf(objetos[5]), 615, 240);
        og.setFont(f2);
        og.drawString("Numero de elementos en la pila: " + objetos.length, 200, 50);
        og.drawImage(offscreen, 0, 0, null);
        
        g.drawImage(offscreen, 0, 0, null);
    }

    /* El update original del canvas, borra el canvas y llama a paint. Si queremos 
     sobreescribir  lo que hay pintado, sobrecargamos update y hacemos que llame 
     paint. Así no borra lo anterior, y no se produce parpadeo
     */
    @Override
    public void update(Graphics g) {
        paint(g);
    }

}

