
import javax.swing.*;
import java.awt.event.*;

import java.awt.*;
import java.util.*;
import javax.swing.JOptionPane.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.swing.border.*;

public class Tabla extends Interfaz {

    public JMenuItem OpcionCrear;
    //  public JMenuItem OpcionAltas;
    //public JMenuItem OpcionBajas;
    //public JMenuItem OpcionCambios;
    // public JMenuItem OpcionBorrar;
    // public JMenuItem OpcionIndividual;
    //public JMenuItem OpcionGeneral;
    public JMenuItem OpcionSalir;

    public JMenuBar BarraDeMenus;

    public JMenu menuArchivo;
    // public JMenu menuRecuperacion;
    //public JMenu menuActualizacion;
    //public JMenu menuConsulta;
    //public JMenu menuhacercaDe;

    public JToolBar BarraDeHerr;

    public JTextField campoText1o;
    public JTextArea area, area2;
    public JTextArea campoTexto;
    public JLabel msj;

    public Color colorx;

    //
    public String elemento;
    public int apuntador;
    public JComboBox tipou;
    public int c = 4;
    public JButton busqueda;

    public Tabla() {
        BarraDeHerr = new JToolBar();
        BarraDeMenus = new JMenuBar();
        menuArchivo = new JMenu();
        //  menuRecuperacion  = new JMenu();
        OpcionCrear = new JMenuItem();
        //   menuActualizacion = new JMenu();
        // menuConsulta      = new JMenu();
        //menuhacercaDe     = new JMenu();
        //OpcionAltas       = new JMenuItem();
        //OpcionBajas       = new JMenuItem();
        //OpcionCambios     = new JMenuItem();
        //OpcionBorrar      = new JMenuItem();
        //OpcionIndividual  = new JMenuItem();
        //OpcionGeneral     = new JMenuItem();

        OpcionSalir = new JMenuItem();

        //-------------------Menu Archivo-------------------//
        menuArchivo.setMnemonic('A');
        menuArchivo.setText("||Busqueda por nombre||");
        //-------------------Opcion Crear-------------------//
        OpcionCrear.setMnemonic('C');
        OpcionCrear.setText("Buscar");
        OpcionCrear.setToolTipText("Busca los datos con el nombre del elemento");
        menuArchivo.add(OpcionCrear);
        /*  //-------------------Opcion Actualizacion-----------//
        menuActualizacion.setMnemonic('A');
        menuActualizacion.setText("Actualizacion");
        //------------------SubOpcion Altas de Actualizacion-----//
        OpcionAltas.setMnemonic('l');
        OpcionAltas.setText("Altas");
        OpcionAltas.setToolTipText("AÃ±ade registros al final del archivo");
        menuActualizacion.add(OpcionAltas);
        //------------------SubOpcion Bajas de Actualizacion-----//
        OpcionBajas.setMnemonic('B');
        OpcionBajas.setText("Bajas");
        OpcionBajas.setToolTipText("Elimina un registro del archivo");
        menuActualizacion.add(OpcionBajas);
        //------------------SubOpcion Cambios de Actualizacion-----//
        OpcionCambios.setMnemonic('C');
        OpcionCambios.setText("Cambios");
        OpcionCambios.setToolTipText("Cambia el contenido de un registro");
        menuActualizacion.add(OpcionCambios);

        menuArchivo.add(menuActualizacion);  */

        //------------------Opcion Salir---------------------------//
        /* OpcionBorrar.setMnemonic('o');
        OpcionBorrar.setText("Borrar archivo");
        OpcionBorrar.setToolTipText("Borrar el archivo del disco");
        menuArchivo.add(OpcionBorrar); */
        OpcionSalir.setMnemonic('S');
        OpcionSalir.setToolTipText("Termina la aplicacion");
        OpcionSalir.setText("Salir");

        menuArchivo.add(OpcionSalir);

        /*  menuRecuperacion.setMnemonic('R');
        menuRecuperacion.setText("Recuperacion");
        menuConsulta.setText("Consulta");
        menuConsulta.setMnemonic('t');

        OpcionIndividual.setText("Indidual");
        OpcionIndividual.setMnemonic('I');
        OpcionIndividual.setToolTipText("Consulta un registro del archivo");
        menuConsulta.add(OpcionIndividual);
        OpcionGeneral.setText("General");
        OpcionGeneral.setMnemonic('G');
        OpcionGeneral.setToolTipText("Muestra el contenido del archivo");
        menuConsulta.add(OpcionGeneral);

        menuRecuperacion.add(menuConsulta);*/
        BarraDeMenus.add(menuArchivo);

        //  BarraDeMenus.add(menuRecuperacion);
        setJMenuBar(BarraDeMenus);

        NombresElementos nomb = new NombresElementos();
        busqueda = new JButton("Salir");
        busqueda.setBounds(600, 40, 100, 25);
        tipou = new JComboBox(nomb.lista);
        tipou.setBounds(640, 80, 100, 20);

        //  getContentPane().add(tipou);
        getContentPane().add(busqueda);

        setTitle("TABLA PERIODICA DE LOS ELEMENTOS QUIMICOS+");

        setLayout(null);

        colorx = new java.awt.Color(0, 0, 0);

        campoTexto = new JTextArea(150, 100);
        campoTexto.setFont(new java.awt.Font("Arial", 1, 45));
        campoTexto.setBounds(200, 100, 320, 60);

        campoTexto.setBackground(colorx);

        area = new JTextArea(40, 40);
        area.setFont(new java.awt.Font("Arial", 1, 20));
        area.append(" \nSimbolo");
        area.setBounds(450, 160, 80, 80);
        area.setBackground(color3);
        area.setEditable(false);

        /* area2  = new JTextArea   (40,40);
     area2.setFont(new java.awt.Font("Arial",1,20));
       area2.setBounds(450,150,70, 70);
        area2.setBackground(color3);
            area2.append (" \nNombre");
       area.add(area2);*/
        getContentPane().add(area);

        getContentPane().setBackground(colorx);

        msj = new JLabel(" TABLA PERIODICA DE LOS ELEMENTOS QUIMICOS");
        msj.setFont(new java.awt.Font("Arial", 3, 16));
        msj.setForeground(Color.white);

        msj.setBounds(100, 00, 500, 100);
        add(msj);

        ActionListener accion = new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                Object obj = evento.getSource();

                if (obj == OpcionCrear) {
                    new Busqueda().setVisible(true);
                }

                if (obj == OpcionSalir) {
                    System.exit(0);

                }

            }
        };

        OpcionCrear.addActionListener(accion);

        OpcionSalir.addActionListener(accion);

        add(H);
        add(Li);
        add(Na);
        add(K);
        add(Rb);
        add(Cs);
        add(Fr);
        add(Be);
        add(Mg);
        add(Ca);
        add(Sr);
        add(Ba);
        add(Ra);
        add(Sc);
        add(Y);
        add(Lan);
        add(Act);
        add(Ti);
        add(Zr);
        add(Hf);
        add(Rf);

        add(V);
        add(Nb);
        add(Ta);
        add(Db);

        add(Cr);
        add(Mo);
        add(W);
        add(Sg);
        add(Mn);
        add(Tc);
        add(Re);
        add(Bh);
        add(Fe);
        add(Ru);
        add(Os);
        add(Hs);
        add(Co);
        add(Rh);
        add(Ir);
        add(Mt);
        add(Ni);
        add(Pd);
        add(Pt);
        add(Ds);

        add(Cu);
        add(Ag);
        add(Au);
        add(Rg);
        add(Zn);
        add(Cd);
        add(Hg);
        add(Cn);
        add(B);
        add(Al);
        add(Ga);
        add(In);
        add(TI);
        add(Uut);

        add(C);
        add(Si);
        add(Ge);
        add(Sn);
        add(Pb);
        add(Uuq);
        add(N);
        add(P);
        add(As);
        add(Sb);
        add(Bi);
        add(Uup);
        add(O);
        add(S);
        add(Se);
        add(Te);
        add(Po);
        add(Uuh);
        add(F);
        add(Cl);
        add(Br);
        add(I);
        add(At);
        add(Uus);

        add(He);
        add(Ne);
        add(Ar);
        add(Kr);
        add(Xe);
        add(Rn);
        add(Uuo);

        add(La);
        add(Ce);
        add(Pr);
        add(Nd);
        add(Pm);
        add(Sm);
        add(Eu);
        add(Gd);
        add(Tb);
        add(Dy);
        add(Ho);
        add(Er);
        add(Tm);
        add(Yb);
        add(Lu);

        add(Ac);
        add(Th);
        add(Pa);
        add(U);
        add(Np);
        add(Pu);
        add(Am);
        add(Cm);
        add(Bk);
        add(Cf);
        add(Es);
        add(Fm);
        add(Md);
        add(No);
        add(Lr);

    }

    public void actionPerformed(ActionEvent evento) {
        NombresElementos nomb = new NombresElementos();

        Container f = this.getContentPane();

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

            }
            if (elemento.equals(nomb.nombres[1])) {
                Text1.setText("");
                Text1.setText("Litio");
                Text2.setText("");
                Text2.setText("3");
                Text3.setText("");
                Text3.setText("6.941");
                area.setText("\n     Li");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[2])) {
                Text1.setText("");
                Text1.setText("Sodio");
                Text2.setText("");
                Text2.setText("11");
                Text3.setText("");
                Text3.setText("22.9898");
                area.setText("\n     Na");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[3])) {
                Text1.setText("");
                Text1.setText("Potasio");
                Text2.setText("");
                Text2.setText("19");
                Text3.setText("");
                Text3.setText("39.0983");
                area.setText("\n      k");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[4])) {
                Text1.setText("");
                Text1.setText("Rubidio");
                Text2.setText("");
                Text2.setText("37");
                Text3.setText("");
                Text3.setText("85.4678");
                area.setText("\n     Rb");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[5])) {
                Text1.setText("");
                Text1.setText("Cesio ");
                Text2.setText("");
                Text2.setText("3");
                Text3.setText("");
                Text3.setText("132.9054");
                area.setText("\n     Cs");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[6])) {
                Text1.setText("");
                Text1.setText("Francio");
                Text2.setText("");
                Text2.setText("87");
                Text3.setText("");
                Text3.setText("223.02 ");
                area.setText("\n     Fr");
                area.setBackground(Color.red);

            }

            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Berilio");
                Text2.setText("");
                Text2.setText("4");
                Text3.setText("");
                Text3.setText("9.0122");
                area.setText("\n     Be");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Magnesio");
                Text2.setText("");
                Text2.setText("12");
                Text3.setText("");
                Text3.setText("24.3050");
                area.setText("\n     Mg");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Calcio");
                Text2.setText("");
                Text2.setText("20");
                Text3.setText("");
                Text3.setText("40.078 ");
                area.setText("\n     Ca");

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Estroncio");
                Text2.setText("");
                Text2.setText("38");
                Text3.setText("");
                Text3.setText("87.62");
                area.setText("\n     Sr");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Bario");
                Text2.setText("");
                Text2.setText("56");
                Text3.setText(" 137.327");
                Text3.setText("6.941");
                area.setText("\n     Ba");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Radio");
                Text2.setText("");
                Text2.setText("88");
                Text3.setText("");
                Text3.setText("226.0254");
                area.setText("\n     Ra");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Escandio");
                Text2.setText("");
                Text2.setText("21");
                Text3.setText("");
                Text3.setText("44.9559");
                area.setText("\n     Sc");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Itrio");
                Text2.setText("");
                Text2.setText("39");
                Text3.setText("");
                Text3.setText("88.9059 ");
                area.setText("\n     Y");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Serie Del Actino");
                Text2.setText("");
                Text2.setText("------");
                Text3.setText("");
                Text3.setText("---");
                area.setText("\n     ");
                area.setBackground(Color.black);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Serie De Lantanidos");
                Text2.setText("");
                Text2.setText("---");
                Text3.setText("");
                Text3.setText("----");
                area.setText("\n     ");
                area.setBackground(Color.black);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Titanio ");
                Text2.setText("");
                Text2.setText("22");
                Text3.setText("");
                Text3.setText("47.867");
                area.setText("\n     Ti");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Circonio");
                Text2.setText("");
                Text2.setText("40");
                Text3.setText("");
                Text3.setText("91.224 ");
                area.setText("\n     Zr");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Hafnio");
                Text2.setText("");
                Text2.setText("72");
                Text3.setText("");
                Text3.setText("178.49 ");
                area.setText("\n     Hf");
                area.setBackground(Color.red);
            }

            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Rutherfordio");
                Text2.setText("");
                Text2.setText("104");
                Text3.setText("");
                Text3.setText("621.11");
                area.setText("\n     Rf");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Vanadio ");
                Text2.setText("");
                Text2.setText("23");
                Text3.setText("");
                Text3.setText("50.9415");
                area.setText("\n     V");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Niobio");
                Text2.setText("");
                Text2.setText("41");
                Text3.setText("");
                Text3.setText("92.9064 ");
                area.setText("\n     Nb");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Tantalio");
                Text2.setText("");
                Text2.setText("73");
                Text3.setText("");
                Text3.setText("180.9474");
                area.setText("\n     Ta");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Dubnio");
                Text2.setText("");
                Text2.setText("105");
                Text3.setText("");
                Text3.setText("262.11");
                area.setText("\n     Db");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Cromo");
                Text2.setText("");
                Text2.setText("24");
                Text3.setText("");
                Text3.setText("51.9961");
                area.setText("\n     Li");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Molibdeno");
                Text2.setText("");
                Text2.setText("42");
                Text3.setText("");
                Text3.setText("95.94 ");
                area.setText("\n     Mo");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Tugsteno");
                Text2.setText("");
                Text2.setText("74");
                Text3.setText("");
                Text3.setText("183.84 ");
                area.setText("\n     W");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Seaborgio ");
                Text2.setText("");
                Text2.setText("106");
                Text3.setText("");
                Text3.setText(" 263.12");
                area.setText("\n     Sg");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Manganeso ");
                Text2.setText("");
                Text2.setText("25");
                Text3.setText("");
                Text3.setText(" 54.9380");
                area.setText("\n     Mn");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Tecnesio");
                Text2.setText("");
                Text2.setText("43");
                Text3.setText("");
                Text3.setText(" 97.907");
                area.setText("\n     Tc");
                area.setBackground(Color.red);
            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText(" Renio ");
                Text2.setText("");
                Text2.setText("75");
                Text3.setText("");
                Text3.setText("186.207 ");
                area.setText("\n     Re");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Bohrio");
                Text2.setText("");
                Text2.setText("107");
                Text3.setText("");
                Text3.setText("262.12");
                area.setText("\n     Bh");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Hierro ");
                Text2.setText("");
                Text2.setText("26");
                Text3.setText("");
                Text3.setText("55.845");
                area.setText("\n     Fe");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Rutenio");
                Text2.setText("");
                Text2.setText("44");
                Text3.setText("");
                Text3.setText("101.07");
                area.setText("\n     Ru");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Osmio");
                Text2.setText("");
                Text2.setText("76");
                Text3.setText("");
                Text3.setText("190.2");
                area.setText("\n     Os");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Hassnio");
                Text2.setText("");
                Text2.setText("108");
                Text3.setText("");
                Text3.setText("265");
                area.setText("\n     Hs");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Cobalto");
                Text2.setText("");
                Text2.setText("27");
                Text3.setText("");
                Text3.setText("58.9332");
                area.setText("\n     Co");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText(" Rodio");
                Text2.setText("");
                Text2.setText("45");
                Text3.setText("");
                Text3.setText("102.9055");
                area.setText("\n     Li");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Iridio");
                Text2.setText("");
                Text2.setText("77");
                Text3.setText("");
                Text3.setText("192.22 ");
                area.setText("\n     Ir");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText(" Meitnerio");
                Text2.setText("");
                Text2.setText("109");
                Text3.setText("");
                Text3.setText("266");
                area.setText("\n     Mt");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Niquel");
                Text2.setText("");
                Text2.setText("28");
                Text3.setText("");
                Text3.setText("58.6394");
                area.setText("\n     Ni");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Paladio");
                Text2.setText("");
                Text2.setText("46");
                Text3.setText("");
                Text3.setText("106.42");
                area.setText("\n     Pd");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText(" Platino");
                Text2.setText("");
                Text2.setText("78");
                Text3.setText("");
                Text3.setText("195.09");
                area.setText("\n     Pt");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Ununnilio");
                Text2.setText("");
                Text2.setText("110");
                Text3.setText("");
                Text3.setText("269");
                area.setText("\n     Uun");

                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Cobre ");
                Text2.setText("");
                Text2.setText("29");
                Text3.setText("");
                Text3.setText("63.546 ");
                area.setText("\n     Cu");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText(" Plata");
                Text2.setText("");
                Text2.setText("47");
                Text3.setText("");
                Text3.setText("107.8682");
                area.setText("\n     Ag");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Oro");
                Text2.setText("");
                Text2.setText("79");
                Text3.setText("");
                Text3.setText("196.9665 ");
                area.setText("\n     Au");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Plutirio");
                Text2.setText("");
                Text2.setText("111");
                Text3.setText("");
                Text3.setText("269");
                area.setText("\n     Pl");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Zinc");
                Text2.setText("");
                Text2.setText("30");
                Text3.setText("");
                Text3.setText("65.39");
                area.setText("\n     Zn");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Cadmio");
                Text2.setText("");
                Text2.setText("48");
                Text3.setText("");
                Text3.setText(" 112.411");
                area.setText("\n     Cd");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Mercurio");
                Text2.setText("");
                Text2.setText("80");
                Text3.setText("");
                Text3.setText("200.59 ");
                area.setText("\n     Hg");
                area.setBackground(Color.red);
            }

            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Darwanzio");
                Text2.setText("");
                Text2.setText("112");
                Text3.setText("");
                Text3.setText("264");
                area.setText("\n     Da");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Boro");
                Text2.setText("");
                Text2.setText("5");
                Text3.setText("");
                Text3.setText("10.811");
                area.setText("\n     B");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText(" Aluminio ");
                Text2.setText("");
                Text2.setText("13");
                Text3.setText("");
                Text3.setText(" 26.9815");
                area.setText("\n     Al");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Galio");
                Text2.setText("");
                Text2.setText("31");
                Text3.setText("");
                Text3.setText("69.723");
                area.setText("\n     Ga");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Indio");
                Text2.setText("");
                Text2.setText("49");
                Text3.setText("");
                Text3.setText(" 114.818");
                area.setText("\n     In");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Talio");
                Text2.setText("");
                Text2.setText("81");
                Text3.setText("");
                Text3.setText(" 204.3833");
                area.setText("\n     Li");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Ununutrio");
                Text2.setText("");
                Text2.setText("113");
                Text3.setText("");
                Text3.setText("Sin dato");
                area.setText("\n     Uut");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Carbono");
                Text2.setText("");
                Text2.setText("6");
                Text3.setText("");
                Text3.setText("12.011");
                area.setText("\n     C");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Silicio ");
                Text2.setText("");
                Text2.setText("14");
                Text3.setText("");
                Text3.setText("28.0855");
                area.setText("\n     Si");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Germanio");
                Text2.setText("");
                Text2.setText("32");
                Text3.setText("");
                Text3.setText("72.61");
                area.setText("\n     Ge");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Estanio");
                Text2.setText("");
                Text2.setText("50");
                Text3.setText("");
                Text3.setText(" 118.710");
                area.setText("\n     Sn");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Plomo ");
                Text2.setText("");
                Text2.setText("82");
                Text3.setText("");
                Text3.setText("207.2 ");
                area.setText("\n     Pb");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Ununcuadio");
                Text2.setText("");
                Text2.setText("114");
                Text3.setText("");
                Text3.setText("Sin dato");
                area.setText("\n     Uuq");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Nitrogeno");
                Text2.setText("");
                Text2.setText("7");
                Text3.setText("");
                Text3.setText("14.0067 ");
                area.setText("\n     N");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Fosforo");
                Text2.setText("");
                Text2.setText("15");
                Text3.setText("");
                Text3.setText("30.9738");
                area.setText("\n     P");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Arsenico");
                Text2.setText("");
                Text2.setText("33");
                Text3.setText("");
                Text3.setText("74.9216 ");
                area.setText("\n     As");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Antimonio ");
                Text2.setText("");
                Text2.setText("51");
                Text3.setText("");
                Text3.setText("121.760");
                area.setText("\n     Sb");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Bismuto");
                Text2.setText("");
                Text2.setText("83");
                Text3.setText("");
                Text3.setText("208.9804 ");
                area.setText("\n     Bi");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Ununpentio");
                Text2.setText("");
                Text2.setText("115");
                Text3.setText("");
                Text3.setText("Sin dato");
                area.setText("\n     Uup");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Oxigeno ");
                Text2.setText("");
                Text2.setText("8");
                Text3.setText("");
                Text3.setText(" 15.9994 ");
                area.setText("\n     O");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Azufre");
                Text2.setText("");
                Text2.setText("16");
                Text3.setText("");
                Text3.setText("32.066");
                area.setText("\n     S");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Selenio");
                Text2.setText("");
                Text2.setText("34");
                Text3.setText("");
                Text3.setText("78.96");
                area.setText("\n     Se");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Telurio");
                Text2.setText("");
                Text2.setText("52");
                Text3.setText("");
                Text3.setText("127.60 ");
                area.setText("\n     Te");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Polonio");
                Text2.setText("");
                Text2.setText("84");
                Text3.setText("");
                Text3.setText("208.98");
                area.setText("\n     Po");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Ununhexio");
                Text2.setText("");
                Text2.setText("115");
                Text3.setText("");
                Text3.setText("Sin dato");
                area.setText("\n     Uuh");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Fluor ");
                Text2.setText("");
                Text2.setText("9");
                Text3.setText("");
                Text3.setText("18.9984 ");
                area.setText("\n     F");
                area.setBackground(Color.red);
            }

            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Cloro ");
                Text2.setText("");
                Text2.setText("17");
                Text3.setText("");
                Text3.setText("35.427");
                area.setText("\n     Cl");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Bromo ");
                Text2.setText("");
                Text2.setText("35");
                Text3.setText("");
                Text3.setText("79.904 ");
                area.setText("\n     Br");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText(" Yodo");
                Text2.setText("");
                Text2.setText("53");
                Text3.setText("");
                Text3.setText("126.9045");
                area.setText("\n     I");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Astato");
                Text2.setText("");
                Text2.setText("85");
                Text3.setText("");
                Text3.setText("209.99 ");
                area.setText("\n     At");
                area.setBackground(Color.red);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Ununseptio");
                Text2.setText("");
                Text2.setText("117");
                Text3.setText("");
                Text3.setText("Sin dato");
                area.setText("\n     Uus");
                area.setBackground(Color.red);

            }

            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Helio");
                Text2.setText("");
                Text2.setText("2");
                Text3.setText("");
                Text3.setText(" 4.0026 ");
                area.setText("\n     He");
                area.setBackground(Color.white);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Neon");
                Text2.setText("");
                Text2.setText("10");
                Text3.setText("");
                Text3.setText("20.1797");
                area.setText("\n     Ne");
                area.setBackground(Color.white);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Argon ");
                Text2.setText("");
                Text2.setText("18");
                Text3.setText("");
                Text3.setText("39.948");
                area.setText("\n     Ar");
                area.setBackground(Color.white);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText(" Cripton");
                Text2.setText("");
                Text2.setText("36");
                Text3.setText("");
                Text3.setText("83.80 ");
                area.setText("\n     Kr");
                area.setBackground(Color.white);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Xenon");
                Text2.setText("");
                Text2.setText("54");
                Text3.setText("");
                Text3.setText("131.29 ");
                area.setText("\n     Xe");
                area.setBackground(Color.white);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Radon ");
                Text2.setText("");
                Text2.setText("86");
                Text3.setText("");
                Text3.setText("222.02");
                area.setText("\n     Rn");
                area.setBackground(Color.white);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Ununoctio");
                Text2.setText("");
                Text2.setText("118");
                Text3.setText("");
                Text3.setText("Sin dato");
                area.setText("\n     Uuo");
                area.setBackground(Color.white);

            }
            //Lantanidos
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Lantano");
                Text2.setText("");
                Text2.setText("57");
                Text3.setText("");
                Text3.setText("138.9055");
                area.setText("\n     La");
                area.setBackground(Color.pink);
            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText(" Cerio");
                Text2.setText("");
                Text2.setText("58");
                Text3.setText("");
                Text3.setText("140.115");
                area.setText("\n     Ce");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Praseodimo");
                Text2.setText("");
                Text2.setText("59");
                Text3.setText("");
                Text3.setText("140.9076");
                area.setText("\n     Pr");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Neodimio");
                Text2.setText("");
                Text2.setText("60");
                Text3.setText("");
                Text3.setText("144.24 ");
                area.setText("\n     Nd");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Prometio ");
                Text2.setText("");
                Text2.setText("61");
                Text3.setText("");
                Text3.setText(" 24.3050");
                area.setText("\n     Pm");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Samario ");
                Text2.setText("");
                Text2.setText("62");
                Text3.setText("");
                Text3.setText("150.36");
                area.setText("\n     Sm");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Europio ");
                Text2.setText("");
                Text2.setText("63");
                Text3.setText("");
                Text3.setText("151.965");
                area.setText("\n     Eu");
                area.setBackground(Color.pink);
            }

            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Gadolinio");
                Text2.setText("");
                Text2.setText("64");
                Text3.setText("");
                Text3.setText("157025");
                area.setText("\n     Gd");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Terbio");
                Text2.setText("");
                Text2.setText("65");
                Text3.setText("");
                Text3.setText("158.929 ");
                area.setText("\n     Tb ");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Disprosio");
                Text2.setText("");
                Text2.setText("66");
                Text3.setText("");
                Text3.setText("162.50");
                area.setText("\n     Dy");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[c++])) {

                Text1.setText("");
                Text1.setText(" Holmio");
                Text2.setText("");
                Text2.setText("67");
                Text3.setText("");
                Text3.setText(" 164.9303");
                area.setText("\n     Ho");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText(" Erbio");
                Text2.setText("");
                Text2.setText("68");
                Text3.setText("");
                Text3.setText("167.26");
                area.setText("\n     Er");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText(" Tulio ");
                Text2.setText("");
                Text2.setText("69");
                Text3.setText("");
                Text3.setText("168.9342 ");
                area.setText("\n     Tm");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Iterbio ");
                Text2.setText("");
                Text2.setText("70");
                Text3.setText("");
                Text3.setText(" 173.04 ");
                area.setText("\n     Yb");
                area.setBackground(Color.pink);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Lutecio");
                Text2.setText("");
                Text2.setText("71");
                Text3.setText("");
                Text3.setText("174.967");
                area.setText("\n     Lu");
                area.setBackground(Color.pink);

            }
            //// ACtinos 
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Actino");
                Text2.setText("");
                Text2.setText("89");
                Text3.setText("");
                Text3.setText("227");
                area.setText("\n     Li");
                area.setBackground(Color.magenta);

            }
            if (evento.getSource() == Th) {
                Text1.setText("");
                Text1.setText("Torio ");
                Text2.setText("");
                Text2.setText("90");
                Text3.setText("");
                Text3.setText("232.0381 ");
                area.setText("\n     Th");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Protactino ");
                Text2.setText("");
                Text2.setText("91");
                Text3.setText("");
                Text3.setText("231.0388");
                area.setText("\n     Pa");
                area.setBackground(Color.magenta);

            }

            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Uranio");
                Text2.setText("");
                Text2.setText("92");
                Text3.setText("");
                Text3.setText("238.0289 ");
                area.setText("\n     U");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Neptunio ");
                Text2.setText("");
                Text2.setText("93");
                Text3.setText("");
                Text3.setText("237.0482 ");
                area.setText("\n     Np");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Plutonio");
                Text2.setText("");
                Text2.setText("94");
                Text3.setText("");
                Text3.setText("244.664");
                area.setText("\n     Pu");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Amaricio ");
                Text2.setText("");
                Text2.setText("95");
                Text3.setText("");
                Text3.setText("243.061");
                area.setText("\n     Am");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Curio");
                Text2.setText("");
                Text2.setText("96");
                Text3.setText("");
                Text3.setText("247.07");
                area.setText("\n     Cm");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Berkelio ");
                Text2.setText("");
                Text2.setText("97");
                Text3.setText("");
                Text3.setText("247.07 ");
                area.setText("\n     Bk");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Californio");
                Text2.setText("");
                Text2.setText("98");
                Text3.setText("");
                Text3.setText("251.08 ");
                area.setText("\n     Cf");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText(" Einsteno ");
                Text2.setText("");
                Text2.setText("99");
                Text3.setText("");
                Text3.setText("252.08");
                area.setText("\n     Es");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText(" Fermio");
                Text2.setText("");
                Text2.setText("100");
                Text3.setText("");
                Text3.setText("257.100 ");
                area.setText("\n     Fm");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Mendelevio");
                Text2.setText("");
                Text2.setText("101");
                Text3.setText("");
                Text3.setText("258.10 ");
                area.setText("\n     Md");
                area.setBackground(Color.magenta);

            }
            if (elemento.equals(nomb.nombres[c++])) {
                Text1.setText("");
                Text1.setText("Nobelio");
                Text2.setText("");
                Text2.setText("102");
                Text3.setText("");
                Text3.setText("259.10");
                area.setText("\n     No");
                area.setBackground(Color.magenta);

            }

            if (elemento.equals(nomb.nombres[118])) {
                Text1.setText("");
                Text1.setText("Laurencio");
                Text2.setText("");
                Text2.setText("103");
                Text3.setText("");
                Text3.setText("262.11 ");
                area.setText("\n     Lr");
                area.setBackground(Color.magenta);

            }

        }

    }

}
