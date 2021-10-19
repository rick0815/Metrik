package de.medieninformatik.prog3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends Frame {

    private Label coordinates;

    private static PaintArea pa = new PaintArea();

    public MainFrame(MainFrameController mfc)  {
        setTitle("Metrik Version 1.2.1");
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
        // new Menu
        Menu menu = new Menu("Hintergrund");
        //Blau
        MenuItem blau = new MenuItem("Blau");
        menu.add(blau);
        blau.addActionListener(e -> pa.setBackground(Color.blue)); //action occours when clicking on blue
        //Rot
        MenuItem rot = new MenuItem("Rot");
        menu.add(rot);
        rot.addActionListener(e -> pa.setBackground(Color.red)); //action occours when clicking on red
        //Gelb
        MenuItem gelb = new MenuItem("Gelb");
        menu.add(gelb);
        gelb.addActionListener(e -> pa.setBackground(Color.yellow)); //action occours when clicking on red

        Menu menu2 = new Menu("Radius");

        //Dialog dialog = new Dialog();
        //menu2.add(dialog);

        //add menu
        mbar.add(mFile);
        mbar.add(menu);
        mbar.add(menu2);
        setMenuBar(mbar);
    }
}
