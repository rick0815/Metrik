package de.medieninformatik.prog3;

import java.awt.*;

public class PaintArea extends Canvas {


    // Pac ist im Grunde der Mauscontroller
    public PaintArea(PaintAreaController pac)  {
        setSize(400, 300);
        addMouseListener(pac);
    }

    //Canvas klicken, > Code > Implement Methods > auswählen
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}

//kreis um die Hälfte der Koordinaten verschieben, damit in der Mitte gezeichnet
