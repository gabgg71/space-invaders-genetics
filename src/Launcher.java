//Realizado por: Gabriela Galindo Garcia

import controlador.Controlador;
import java.awt.Color;
import java.net.MalformedURLException;
import modelo.Logica;
import ventana.Ventana;

public class Launcher {
    public static void main(String[] args) throws MalformedURLException {
        Logica log = new Logica();
        Controlador c = new Controlador();
        c.setLogica(log);
        Ventana ex = new Ventana(log, c);
        ex.getContentPane().setBackground(new Color(58,62,67));
        log.setVentana(ex);
        ex.setVisible(true);
        ex.setAlwaysOnTop(true);
    }
}
