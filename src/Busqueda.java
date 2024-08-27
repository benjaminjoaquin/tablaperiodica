
import javax.swing.*;
import java.awt.event.*;

import java.awt.*;
import java.util.*;
import javax.swing.JOptionPane.*;

public class Busqueda extends Posicion implements ActionListener {

    private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4;
    public JTextField Text1, Text2, Text3;

    public JTextField campoText1o;
    public JTextArea area, area2;
    public JTextArea campoTexto;
    public JLabel msj;
    public String elemento;
    public int apuntador;
    public JComboBox tipou;
    public int c = 4;
    public JButton busqueda, salir;

    public Busqueda() {
        setTitle("TABLA PERIODICA DE LOS ELEMENTOS QUIMICOS");
        setSize(550, 290);

        setLayout(null);

        campoTexto = new JTextArea(150, 100);
        campoTexto.setFont(new java.awt.Font("Arial", 1, 45));
        campoTexto.setBounds(200, 100, 320, 60);

        area = new JTextArea(40, 40);
        area.setFont(new java.awt.Font("Arial", 1, 20));
        area.append(" \nSimbolo");
        area.setBounds(350, 160, 80, 80);
        area.setBackground(Color.black);
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
        msj.setFont(new java.awt.Font("Arial", 4, 16));
        msj.setForeground(Color.yellow);

        msj.setBounds(80, 00, 500, 100);
        add(msj);
        NombresElementos nomb = new NombresElementos();
        busqueda = new JButton("Buscar");
        salir = new JButton("Salir");
        busqueda.setBounds(160, 70, 100, 20);
        salir.setBounds(50, 200, 100, 20);
        tipou = new JComboBox(nomb.nombres);
        tipou.setBounds(50, 70, 100, 20);

        getContentPane().add(tipou);
        getContentPane().add(busqueda);
        getContentPane().add(salir);
        etiqueta1 = new JLabel();
        etiqueta2 = new JLabel();
        etiqueta3 = new JLabel();
        etiqueta4 = new JLabel();

        etiqueta1.setText("Nombre:");
        getContentPane().add(etiqueta1);
        etiqueta1.setBounds(50, 100, 200, 20);
        etiqueta1.setFont(new java.awt.Font("Arial", 1, 14));

        etiqueta2.setText("Peso atomico: ");
        getContentPane().add(etiqueta2);
        etiqueta2.setBounds(50, 140, 150, 20);
        etiqueta2.setFont(new java.awt.Font("Arial", 1, 14));
        etiqueta3.setText("Numero atomico: ");
        getContentPane().add(etiqueta3);
        etiqueta3.setBounds(300, 100, 150, 20);
        etiqueta3.setFont(new java.awt.Font("Arial", 1, 14));

        etiqueta4.setText("Simbolo:");
        getContentPane().add(etiqueta4);
        etiqueta4.setBounds(270, 180, 200, 20);
        etiqueta4.setFont(new java.awt.Font("Arial", 1, 15));

        etiqueta1.setForeground(Color.yellow);
        etiqueta2.setForeground(Color.yellow);
        etiqueta3.setForeground(Color.yellow);
        etiqueta4.setForeground(Color.blue);

        Text1 = new JTextField(7);
        Text1.setFont(new java.awt.Font("Arial", 1, 15));
        Text1.setBounds(50, 120, 200, 20);
        getContentPane().add(Text1);
        Text2 = new JTextField(7);
        Text2.setBounds(300, 120, 200, 20);
        getContentPane().add(Text2);
        Text2.setFont(new java.awt.Font("Arial", 1, 15));
        Text3 = new JTextField(10);
        Text3.setBounds(50, 160, 200, 20);
        getContentPane().add(Text3);
        Text3.setFont(new java.awt.Font("Arial", 1, 15));

        busqueda.addActionListener(this);
        salir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evento) {
        NombresElementos nomb = new NombresElementos();

        Container f = this.getContentPane();

        if (evento.getSource() == salir) {
            dispose();
        }

        if (evento.getSource() == busqueda) {

            apuntador = tipou.getSelectedIndex();
            elemento = nomb.nombres[apuntador];

            if (elemento.equals(nomb.nombres[0])) {
                Text1.setText("");
                Text1.setText("Hidrogeno");
                Text2.setText("");
                Text2.setText("1");
                Text3.setText("");
                Text3.setText("1.0079");
                area.setText("\n     H");
                area.setBackground(Color.blue);
            }
            if (elemento.equals(nomb.nombres[1])) {
                Text1.setText("");
                Text1.setText("Litio");
                Text2.setText("");
                Text2.setText("3");
                Text3.setText("");
                Text3.setText("6.941");
                area.setText("\n     Li");
                area.setBackground(Color.blue);

            }
            if (elemento.equals(nomb.nombres[2])) {
                Text1.setText("");
                Text1.setText("Sodio");
                Text2.setText("");
                Text2.setText("11");
                Text3.setText("");
                Text3.setText("22.9898");
                area.setText("\n     Na");
                area.setBackground(Color.blue);

            }
            if (elemento.equals(nomb.nombres[3])) {
                Text1.setText("");
                Text1.setText("Potasio");
                Text2.setText("");
                Text2.setText("19");
                Text3.setText("");
                Text3.setText("39.0983");
                area.setText("\n      k");
                area.setBackground(Color.blue);

            }
            if (elemento.equals(nomb.nombres[4])) {
                Text1.setText("");
                Text1.setText("Rubidio");
                Text2.setText("");
                Text2.setText("37");
                Text3.setText("");
                Text3.setText("85.4678");
                area.setText("\n     Rb");
                area.setBackground(Color.blue);

            }
            if (elemento.equals(nomb.nombres[5])) {
                Text1.setText("");
                Text1.setText("Cesio ");
                Text2.setText("");
                Text2.setText("3");
                Text3.setText("");
                Text3.setText("132.9054");
                area.setText("\n     Cs");
                area.setBackground(Color.blue);

            }
            if (elemento.equals(nomb.nombres[6])) {
                Text1.setText("");
                Text1.setText("Francio");
                Text2.setText("");
                Text2.setText("87");
                Text3.setText("");
                Text3.setText("223.02 ");
                area.setText("\n     Fr");
                area.setBackground(Color.blue);

            }

            if (elemento.equals(nomb.nombres[7])) {
                Text1.setText("");
                Text1.setText("Berilio");
                Text2.setText("");
                Text2.setText("4");
                Text3.setText("");
                Text3.setText("9.0122");
                area.setText("\n     Be");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[8])) {
                Text1.setText("");
                Text1.setText("Magnesio");
                Text2.setText("");
                Text2.setText("12");
                Text3.setText("");
                Text3.setText("24.3050");
                area.setText("\n     Mg");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[9])) {
                Text1.setText("");
                Text1.setText("Calcio");
                Text2.setText("");
                Text2.setText("20");
                Text3.setText("");
                Text3.setText("40.078 ");
                area.setText("\n     Ca");
                area.setBackground(Color.pink);
            }
            if (elemento.equals(nomb.nombres[10])) {
                Text1.setText("");
                Text1.setText("Estroncio");
                Text2.setText("");
                Text2.setText("38");
                Text3.setText("");
                Text3.setText("87.62");
                area.setText("\n     Sr");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[11])) {
                Text1.setText("");
                Text1.setText("Bario");
                Text2.setText("");
                Text2.setText("56");
                Text3.setText(" 137.327");
                Text3.setText("6.941");
                area.setText("\n     Ba");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[12])) {
                Text1.setText("");
                Text1.setText("Radio");
                Text2.setText("");
                Text2.setText("88");
                Text3.setText("");
                Text3.setText("226.0254");
                area.setText("\n     Ra");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[13])) {
                Text1.setText("");
                Text1.setText("Escandio");
                Text2.setText("");
                Text2.setText("21");
                Text3.setText("");
                Text3.setText("44.9559");
                area.setText("\n     Sc");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[14])) {
                Text1.setText("");
                Text1.setText("Itrio");
                Text2.setText("");
                Text2.setText("39");
                Text3.setText("");
                Text3.setText("88.9059 ");
                area.setText("\n     Y");
                area.setBackground(Color.ORANGE);

            }

            if (elemento.equals(nomb.nombres[15])) {
                Text1.setText("");
                Text1.setText("Titanio ");
                Text2.setText("");
                Text2.setText("22");
                Text3.setText("");
                Text3.setText("47.867");
                area.setText("\n     Ti");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[16])) {
                Text1.setText("");
                Text1.setText("Circonio");
                Text2.setText("");
                Text2.setText("40");
                Text3.setText("");
                Text3.setText("91.224 ");
                area.setText("\n     Zr");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[17])) {
                Text1.setText("");
                Text1.setText("Hafnio");
                Text2.setText("");
                Text2.setText("72");
                Text3.setText("");
                Text3.setText("178.49 ");
                area.setText("\n     Hf");
                area.setBackground(Color.ORANGE);
            }

            if (elemento.equals(nomb.nombres[18])) {
                Text1.setText("");
                Text1.setText("Rutherfordio");
                Text2.setText("");
                Text2.setText("104");
                Text3.setText("");
                Text3.setText("621.11");
                area.setText("\n     Rf");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[19])) {
                Text1.setText("");
                Text1.setText("Vanadio ");
                Text2.setText("");
                Text2.setText("23");
                Text3.setText("");
                Text3.setText("50.9415");
                area.setText("\n     V");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[20])) {
                Text1.setText("");
                Text1.setText("Niobio");
                Text2.setText("");
                Text2.setText("41");
                Text3.setText("");
                Text3.setText("92.9064 ");
                area.setText("\n     Nb");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[21])) {
                Text1.setText("");
                Text1.setText("Tantalio");
                Text2.setText("");
                Text2.setText("73");
                Text3.setText("");
                Text3.setText("180.9474");
                area.setText("\n     Ta");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[22])) {
                Text1.setText("");
                Text1.setText("Dubnio");
                Text2.setText("");
                Text2.setText("105");
                Text3.setText("");
                Text3.setText("262.11");
                area.setText("\n     Db");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[23])) {
                Text1.setText("");
                Text1.setText("Cromo");
                Text2.setText("");
                Text2.setText("24");
                Text3.setText("");
                Text3.setText("51.9961");
                area.setText("\n     Li");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[24])) {
                Text1.setText("");
                Text1.setText("Molibdeno");
                Text2.setText("");
                Text2.setText("42");
                Text3.setText("");
                Text3.setText("95.94 ");
                area.setText("\n     Mo");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[25])) {
                Text1.setText("");
                Text1.setText("Tugsteno");
                Text2.setText("");
                Text2.setText("74");
                Text3.setText("");
                Text3.setText("183.84 ");
                area.setText("\n     W");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[26])) {
                Text1.setText("");
                Text1.setText("Seaborgio ");
                Text2.setText("");
                Text2.setText("106");
                Text3.setText("");
                Text3.setText(" 263.12");
                area.setText("\n     Sg");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[27])) {
                Text1.setText("");
                Text1.setText("Manganeso ");
                Text2.setText("");
                Text2.setText("25");
                Text3.setText("");
                Text3.setText(" 54.9380");
                area.setText("\n     Mn");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[28])) {
                Text1.setText("");
                Text1.setText("Tecnesio");
                Text2.setText("");
                Text2.setText("43");
                Text3.setText("");
                Text3.setText(" 97.907");
                area.setText("\n     Tc");
                area.setBackground(Color.ORANGE);
            }
            if (elemento.equals(nomb.nombres[29])) {
                Text1.setText("");
                Text1.setText(" Renio ");
                Text2.setText("");
                Text2.setText("75");
                Text3.setText("");
                Text3.setText("186.207 ");
                area.setText("\n     Re");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[30])) {
                Text1.setText("");
                Text1.setText("Bohrio");
                Text2.setText("");
                Text2.setText("107");
                Text3.setText("");
                Text3.setText("262.12");
                area.setText("\n     Bh");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[31])) {
                Text1.setText("");
                Text1.setText("Hierro ");
                Text2.setText("");
                Text2.setText("26");
                Text3.setText("");
                Text3.setText("55.845");
                area.setText("\n     Fe");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[32])) {
                Text1.setText("");
                Text1.setText("Rutenio");
                Text2.setText("");
                Text2.setText("44");
                Text3.setText("");
                Text3.setText("101.07");
                area.setText("\n     Ru");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[33])) {
                Text1.setText("");
                Text1.setText("Osmio");
                Text2.setText("");
                Text2.setText("76");
                Text3.setText("");
                Text3.setText("190.2");
                area.setText("\n     Os");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[34])) {
                Text1.setText("");
                Text1.setText("Hassnio");
                Text2.setText("");
                Text2.setText("108");
                Text3.setText("");
                Text3.setText("265");
                area.setText("\n     Hs");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[35])) {
                Text1.setText("");
                Text1.setText("Cobalto");
                Text2.setText("");
                Text2.setText("27");
                Text3.setText("");
                Text3.setText("58.9332");
                area.setText("\n     Co");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[36])) {
                Text1.setText("");
                Text1.setText(" Rodio");
                Text2.setText("");
                Text2.setText("45");
                Text3.setText("");
                Text3.setText("102.9055");
                area.setText("\n     Li");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[37])) {
                Text1.setText("");
                Text1.setText("Iridio");
                Text2.setText("");
                Text2.setText("77");
                Text3.setText("");
                Text3.setText("192.22 ");
                area.setText("\n     Ir");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[38])) {
                Text1.setText("");
                Text1.setText(" Meitnerio");
                Text2.setText("");
                Text2.setText("109");
                Text3.setText("");
                Text3.setText("266");
                area.setText("\n     Mt");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[39])) {
                Text1.setText("");
                Text1.setText("Niquel");
                Text2.setText("");
                Text2.setText("28");
                Text3.setText("");
                Text3.setText("58.6394");
                area.setText("\n     Ni");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[40])) {
                Text1.setText("");
                Text1.setText("Paladio");
                Text2.setText("");
                Text2.setText("46");
                Text3.setText("");
                Text3.setText("106.42");
                area.setText("\n     Pd");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[41])) {
                Text1.setText("");
                Text1.setText(" Platino");
                Text2.setText("");
                Text2.setText("78");
                Text3.setText("");
                Text3.setText("195.09");
                area.setText("\n     Pt");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[42])) {
                Text1.setText("");
                Text1.setText("Ununnilio");
                Text2.setText("");
                Text2.setText("110");
                Text3.setText("");
                Text3.setText("269");
                area.setText("\n     Uun");

                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[43])) {
                Text1.setText("");
                Text1.setText("Cobre ");
                Text2.setText("");
                Text2.setText("29");
                Text3.setText("");
                Text3.setText("63.546 ");
                area.setText("\n     Cu");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[43 + 1])) {
                Text1.setText("");
                Text1.setText(" Plata");
                Text2.setText("");
                Text2.setText("47");
                Text3.setText("");
                Text3.setText("107.8682");
                area.setText("\n     Ag");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[44 + 1])) {
                Text1.setText("");
                Text1.setText("Oro");
                Text2.setText("");
                Text2.setText("79");
                Text3.setText("");
                Text3.setText("196.9665 ");
                area.setText("\n     Au");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[45 + 1])) {
                Text1.setText("");
                Text1.setText("Plutirio");
                Text2.setText("");
                Text2.setText("111");
                Text3.setText("");
                Text3.setText("269");
                area.setText("\n     Pl");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[46 + 1])) {
                Text1.setText("");
                Text1.setText("Zinc");
                Text2.setText("");
                Text2.setText("30");
                Text3.setText("");
                Text3.setText("65.39");
                area.setText("\n     Zn");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[47 + 1])) {
                Text1.setText("");
                Text1.setText("Cadmio");
                Text2.setText("");
                Text2.setText("48");
                Text3.setText("");
                Text3.setText(" 112.411");
                area.setText("\n     Cd");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[48 + 1])) {
                Text1.setText("");
                Text1.setText("Mercurio");
                Text2.setText("");
                Text2.setText("80");
                Text3.setText("");
                Text3.setText("200.59 ");
                area.setText("\n     Hg");
                area.setBackground(Color.ORANGE);
            }

            if (elemento.equals(nomb.nombres[49 + 1])) {
                Text1.setText("");
                Text1.setText("Darwanzio");
                Text2.setText("");
                Text2.setText("112");
                Text3.setText("");
                Text3.setText("264");
                area.setText("\n     Da");
                area.setBackground(Color.ORANGE);

            }
            if (elemento.equals(nomb.nombres[50 + 1])) {
                Text1.setText("");
                Text1.setText("Boro");
                Text2.setText("");
                Text2.setText("5");
                Text3.setText("");
                Text3.setText("10.811");
                area.setText("\n     B");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[51 + 1])) {
                Text1.setText("");
                Text1.setText(" Aluminio ");
                Text2.setText("");
                Text2.setText("13");
                Text3.setText("");
                Text3.setText(" 26.9815");
                area.setText("\n     Al");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[52 + 1])) {
                Text1.setText("");
                Text1.setText("Galio");
                Text2.setText("");
                Text2.setText("31");
                Text3.setText("");
                Text3.setText("69.723");
                area.setText("\n     Ga");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[53 + 1])) {
                Text1.setText("");
                Text1.setText("Indio");
                Text2.setText("");
                Text2.setText("49");
                Text3.setText("");
                Text3.setText(" 114.818");
                area.setText("\n     In");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[54 + 1])) {
                Text1.setText("");
                Text1.setText("Talio");
                Text2.setText("");
                Text2.setText("81");
                Text3.setText("");
                Text3.setText(" 204.3833");
                area.setText("\n     Li");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[55 + 1])) {
                Text1.setText("");
                Text1.setText("Ununutrio");
                Text2.setText("");
                Text2.setText("113");
                Text3.setText("");
                Text3.setText("Sin dato");
                area.setText("\n     Uut");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[56 + 1])) {
                Text1.setText("");
                Text1.setText("Carbono");
                Text2.setText("");
                Text2.setText("6");
                Text3.setText("");
                Text3.setText("12.011");
                area.setText("\n     C");
                area.setBackground(Color.green);

            }
            if (elemento.equals(nomb.nombres[57 + 1])) {
                Text1.setText("");
                Text1.setText("Silicio ");
                Text2.setText("");
                Text2.setText("14");
                Text3.setText("");
                Text3.setText("28.0855");
                area.setText("\n     Si");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[58 + 1])) {
                Text1.setText("");
                Text1.setText("Germanio");
                Text2.setText("");
                Text2.setText("32");
                Text3.setText("");
                Text3.setText("72.61");
                area.setText("\n     Ge");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[59 + 1])) {
                Text1.setText("");
                Text1.setText("Estanio");
                Text2.setText("");
                Text2.setText("50");
                Text3.setText("");
                Text3.setText(" 118.710");
                area.setText("\n     Sn");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[60 + 1])) {
                Text1.setText("");
                Text1.setText("Plomo ");
                Text2.setText("");
                Text2.setText("82");
                Text3.setText("");
                Text3.setText("207.2 ");
                area.setText("\n     Pb");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[61 + 1])) {
                Text1.setText("");
                Text1.setText("Ununcuadio");
                Text2.setText("");
                Text2.setText("114");
                Text3.setText("");
                Text3.setText("Sin dato");
                area.setText("\n     Uuq");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[62 + 1])) {
                Text1.setText("");
                Text1.setText("Nitrogeno");
                Text2.setText("");
                Text2.setText("7");
                Text3.setText("");
                Text3.setText("14.0067 ");
                area.setText("\n     N");
                area.setBackground(Color.green);

            }
            if (elemento.equals(nomb.nombres[63 + 1])) {
                Text1.setText("");
                Text1.setText("Fosforo");
                Text2.setText("");
                Text2.setText("15");
                Text3.setText("");
                Text3.setText("30.9738");
                area.setText("\n     P");
                area.setBackground(Color.green);

            }
            if (elemento.equals(nomb.nombres[64 + 1])) {
                Text1.setText("");
                Text1.setText("Arsenico");
                Text2.setText("");
                Text2.setText("33");
                Text3.setText("");
                Text3.setText("74.9216 ");
                area.setText("\n     As");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[65 + 1])) {
                Text1.setText("");
                Text1.setText("Antimonio ");
                Text2.setText("");
                Text2.setText("51");
                Text3.setText("");
                Text3.setText("121.760");
                area.setText("\n     Sb");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[66 + 1])) {
                Text1.setText("");
                Text1.setText("Bismuto");
                Text2.setText("");
                Text2.setText("83");
                Text3.setText("");
                Text3.setText("208.9804 ");
                area.setText("\n     Bi");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[67 + 1])) {
                Text1.setText("");
                Text1.setText("Ununpentio");
                Text2.setText("");
                Text2.setText("115");
                Text3.setText("");
                Text3.setText("Sin dato");
                area.setText("\n     Uup");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[68 + 1])) {
                Text1.setText("");
                Text1.setText("Oxigeno ");
                Text2.setText("");
                Text2.setText("8");
                Text3.setText("");
                Text3.setText(" 15.9994 ");
                area.setText("\n     O");
                area.setBackground(Color.green);

            }
            if (elemento.equals(nomb.nombres[69 + 1])) {
                Text1.setText("");
                Text1.setText("Azufre");
                Text2.setText("");
                Text2.setText("16");
                Text3.setText("");
                Text3.setText("32.066");
                area.setText("\n     S");
                area.setBackground(Color.green);

            }
            if (elemento.equals(nomb.nombres[71])) {
                Text1.setText("");
                Text1.setText("Selenio");
                Text2.setText("");
                Text2.setText("34");
                Text3.setText("");
                Text3.setText("78.96");
                area.setText("\n     Se");
                area.setBackground(Color.green);

            }
            if (elemento.equals(nomb.nombres[72])) {
                Text1.setText("");
                Text1.setText("Telurio");
                Text2.setText("");
                Text2.setText("52");
                Text3.setText("");
                Text3.setText("127.60 ");
                area.setText("\n     Te");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[73])) {
                Text1.setText("");
                Text1.setText("Polonio");
                Text2.setText("");
                Text2.setText("84");
                Text3.setText("");
                Text3.setText("208.98");
                area.setText("\n     Po");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[74])) {
                Text1.setText("");
                Text1.setText("Ununhexio");
                Text2.setText("");
                Text2.setText("115");
                Text3.setText("");
                Text3.setText("Sin dato");
                area.setText("\n     Uuh");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[75])) {
                Text1.setText("");
                Text1.setText("Fluor ");
                Text2.setText("");
                Text2.setText("9");
                Text3.setText("");
                Text3.setText("18.9984 ");
                area.setText("\n     F");
                area.setBackground(Color.red);
            }

            if (elemento.equals(nomb.nombres[76])) {
                Text1.setText("");
                Text1.setText("Cloro ");
                Text2.setText("");
                Text2.setText("17");
                Text3.setText("");
                Text3.setText("35.427");
                area.setText("\n     Cl");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[77])) {
                Text1.setText("");
                Text1.setText("Bromo ");
                Text2.setText("");
                Text2.setText("35");
                Text3.setText("");
                Text3.setText("79.904 ");
                area.setText("\n     Br");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[78])) {
                Text1.setText("");
                Text1.setText(" Yodo");
                Text2.setText("");
                Text2.setText("53");
                Text3.setText("");
                Text3.setText("126.9045");
                area.setText("\n     I");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[79])) {
                Text1.setText("");
                Text1.setText("Astato");
                Text2.setText("");
                Text2.setText("85");
                Text3.setText("");
                Text3.setText("209.99 ");
                area.setText("\n     At");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[80])) {
                Text1.setText("");
                Text1.setText("Ununseptio");
                Text2.setText("");
                Text2.setText("117");
                Text3.setText("");
                Text3.setText("Sin dato");
                area.setText("\n     Uus");
                area.setBackground(Color.red);

            }

            if (elemento.equals(nomb.nombres[81])) {
                Text1.setText("");
                Text1.setText("Helio");
                Text2.setText("");
                Text2.setText("2");
                Text3.setText("");
                Text3.setText(" 4.0026 ");
                area.setText("\n     He");
                area.setBackground(Color.YELLOW);

            }
            if (elemento.equals(nomb.nombres[82])) {
                Text1.setText("");
                Text1.setText("Neon");
                Text2.setText("");
                Text2.setText("10");
                Text3.setText("");
                Text3.setText("20.1797");
                area.setText("\n     Ne");
                area.setBackground(Color.yellow);

            }
            if (elemento.equals(nomb.nombres[83])) {
                Text1.setText("");
                Text1.setText("Argon ");
                Text2.setText("");
                Text2.setText("18");
                Text3.setText("");
                Text3.setText("39.948");
                area.setText("\n     Ar");
                area.setBackground(Color.yellow);

            }
            if (elemento.equals(nomb.nombres[84])) {
                Text1.setText("");
                Text1.setText(" Cripton");
                Text2.setText("");
                Text2.setText("36");
                Text3.setText("");
                Text3.setText("83.80 ");
                area.setText("\n     Kr");
                area.setBackground(Color.yellow);

            }
            if (elemento.equals(nomb.nombres[85])) {
                Text1.setText("");
                Text1.setText("Xenon");
                Text2.setText("");
                Text2.setText("54");
                Text3.setText("");
                Text3.setText("131.29 ");
                area.setText("\n     Xe");
                area.setBackground(Color.yellow);

            }
            if (elemento.equals(nomb.nombres[86])) {
                Text1.setText("");
                Text1.setText("Radon ");
                Text2.setText("");
                Text2.setText("86");
                Text3.setText("");
                Text3.setText("222.02");
                area.setText("\n     Rn");
                area.setBackground(Color.yellow);

            }
            if (elemento.equals(nomb.nombres[87])) {
                Text1.setText("");
                Text1.setText("Ununoctio");
                Text2.setText("");
                Text2.setText("118");
                Text3.setText("");
                Text3.setText("Sin dato");
                area.setText("\n     Uuo");
                area.setBackground(Color.yellow);

            }
            //Lantanidos
            if (elemento.equals(nomb.nombres[88])) {
                Text1.setText("");
                Text1.setText("Lantano");
                Text2.setText("");
                Text2.setText("57");
                Text3.setText("");
                Text3.setText("138.9055");
                area.setText("\n     La");
                area.setBackground(Color.lightGray);
            }
            if (elemento.equals(nomb.nombres[89])) {
                Text1.setText("");
                Text1.setText(" Cerio");
                Text2.setText("");
                Text2.setText("58");
                Text3.setText("");
                Text3.setText("140.115");
                area.setText("\n     Ce");
                area.setBackground(Color.lightGray);

            }
            if (elemento.equals(nomb.nombres[90])) {
                Text1.setText("");
                Text1.setText("Praseodimo");
                Text2.setText("");
                Text2.setText("59");
                Text3.setText("");
                Text3.setText("140.9076");
                area.setText("\n     Pr");
                area.setBackground(Color.lightGray);

            }
            if (elemento.equals(nomb.nombres[91])) {
                Text1.setText("");
                Text1.setText("Neodimio");
                Text2.setText("");
                Text2.setText("60");
                Text3.setText("");
                Text3.setText("144.24 ");
                area.setText("\n     Nd");
                area.setBackground(Color.lightGray);

            }
            if (elemento.equals(nomb.nombres[92])) {
                Text1.setText("");
                Text1.setText("Prometio ");
                Text2.setText("");
                Text2.setText("61");
                Text3.setText("");
                Text3.setText(" 24.3050");
                area.setText("\n     Pm");
                area.setBackground(Color.lightGray);

            }
            if (elemento.equals(nomb.nombres[93])) {
                Text1.setText("");
                Text1.setText("Samario ");
                Text2.setText("");
                Text2.setText("62");
                Text3.setText("");
                Text3.setText("150.36");
                area.setText("\n     Sm");
                area.setBackground(Color.lightGray);

            }
            if (elemento.equals(nomb.nombres[94])) {
                Text1.setText("");
                Text1.setText("Europio ");
                Text2.setText("");
                Text2.setText("63");
                Text3.setText("");
                Text3.setText("151.965");
                area.setText("\n     Eu");
                area.setBackground(Color.lightGray);
            }

            if (elemento.equals(nomb.nombres[95])) {
                Text1.setText("");
                Text1.setText("Gadolinio");
                Text2.setText("");
                Text2.setText("64");
                Text3.setText("");
                Text3.setText("157025");
                area.setText("\n     Gd");
                area.setBackground(Color.lightGray);

            }
            if (elemento.equals(nomb.nombres[96])) {
                Text1.setText("");
                Text1.setText("Terbio");
                Text2.setText("");
                Text2.setText("65");
                Text3.setText("");
                Text3.setText("158.929 ");
                area.setText("\n     Tb ");
                area.setBackground(Color.lightGray);

            }
            if (elemento.equals(nomb.nombres[97])) {
                Text1.setText("");
                Text1.setText("Disprosio");
                Text2.setText("");
                Text2.setText("66");
                Text3.setText("");
                Text3.setText("162.50");
                area.setText("\n     Dy");
                area.setBackground(Color.lightGray);

            }
            if (elemento.equals(nomb.nombres[98])) {

                Text1.setText("");
                Text1.setText(" Holmio");
                Text2.setText("");
                Text2.setText("67");
                Text3.setText("");
                Text3.setText(" 164.9303");
                area.setText("\n     Ho");
                area.setBackground(Color.lightGray);

            }
            if (elemento.equals(nomb.nombres[99])) {
                Text1.setText("");
                Text1.setText(" Erbio");
                Text2.setText("");
                Text2.setText("68");
                Text3.setText("");
                Text3.setText("167.26");
                area.setText("\n     Er");
                area.setBackground(Color.lightGray);

            }
            if (elemento.equals(nomb.nombres[100])) {
                Text1.setText("");
                Text1.setText(" Tulio ");
                Text2.setText("");
                Text2.setText("69");
                Text3.setText("");
                Text3.setText("168.9342 ");
                area.setText("\n     Tm");
                area.setBackground(Color.lightGray);

            }
            if (elemento.equals(nomb.nombres[101])) {
                Text1.setText("");
                Text1.setText("Iterbio ");
                Text2.setText("");
                Text2.setText("70");
                Text3.setText("");
                Text3.setText(" 173.04 ");
                area.setText("\n     Yb");
                area.setBackground(Color.lightGray);

            }
            if (elemento.equals(nomb.nombres[102])) {
                Text1.setText("");
                Text1.setText("Lutecio");
                Text2.setText("");
                Text2.setText("71");
                Text3.setText("");
                Text3.setText("174.967");
                area.setText("\n     Lu");
                area.setBackground(Color.lightGray);

            }
            //// ACtinos 
            if (elemento.equals(nomb.nombres[103])) {
                Text1.setText("");
                Text1.setText("Actino");
                Text2.setText("");
                Text2.setText("89");
                Text3.setText("");
                Text3.setText("227");
                area.setText("\n     Li");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[104])) {
                Text1.setText("");
                Text1.setText("Torio ");
                Text2.setText("");
                Text2.setText("90");
                Text3.setText("");
                Text3.setText("232.0381 ");
                area.setText("\n     Th");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[105])) {
                Text1.setText("");
                Text1.setText("Protactino ");
                Text2.setText("");
                Text2.setText("91");
                Text3.setText("");
                Text3.setText("231.0388");
                area.setText("\n     Pa");
                area.setBackground(Color.CYAN);

            }

            if (elemento.equals(nomb.nombres[106])) {
                Text1.setText("");
                Text1.setText("Uranio");
                Text2.setText("");
                Text2.setText("92");
                Text3.setText("");
                Text3.setText("238.0289 ");
                area.setText("\n     U");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[107])) {
                Text1.setText("");
                Text1.setText("Neptunio ");
                Text2.setText("");
                Text2.setText("93");
                Text3.setText("");
                Text3.setText("237.0482 ");
                area.setText("\n     Np");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[108])) {
                Text1.setText("");
                Text1.setText("Plutonio");
                Text2.setText("");
                Text2.setText("94");
                Text3.setText("");
                Text3.setText("244.664");
                area.setText("\n     Pu");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[109])) {
                Text1.setText("");
                Text1.setText("Amaricio ");
                Text2.setText("");
                Text2.setText("95");
                Text3.setText("");
                Text3.setText("243.061");
                area.setText("\n     Am");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[110])) {
                Text1.setText("");
                Text1.setText("Curio");
                Text2.setText("");
                Text2.setText("96");
                Text3.setText("");
                Text3.setText("247.07");
                area.setText("\n     Cm");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[111])) {
                Text1.setText("");
                Text1.setText("Berkelio ");
                Text2.setText("");
                Text2.setText("97");
                Text3.setText("");
                Text3.setText("247.07 ");
                area.setText("\n     Bk");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[112])) {
                Text1.setText("");
                Text1.setText("Californio");
                Text2.setText("");
                Text2.setText("98");
                Text3.setText("");
                Text3.setText("251.08 ");
                area.setText("\n     Cf");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[113])) {
                Text1.setText("");
                Text1.setText(" Einsteno ");
                Text2.setText("");
                Text2.setText("99");
                Text3.setText("");
                Text3.setText("252.08");
                area.setText("\n     Es");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[114])) {
                Text1.setText("");
                Text1.setText(" Fermio");
                Text2.setText("");
                Text2.setText("100");
                Text3.setText("");
                Text3.setText("257.100 ");
                area.setText("\n     Fm");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[115])) {
                Text1.setText("");
                Text1.setText("Mendelevio");
                Text2.setText("");
                Text2.setText("101");
                Text3.setText("");
                Text3.setText("258.10 ");
                area.setText("\n     Md");
                area.setBackground(Color.CYAN);

            }
            if (elemento.equals(nomb.nombres[116])) {
                Text1.setText("");
                Text1.setText("Nobelio");
                Text2.setText("");
                Text2.setText("102");
                Text3.setText("");
                Text3.setText("259.10");
                area.setText("\n     No");
                area.setBackground(Color.CYAN);

            }

            if (elemento.equals(nomb.nombres[117])) {
                Text1.setText("");
                Text1.setText("Laurencio");
                Text2.setText("");
                Text2.setText("103");
                Text3.setText("");
                Text3.setText("262.11 ");
                area.setText("\n     Lr");
                area.setBackground(Color.CYAN);

            }

        }
    }

    public static void main(String[] args) {

        Busqueda ventana = new Busqueda();

        ventana.setBounds(100, 100, 925, 650);
        ventana.setVisible(true);
        ventana.setResizable(false);

    }

}
