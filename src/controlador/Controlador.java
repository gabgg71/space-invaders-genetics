package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import modelo.Alien;
import modelo.Cromosoma;
import modelo.Logica;

public class Controlador implements ActionListener {

    Logica l;
    int[][] matricita;
    public ArrayList<Alien> aliens;
    public ArrayList<Alien> copia;
    public ArrayList<Cromosoma> soluciones;


    public void setLogica(Logica l) {
        this.l = l;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        l.llamarTodo();
        
    }

}
