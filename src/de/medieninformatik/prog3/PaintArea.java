package de.medieninformatik.prog3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

public class PaintArea extends Canvas implements MouseListener {

    int current_x, current_y;
    int new_x, new_y;
    //static int x; //x coordinate
    //static int y; //y coordinate
    int clickCount = 0; //counter for mouseclick
    int width = 400;
    int height = 300;

    public PaintArea()  {
        setSize(width, height);
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
                new_x, new_y,// coordinates
                20.0F, 20.0F); // size
        Graphics2D gd2 = (Graphics2D)g;
        gd2.draw(ellipse2D);
        gd2.drawString((new_x + "  " + new_y), new_x, new_y);
        clickCount++;
        if (clickCount == 3){
            clickCount = 0;
        }

        current_x = new_x;
        current_y = new_y;
    }

    /**
     * Method that saves the coordinates of a Mouse click and calls the paint-Method through the repaint-Method
     * @param e MouseEvent
     */
    @Override
    public void mouseClicked(MouseEvent e) {

        new_x = e.getX();
        new_y = e.getY();
        this.repaint(); //paint method

        //System.out.println(x);
        //System.out.println(y);

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