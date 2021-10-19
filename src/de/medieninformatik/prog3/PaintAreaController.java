package de.medieninformatik.prog3;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PaintAreaController implements MouseListener {


    @Override
    public void mouseClicked(MouseEvent me) {
        //Coordinaten des MouseClicks
        int x = me.getX();
        int y = me.getY();
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
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
