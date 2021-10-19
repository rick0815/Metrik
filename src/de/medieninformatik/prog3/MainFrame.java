package de.medieninformatik.prog3;

import java.awt.*;

public class MainFrame extends Frame {
    private static PaintAreaController pac = new PaintAreaController();
    private static PaintArea pa = new PaintArea(pac);

    public MainFrame(MainFrameController mfc)  {
        setTitle("Metrik");
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
