package de.medieninformatik.prog3;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainFrameController implements WindowListener {


    @Override
    public void windowOpened(WindowEvent e) {

    }

    //Schließfunktion
    @Override
    public void windowClosing(WindowEvent event) {
        event.getWindow().dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
