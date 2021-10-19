package de.medieninformatik.prog3;

import java.awt.*;

public class MainFrame extends Frame {

    private Label coordinates;

    private static PaintArea pa = new PaintArea();

    public MainFrame(MainFrameController mfc)  {
        setTitle("Metrik Version 1.0");
        setSize(400, 300);

        initializeMenu();

        addWindowListener(mfc);

        add(pa);


        //Displays Text in bottom left window corner. Should change with each click, but doesn't.
        //Problem is, that the coordinates need to be static, but cannot be while in the MouseClickEvent
        /*
        coordinates = new Label("Location: " + PaintArea.x + " / " + PaintArea.y);
        add(BorderLayout.SOUTH, coordinates);
         */

    }

    private void initializeMenu() {

        MenuBar mbar = new MenuBar();

        //Menu Items
        Menu mFile = new Menu("Programm");
        mFile.add(new MenuItem("Neues Programm"));
        mFile.add(new MenuItem("Beenden"));

        //add menu
        mbar.add(mFile);
        setMenuBar(mbar);
    }

}
