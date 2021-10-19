package de.medieninformatik.prog3;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class PaintArea extends Canvas {


    // Pac ist im Grunde der Mauscontroller
    public PaintArea(PaintAreaController pac)  {
        setSize(400, 300);
        addMouseListener(pac);
    }

    //Canvas klicken, > Code > Implement Methods > auswählen
    @Override
    public void paint(Graphics g) {
        Ellipse2D ellipse2D;
        ellipse2D = new Ellipse2D.Float(
                10.0F, 10.0F,// Koordinaten
                5.0F, 5.0F); // Größen
        Graphics2D gd2 = (Graphics2D)g;
        gd2.draw(ellipse2D);
    }
}

//kreis um die Hälfte der Koordinaten verschieben, damit in der Mitte gezeichnet
