
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.JOptionPane.*;

public class Interfaz extends Posicion {

    public JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4;
    public JTextField Text1, Text2, Text3;

    public JTextField campoText1o;
    public JTextArea area, area2;
    public JTextArea campoTexto;
    public JLabel msj;
    public String elemento;
    public int apuntador;
    public JComboBox tipou;
    public int c = 4;

    public Interfaz() {
        setTitle("TABLA PERIODICA DE LOS ELEMENTOS QUIMICOS\n"
                + "              INSTITUTO TECNOLOGICO DE OAXACA.");

        setLayout(null);

        campoTexto = new JTextArea(150, 100);
        campoTexto.setFont(new java.awt.Font("Arial", 1, 45));
        campoTexto.setBounds(200, 100, 320, 60);

        area = new JTextArea(40, 40);
        area.setFont(new java.awt.Font("Arial", 1, 20));
        area.append(" \nSimbolo");
        area.setBounds(450, 160, 80, 80);
        area.setBackground(Color.blue);
        area.setEditable(false);

        /* area2  = new JTextArea   (40,40);
     area2.setFont(new java.awt.Font("Arial",1,20));
       area2.setBounds(450,150,70, 70);
        area2.setBackground(color3);
            area2.append (" \nNombre");
       area.add(area2);*/
        getContentPane().add(area);

        getContentPane().setBackground(Color.black);

        msj = new JLabel(" TABLA PERIODICA DE LOS ELEMENTOS QUIMICOS");
        msj.setFont(new java.awt.Font("Arial", 3, 16));
        msj.setForeground(Color.white);

        msj.setBounds(100, 00, 500, 100);
        add(msj);
        NombresElementos nomb = new NombresElementos();
        // busqueda = new JButton ("Buscar");
        //busqueda.setBounds(600, 50, 100, 20);
        //tipou= new JComboBox(nomb.nombres);
        //tipou.setBounds(640, 80, 100, 20);

        //  getContentPane().add(tipou);
        //getContentPane().add(busqueda);
        etiqueta1 = new JLabel();
        etiqueta2 = new JLabel();
        etiqueta3 = new JLabel();
        etiqueta4 = new JLabel();

        etiqueta1.setText("Nombre:");
        getContentPane().add(etiqueta1);
        etiqueta1.setBounds(150, 100, 200, 20);
        etiqueta1.setFont(new java.awt.Font("Arial", 1, 14));

        etiqueta2.setText("Peso atomico: ");
        getContentPane().add(etiqueta2);
        etiqueta2.setBounds(150, 140, 150, 20);
        etiqueta2.setFont(new java.awt.Font("Arial", 1, 14));
        etiqueta3.setText("Numero atomico: ");
        getContentPane().add(etiqueta3);
        etiqueta3.setBounds(400, 100, 150, 20);
        etiqueta3.setFont(new java.awt.Font("Arial", 1, 14));

        etiqueta4.setText("Simbolo:");
        getContentPane().add(etiqueta4);
        etiqueta4.setBounds(370, 180, 200, 20);
        etiqueta4.setFont(new java.awt.Font("Arial", 1, 15));

        etiqueta1.setForeground(Color.yellow);
        etiqueta2.setForeground(Color.yellow);
        etiqueta3.setForeground(Color.yellow);
        etiqueta4.setForeground(Color.blue);

        Text1 = new JTextField(7);
        Text1.setFont(new java.awt.Font("Arial", 1, 15));
        Text1.setBounds(150, 120, 200, 20);
        getContentPane().add(Text1);
        Text2 = new JTextField(7);
        Text2.setBounds(400, 120, 200, 20);
        getContentPane().add(Text2);
        Text2.setFont(new java.awt.Font("Arial", 1, 15));
        Text3 = new JTextField(10);
        Text3.setBounds(150, 160, 200, 20);
        getContentPane().add(Text3);
        Text3.setFont(new java.awt.Font("Arial", 1, 15));

    }

}
