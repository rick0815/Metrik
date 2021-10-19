package de.medieninformatik.prog3;
/**
 * @author Hendrik Herbert m29277
 * @author Sebastian Bürgel m29275
 * date: 2021-10-20
 * Function of Program:
 * Version 1.3 Program creates a window where circles can be drawn via mouseclick. All Features from prev.
 * Versions have been added.
 *
 *
 * 1. mit awt Kreise zeichnen
 * 2. Version mit Quadraten
 * 3. S: Hintergrundfarben-Menü  H: geclickte Koordinate anzeigen
 * 4. zusammenführen
 * 5. S: Distanz berechnen u ausgeben   H: Linie zwischen Koordinaten
 * 6. zusammenführen
 */

public class Main {

    public static void main(String[] args) {


        //Mainframe is window
        MainFrameController mfc = new MainFrameController();
        MainFrame mainFrame = new MainFrame(mfc);
        mainFrame.setVisible(true);
    }
}
