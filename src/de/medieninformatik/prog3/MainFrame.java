package de.medieninformatik.prog3;

import java.awt.*;

public class MainFrame extends Frame {
    private static PaintArea pa = new PaintArea();

    public MainFrame(MainFrameController mfc)  {
        setTitle("Metrik Version 1.0");
        setSize(400, 300);

        initializeMenu();

        addWindowListener(mfc);
        add(pa);
    }

    private void initializeMenu() {

        MenuBar mbar = new MenuBar();

        //Menu Items
        Menu mFile = new Menu("Programm");
        mFile.add(new MenuItem("Neues Programm"));
        mFile.add(new MenuItem("Beenden"));

        //diese Zufügen
        mbar.add(mFile);
        setMenuBar(mbar);
    }

}
