
package ventana;

import controlador.Controlador;
import java.awt.Color;
import java.net.MalformedURLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.Logica;

public class Ventana extends JFrame {
    Logica log;
    public Controlador c;
    public Panel d;
    JButton boton = new JButton("Empieza");
    public JTextField num = new JTextField("");
    public JTextField secuencia = new JTextField("");
    public JTextField acciones = new JTextField("");
    public JTextField fitness = new JTextField("");
    public JLabel eso = new JLabel("Numero de aliens: ");
    public JLabel mejor = new JLabel("Mejor secuencia: ");
    public JLabel realizo = new JLabel("Acciones que realizo: ");
    public JLabel delFit = new JLabel("Fitness de la secuencia: ");
    public JLabel autor = new JLabel("Realizado por: Gabriela Galindo Garcia");

    
    public Ventana(Logica log, Controlador c) throws MalformedURLException{
        this.log = log;
        this.c = c;
        init();
    }
    
    public void init() throws MalformedURLException{
        setBounds(200,200,1100,650);
        d = new Panel();
        d.setBackground(new Color(0,0,0));
        d.setBounds(0, 0, 1100, 450);
        add(d);
        setTitle("Space Invaders");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        eso.setBounds(10, 520, 150,20);
        eso.setForeground(Color.red);
        add(eso);
        num.setBounds(140, 520, 40,20);
        add(num);
        secuencia.setBounds(120, 480,950,20);
        add(secuencia);
        fitness.setBounds(950, 560,120,20);
        add(fitness);
        acciones.setBounds(950, 520, 120,20);
        add(acciones);
        mejor.setBounds(10, 480, 150,20);
        mejor.setForeground(Color.red);
        add(mejor);
        realizo.setBounds(810, 520, 150,20);
        realizo.setForeground(Color.red);
        add(realizo);
        delFit.setBounds(800, 560, 150,20);
        delFit.setForeground(Color.red);
        add(delFit);
        boton.setBounds(420, 540, 150, 50);
        boton.setBackground(new Color(129,253,34));
        boton.addActionListener(c);
        add(boton);
        autor.setBounds(780, 590, 250,20);
        autor.setForeground(Color.red);
        add(autor); 
        
    }
    
}
