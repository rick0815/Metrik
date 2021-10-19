package de.medieninformatik.prog3;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

public class PaintArea extends Canvas implements MouseListener {
    int current_x=0, current_y=0;
    int new_x, new_y;
    int clickCount = 0; //counter for mouseclick
    float width = 20.0F;
    float height = 20.0F;


    public PaintArea()  {
        setSize(400, 300);
        addMouseListener(this);
    }

    /**
     * Method that prints a Circle on given coordinates
     * clears the circles after the third call
     * @param g Graphics
     */
    @Override
    public void paint(Graphics g) {
        Ellipse2D ellipse2D;
        ellipse2D = new Ellipse2D.Float(
                new_x-10.0F, new_y-10.0F,// Koordinaten
                20.0F, 20.0F); // Größen
        Graphics2D gd2 = (Graphics2D)g;
        if(new_x > 0) {
            gd2.draw(ellipse2D);
            gd2.drawString((new_x + "  " + new_y), new_x, new_y);
            clickCount++;
            System.out.println("newx " + new_x + " newy " + new_y + " currx " + current_x + " curry " + current_y);
            if (clickCount == 3) {
                clickCount = 0;
                PaintArea.this.repaint();
                gd2.clearRect(new_x - 10, new_y - 10, 40, 40);
                gd2.clearRect(current_x - 10, current_y - 10, 40, 40);
                current_y = 0;
                current_x = 0;
                new_y = 0;
                new_x = 0;
            } else {
                current_x = new_x;
                current_y = new_y;
            }
        }
    }

    /**
     * Method that saves the coordinates of a Mouse click and calls the paint-Method through the repaint-Method
     * @param e MouseEvent
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        new_x = e.getX();
        new_y = e.getY();
        Graphics g = this.getGraphics(); // Graphics from Canvas
        paint(g); // Paint-Method with g
        //this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}