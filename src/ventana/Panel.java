package ventana;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import modelo.Alien;

public class Panel extends JPanel{

    public int[][] matriz = new int[0][0];
    Image imagenAlien;
    Image imagenAlien2;
    Image imagenAlien3;
    Image imagenAgente;
    Image imagenDisparo;
    Image imagenDisparoA;
    Image imagenPerder;
    File perder = new File("src/graficos/perder.JPG");
    File alien = new File("src/graficos/alien.jpg");
    File alien2 = new File("src/graficos/alien2.JPG");
    File alien3 = new File("src/graficos/alien3.JPG");
    File disparoAlien = new File("src/graficos/disparoAlien.JPG");
    File agente = new File("src/graficos/agente.jpg");
    File disparoAgente = new File("src/graficos/disparoAgente.JPG");

    public ArrayList<Alien> aliens = new ArrayList();
    public int xd = 20, yd =10, opcion;
    public int xbala = 0, ybala = 0;
    public boolean hayDisparo, deM = false, perdi = false;

    private void doDrawing(Graphics g) throws MalformedURLException {
        Graphics2D g2d = (Graphics2D) g;

        //Dibujar la matriz
        int b = 10;
        for (int i = 0; i < matriz.length; i++) {
            int a = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                g2d.drawRect(a, b, (550 / matriz.length), (450 / matriz.length));  //Dibujamos el rectangulo
                a += (550 / matriz.length);
            }
            b += (450 / matriz.length);
        }

        try {
            imagenAlien = ImageIO.read(alien);
            imagenAlien2 = ImageIO.read(alien2);
            imagenAlien3 = ImageIO.read(alien3);
            imagenAgente = ImageIO.read(agente);
            imagenDisparo = ImageIO.read(disparoAlien);
            imagenDisparoA = ImageIO.read(disparoAgente);
            imagenPerder = ImageIO.read(perder);

        } catch (IOException e) {
            System.out.println("No se encontro la imagen");
        }
        
        if(perdi == true){
            g2d.drawImage(imagenPerder, 0, 15, null);
        }else{
             if (matriz.length != 0) {
            g2d.drawImage(imagenAgente, xd * ((550 / matriz.length)), matriz.length * (450 / matriz.length) - 13, null);
        }
        }

        for (int j = 0; j < aliens.size(); j++) {
            if (matriz.length != 0) {
                if(aliens.get(j).getTipo() == 0){
                    g2d.drawImage(imagenAlien, aliens.get(j).getJ() * (550 / matriz.length) + 3, aliens.get(j).getI() * (450 / matriz.length) + 12, null);
                }else if(aliens.get(j).getTipo() == 1){
                    g2d.drawImage(imagenAlien2, aliens.get(j).getJ() * (550 / matriz.length) + 3, aliens.get(j).getI() * (450 / matriz.length) + 12, null);
                }else{
                    g2d.drawImage(imagenAlien3, aliens.get(j).getJ() * (550 / matriz.length) + 3, aliens.get(j).getI() * (450 / matriz.length) + 12, null);
                }
                
            }
        }
        //a cambia el j, b cambia el i

       

        if (hayDisparo == true) {
            if (opcion == 1) { //Disparo de Alien
                g2d.drawImage(imagenDisparo, xbala * ((550 / matriz.length)), (ybala * (450 / matriz.length)) - 13, null);
            } else {
                g2d.drawImage(imagenDisparoA, xbala * ((550 / matriz.length)), (ybala * (450 / matriz.length)) - 13, null);
            }
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            doDrawing(g);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
