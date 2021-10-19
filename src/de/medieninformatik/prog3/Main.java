package de.medieninformatik.prog3;

/**
 * 1. mit awt Kreise zeichnen
 * 2. Version mit Quadraten
 * 3. S: Hintergrundfarben-Menü  H: geclickte Koordinate anzeigen
 * 4. zusammenführen
 * 5. S: Distanz berechnen u ausgeben   H: Linie zwischen Koordinaten
 * 6. zusammenführen
 */

public class Main {

    public static void main(String[] args) {
        //Mainframe ist Hauptfenster, controller ist der Listener dafür
        MainFrameController mfc = new MainFrameController();
        MainFrame mainFrame = new MainFrame(mfc);
        mainFrame.setVisible(true);
    }
}
