/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benja
 */
import javax.swing.*;
import java.awt.event.*;

import java.awt.*;
import java.util.*;
import javax.swing.JOptionPane.*;

public class MenuTabla extends Tabla implements ActionListener {

    private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4;
    public JTextField Text1, Text2, Text3;

    public MenuTabla() {

        busqueda.addActionListener(this);
        H.addActionListener(this);
        Li.addActionListener(this);
        Na.addActionListener(this);
        K.addActionListener(this);
        Rb.addActionListener(this);
        Cs.addActionListener(this);
        Fr.addActionListener(this);
        Be.addActionListener(this);
        Mg.addActionListener(this);
        Ca.addActionListener(this);
        Sr.addActionListener(this);
        Ba.addActionListener(this);
        Ra.addActionListener(this);
        Sc.addActionListener(this);
        Y.addActionListener(this);
        Lan.addActionListener(this);
        Act.addActionListener(this);
        Ti.addActionListener(this);
        Zr.addActionListener(this);
        Hf.addActionListener(this);
        Rf.addActionListener(this);
        V.addActionListener(this);
        Nb.addActionListener(this);
        Ta.addActionListener(this);
        Db.addActionListener(this);
        Cr.addActionListener(this);
        Mo.addActionListener(this);
        W.addActionListener(this);
        Sg.addActionListener(this);
        Mn.addActionListener(this);
        Tc.addActionListener(this);
        Re.addActionListener(this);
        Bh.addActionListener(this);
        Fe.addActionListener(this);
        Ru.addActionListener(this);
        Os.addActionListener(this);
        Hs.addActionListener(this);
        Co.addActionListener(this);
        Rh.addActionListener(this);
        Ir.addActionListener(this);
        Mt.addActionListener(this);
        Ni.addActionListener(this);
        Pd.addActionListener(this);
        Pt.addActionListener(this);
        Ds.addActionListener(this);
        Cu.addActionListener(this);
        Ag.addActionListener(this);
        Au.addActionListener(this);
        Rg.addActionListener(this);
        Zn.addActionListener(this);
        Cd.addActionListener(this);
        Hg.addActionListener(this);
        Cn.addActionListener(this);
        B.addActionListener(this);
        Al.addActionListener(this);
        Ga.addActionListener(this);
        In.addActionListener(this);
        TI.addActionListener(this);
        Uut.addActionListener(this);
        C.addActionListener(this);
        Si.addActionListener(this);
        Ge.addActionListener(this);
        Sn.addActionListener(this);
        Pb.addActionListener(this);
        Uuq.addActionListener(this);
        N.addActionListener(this);
        P.addActionListener(this);
        As.addActionListener(this);
        Sb.addActionListener(this);
        Bi.addActionListener(this);
        Uup.addActionListener(this);
        O.addActionListener(this);
        S.addActionListener(this);
        Se.addActionListener(this);
        Te.addActionListener(this);
        Po.addActionListener(this);
        Uuh.addActionListener(this);
        F.addActionListener(this);
        Cl.addActionListener(this);
        Br.addActionListener(this);
        I.addActionListener(this);
        At.addActionListener(this);
        Uus.addActionListener(this);
        He.addActionListener(this);
        Ne.addActionListener(this);
        Ar.addActionListener(this);
        Kr.addActionListener(this);
        Xe.addActionListener(this);
        Rn.addActionListener(this);
        Uuo.addActionListener(this);
        La.addActionListener(this);
        Ce.addActionListener(this);
        Pr.addActionListener(this);
        Nd.addActionListener(this);
        Pm.addActionListener(this);
        Sm.addActionListener(this);
        Eu.addActionListener(this);
        Gd.addActionListener(this);
        Tb.addActionListener(this);
        Dy.addActionListener(this);
        Ho.addActionListener(this);
        Er.addActionListener(this);
        Tm.addActionListener(this);
        Yb.addActionListener(this);
        Lu.addActionListener(this);
        Ac.addActionListener(this);
        Th.addActionListener(this);
        Pa.addActionListener(this);
        U.addActionListener(this);
        Np.addActionListener(this);
        Pu.addActionListener(this);
        Am.addActionListener(this);
        Cm.addActionListener(this);
        Bk.addActionListener(this);
        Cf.addActionListener(this);
        Es.addActionListener(this);
        Fm.addActionListener(this);
        Md.addActionListener(this);
        No.addActionListener(this);
        Lr.addActionListener(this);
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

        etiqueta1.setForeground(Color.red);
        etiqueta2.setForeground(Color.red);
        etiqueta3.setForeground(Color.red);
        etiqueta4.setForeground(Color.ORANGE);

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

    public void actionPerformed(ActionEvent evento) {
        Container f = this.getContentPane();
        NombresElementos nomb = new NombresElementos();

        if (evento.getSource() == H) {
            Text1.setText("");
            Text1.setText("Hidrogeno");
            Text2.setText("");
            Text2.setText("1");
            Text3.setText("");
            Text3.setText("1.0079");
            area.setText("\n     H");
            area.setBackground(Color.blue);
        }
        if (evento.getSource() == Li) {
            Text1.setText("");
            Text1.setText("Litio");
            Text2.setText("");
            Text2.setText("3");
            Text3.setText("");
            Text3.setText("6.941");
            area.setText("\n     Li");
            area.setBackground(Color.blue);

        }
        if (evento.getSource() == Na) {
            Text1.setText("");
            Text1.setText("Sodio");
            Text2.setText("");
            Text2.setText("11");
            Text3.setText("");
            Text3.setText("22.9898");
            area.setText("\n     Na");
            area.setBackground(Color.blue);

        }
        if (evento.getSource() == K) {
            Text1.setText("");
            Text1.setText("Potasio");
            Text2.setText("");
            Text2.setText("19");
            Text3.setText("");
            Text3.setText("39.0983");
            area.setText("\n      k");
            area.setBackground(Color.blue);

        }
        if (evento.getSource() == Rb) {
            Text1.setText("");
            Text1.setText("Rubidio");
            Text2.setText("");
            Text2.setText("37");
            Text3.setText("");
            Text3.setText("85.4678");
            area.setText("\n     Rb");
            area.setBackground(Color.blue);

        }
        if (evento.getSource() == Cs) {
            Text1.setText("");
            Text1.setText("Cesio ");
            Text2.setText("");
            Text2.setText("3");
            Text3.setText("");
            Text3.setText("132.9054");
            area.setText("\n     Cs");
            area.setBackground(Color.blue);

        }
        if (evento.getSource() == Fr) {
            Text1.setText("");
            Text1.setText("Francio");
            Text2.setText("");
            Text2.setText("87");
            Text3.setText("");
            Text3.setText("223.02 ");
            area.setText("\n     Fr");
            area.setBackground(Color.blue);

        }

        if (evento.getSource() == Be) {
            Text1.setText("");
            Text1.setText("Berilio");
            Text2.setText("");
            Text2.setText("4");
            Text3.setText("");
            Text3.setText("9.0122");
            area.setText("\n     Be");
            area.setBackground(Color.pink);

        }
        if (evento.getSource() == Mg) {
            Text1.setText("");
            Text1.setText("Magnesio");
            Text2.setText("");
            Text2.setText("12");
            Text3.setText("");
            Text3.setText("24.3050");
            area.setText("\n     Mg");
            area.setBackground(Color.pink);

        }
        if (evento.getSource() == Ca) {
            Text1.setText("");
            Text1.setText("Calcio");
            Text2.setText("");
            Text2.setText("20");
            Text3.setText("");
            Text3.setText("40.078 ");
            area.setText("\n     Ca");
            area.setBackground(Color.pink);
        }
        if (evento.getSource() == Sr) {
            Text1.setText("");
            Text1.setText("Estroncio");
            Text2.setText("");
            Text2.setText("38");
            Text3.setText("");
            Text3.setText("87.62");
            area.setText("\n     Sr");
            area.setBackground(Color.pink);

        }
        if (evento.getSource() == Ba) {
            Text1.setText("");
            Text1.setText("Bario");
            Text2.setText("");
            Text2.setText("56");
            Text3.setText(" 137.327");
            Text3.setText("6.941");
            area.setText("\n     Ba");
            area.setBackground(Color.pink);

        }
        if (evento.getSource() == Ra) {
            Text1.setText("");
            Text1.setText("Radio");
            Text2.setText("");
            Text2.setText("88");
            Text3.setText("");
            Text3.setText("226.0254");
            area.setText("\n     Ra");
            area.setBackground(Color.pink);

        }
        if (evento.getSource() == Sc) {
            Text1.setText("");
            Text1.setText("Escandio");
            Text2.setText("");
            Text2.setText("21");
            Text3.setText("");
            Text3.setText("44.9559");
            area.setText("\n     Sc");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Y) {
            Text1.setText("");
            Text1.setText("Itrio");
            Text2.setText("");
            Text2.setText("39");
            Text3.setText("");
            Text3.setText("88.9059 ");
            area.setText("\n     Y");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Act) {
            Text1.setText("");
            Text1.setText("Serie Del Actino");
            Text2.setText("");
            Text2.setText("------");
            Text3.setText("");
            Text3.setText("---");
            area.setText("\n     ");
            area.setBackground(Color.black);

        }
        if (evento.getSource() == Lan) {
            Text1.setText("");
            Text1.setText("Serie De Lantanidos");
            Text2.setText("");
            Text2.setText("---");
            Text3.setText("");
            Text3.setText("----");
            area.setText("\n     ");
            area.setBackground(Color.black);

        }
        if (evento.getSource() == Ti) {
            Text1.setText("");
            Text1.setText("Titanio ");
            Text2.setText("");
            Text2.setText("22");
            Text3.setText("");
            Text3.setText("47.867");
            area.setText("\n     Ti");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Zr) {
            Text1.setText("");
            Text1.setText("Circonio");
            Text2.setText("");
            Text2.setText("40");
            Text3.setText("");
            Text3.setText("91.224 ");
            area.setText("\n     Zr");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Hf) {
            Text1.setText("");
            Text1.setText("Hafnio");
            Text2.setText("");
            Text2.setText("72");
            Text3.setText("");
            Text3.setText("178.49 ");
            area.setText("\n     Hf");
            area.setBackground(Color.ORANGE);
        }

        if (evento.getSource() == Rf) {
            Text1.setText("");
            Text1.setText("Rutherfordio");
            Text2.setText("");
            Text2.setText("104");
            Text3.setText("");
            Text3.setText("621.11");
            area.setText("\n     Rf");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == V) {
            Text1.setText("");
            Text1.setText("Vanadio ");
            Text2.setText("");
            Text2.setText("23");
            Text3.setText("");
            Text3.setText("50.9415");
            area.setText("\n     V");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Nb) {
            Text1.setText("");
            Text1.setText("Niobio");
            Text2.setText("");
            Text2.setText("41");
            Text3.setText("");
            Text3.setText("92.9064 ");
            area.setText("\n     Nb");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Ta) {
            Text1.setText("");
            Text1.setText("Tantalio");
            Text2.setText("");
            Text2.setText("73");
            Text3.setText("");
            Text3.setText("180.9474");
            area.setText("\n     Ta");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Db) {
            Text1.setText("");
            Text1.setText("Dubnio");
            Text2.setText("");
            Text2.setText("105");
            Text3.setText("");
            Text3.setText("262.11");
            area.setText("\n     Db");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Cr) {
            Text1.setText("");
            Text1.setText("Cromo");
            Text2.setText("");
            Text2.setText("24");
            Text3.setText("");
            Text3.setText("51.9961");
            area.setText("\n     Li");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Mo) {
            Text1.setText("");
            Text1.setText("Molibdeno");
            Text2.setText("");
            Text2.setText("42");
            Text3.setText("");
            Text3.setText("95.94 ");
            area.setText("\n     Mo");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == W) {
            Text1.setText("");
            Text1.setText("Tugsteno");
            Text2.setText("");
            Text2.setText("74");
            Text3.setText("");
            Text3.setText("183.84 ");
            area.setText("\n     W");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Sg) {
            Text1.setText("");
            Text1.setText("Seaborgio ");
            Text2.setText("");
            Text2.setText("106");
            Text3.setText("");
            Text3.setText(" 263.12");
            area.setText("\n     Sg");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Mn) {
            Text1.setText("");
            Text1.setText("Manganeso ");
            Text2.setText("");
            Text2.setText("25");
            Text3.setText("");
            Text3.setText(" 54.9380");
            area.setText("\n     Mn");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Tc) {
            Text1.setText("");
            Text1.setText("Tecnesio");
            Text2.setText("");
            Text2.setText("43");
            Text3.setText("");
            Text3.setText(" 97.907");
            area.setText("\n     Tc");
            area.setBackground(Color.ORANGE);
        }
        if (evento.getSource() == Re) {
            Text1.setText("");
            Text1.setText(" Renio ");
            Text2.setText("");
            Text2.setText("75");
            Text3.setText("");
            Text3.setText("186.207 ");
            area.setText("\n     Re");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Bh) {
            Text1.setText("");
            Text1.setText("Bohrio");
            Text2.setText("");
            Text2.setText("107");
            Text3.setText("");
            Text3.setText("262.12");
            area.setText("\n     Bh");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Fe) {
            Text1.setText("");
            Text1.setText("Hierro ");
            Text2.setText("");
            Text2.setText("26");
            Text3.setText("");
            Text3.setText("55.845");
            area.setText("\n     Fe");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Ru) {
            Text1.setText("");
            Text1.setText("Rutenio");
            Text2.setText("");
            Text2.setText("44");
            Text3.setText("");
            Text3.setText("101.07");
            area.setText("\n     Ru");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Os) {
            Text1.setText("");
            Text1.setText("Osmio");
            Text2.setText("");
            Text2.setText("76");
            Text3.setText("");
            Text3.setText("190.2");
            area.setText("\n     Os");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Hs) {
            Text1.setText("");
            Text1.setText("Hassnio");
            Text2.setText("");
            Text2.setText("108");
            Text3.setText("");
            Text3.setText("265");
            area.setText("\n     Hs");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Co) {
            Text1.setText("");
            Text1.setText("Cobalto");
            Text2.setText("");
            Text2.setText("27");
            Text3.setText("");
            Text3.setText("58.9332");
            area.setText("\n     Co");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Rh) {
            Text1.setText("");
            Text1.setText(" Rodio");
            Text2.setText("");
            Text2.setText("45");
            Text3.setText("");
            Text3.setText("102.9055");
            area.setText("\n     Li");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Ir) {
            Text1.setText("");
            Text1.setText("Iridio");
            Text2.setText("");
            Text2.setText("77");
            Text3.setText("");
            Text3.setText("192.22 ");
            area.setText("\n     Ir");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Mt) {
            Text1.setText("");
            Text1.setText(" Meitnerio");
            Text2.setText("");
            Text2.setText("109");
            Text3.setText("");
            Text3.setText("266");
            area.setText("\n     Mt");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Ni) {
            Text1.setText("");
            Text1.setText("Niquel");
            Text2.setText("");
            Text2.setText("28");
            Text3.setText("");
            Text3.setText("58.6394");
            area.setText("\n     Ni");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Pd) {
            Text1.setText("");
            Text1.setText("Paladio");
            Text2.setText("");
            Text2.setText("46");
            Text3.setText("");
            Text3.setText("106.42");
            area.setText("\n     Pd");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Pt) {
            Text1.setText("");
            Text1.setText(" Platino");
            Text2.setText("");
            Text2.setText("78");
            Text3.setText("");
            Text3.setText("195.09");
            area.setText("\n     Pt");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Ds) {
            Text1.setText("");
            Text1.setText("Ununnilio");
            Text2.setText("");
            Text2.setText("110");
            Text3.setText("");
            Text3.setText("269");
            area.setText("\n     Uun");

            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Cu) {
            Text1.setText("");
            Text1.setText("Cobre ");
            Text2.setText("");
            Text2.setText("29");
            Text3.setText("");
            Text3.setText("63.546 ");
            area.setText("\n     Cu");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Ag) {
            Text1.setText("");
            Text1.setText(" Plata");
            Text2.setText("");
            Text2.setText("47");
            Text3.setText("");
            Text3.setText("107.8682");
            area.setText("\n     Ag");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Au) {
            Text1.setText("");
            Text1.setText("Oro");
            Text2.setText("");
            Text2.setText("79");
            Text3.setText("");
            Text3.setText("196.9665 ");
            area.setText("\n     Au");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Rg) {
            Text1.setText("");
            Text1.setText("Plutirio");
            Text2.setText("");
            Text2.setText("111");
            Text3.setText("");
            Text3.setText("269");
            area.setText("\n     Pl");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Zn) {
            Text1.setText("");
            Text1.setText("Zinc");
            Text2.setText("");
            Text2.setText("30");
            Text3.setText("");
            Text3.setText("65.39");
            area.setText("\n     Zn");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Cd) {
            Text1.setText("");
            Text1.setText("Cadmio");
            Text2.setText("");
            Text2.setText("48");
            Text3.setText("");
            Text3.setText(" 112.411");
            area.setText("\n     Cd");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == Hg) {
            Text1.setText("");
            Text1.setText("Mercurio");
            Text2.setText("");
            Text2.setText("80");
            Text3.setText("");
            Text3.setText("200.59 ");
            area.setText("\n     Hg");
            area.setBackground(Color.ORANGE);
        }

        if (evento.getSource() == Cn) {
            Text1.setText("");
            Text1.setText("Darwanzio");
            Text2.setText("");
            Text2.setText("112");
            Text3.setText("");
            Text3.setText("264");
            area.setText("\n     Da");
            area.setBackground(Color.ORANGE);

        }
        if (evento.getSource() == B) {
            Text1.setText("");
            Text1.setText("Boro");
            Text2.setText("");
            Text2.setText("5");
            Text3.setText("");
            Text3.setText("10.811");
            area.setText("\n     B");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Al) {
            Text1.setText("");
            Text1.setText(" Aluminio ");
            Text2.setText("");
            Text2.setText("13");
            Text3.setText("");
            Text3.setText(" 26.9815");
            area.setText("\n     Al");
            area.setBackground(Color.magenta);

        }
        if (evento.getSource() == Ga) {
            Text1.setText("");
            Text1.setText("Galio");
            Text2.setText("");
            Text2.setText("31");
            Text3.setText("");
            Text3.setText("69.723");
            area.setText("\n     Ga");
            area.setBackground(Color.magenta);

        }
        if (evento.getSource() == In) {
            Text1.setText("");
            Text1.setText("Indio");
            Text2.setText("");
            Text2.setText("49");
            Text3.setText("");
            Text3.setText(" 114.818");
            area.setText("\n     In");
            area.setBackground(Color.magenta);

        }
        if (evento.getSource() == TI) {
            Text1.setText("");
            Text1.setText("Talio");
            Text2.setText("");
            Text2.setText("81");
            Text3.setText("");
            Text3.setText(" 204.3833");
            area.setText("\n     TI");
            area.setBackground(Color.magenta);

        }
        if (evento.getSource() == Uut) {
            Text1.setText("");
            Text1.setText("Ununutrio");
            Text2.setText("");
            Text2.setText("113");
            Text3.setText("");
            Text3.setText("Sin dato");
            area.setText("\n     Uut");
            area.setBackground(Color.magenta);

        }
        if (evento.getSource() == C) {
            Text1.setText("");
            Text1.setText("Carbono");
            Text2.setText("");
            Text2.setText("6");
            Text3.setText("");
            Text3.setText("12.011");
            area.setText("\n     C");
            area.setBackground(Color.pink);

        }
        if (evento.getSource() == Si) {
            Text1.setText("");
            Text1.setText("Silicio ");
            Text2.setText("");
            Text2.setText("14");
            Text3.setText("");
            Text3.setText("28.0855");
            area.setText("\n     Si");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Ge) {
            Text1.setText("");
            Text1.setText("Germanio");
            Text2.setText("");
            Text2.setText("32");
            Text3.setText("");
            Text3.setText("72.61");
            area.setText("\n     Ge");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Sn) {
            Text1.setText("");
            Text1.setText("Estanio");
            Text2.setText("");
            Text2.setText("50");
            Text3.setText("");
            Text3.setText(" 118.710");
            area.setText("\n     Sn");
            area.setBackground(Color.magenta);

        }
        if (evento.getSource() == Pb) {
            Text1.setText("");
            Text1.setText("Plomo ");
            Text2.setText("");
            Text2.setText("82");
            Text3.setText("");
            Text3.setText("207.2 ");
            area.setText("\n     Pb");
            area.setBackground(Color.magenta);

        }
        if (evento.getSource() == Uuq) {
            Text1.setText("");
            Text1.setText("Ununcuadio");
            Text2.setText("");
            Text2.setText("114");
            Text3.setText("");
            Text3.setText("Sin dato");
            area.setText("\n     Uuq");
            area.setBackground(Color.magenta);

        }
        if (evento.getSource() == N) {
            Text1.setText("");
            Text1.setText("Nitrogeno");
            Text2.setText("");
            Text2.setText("7");
            Text3.setText("");
            Text3.setText("14.0067 ");
            area.setText("\n     N");
            area.setBackground(Color.green);

        }
        if (evento.getSource() == P) {
            Text1.setText("");
            Text1.setText("Fosforo");
            Text2.setText("");
            Text2.setText("15");
            Text3.setText("");
            Text3.setText("30.9738");
            area.setText("\n     P");
            area.setBackground(Color.green);

        }
        if (evento.getSource() == As) {
            Text1.setText("");
            Text1.setText("Arsenico");
            Text2.setText("");
            Text2.setText("33");
            Text3.setText("");
            Text3.setText("74.9216 ");
            area.setText("\n     As");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Sb) {
            Text1.setText("");
            Text1.setText("Antimonio ");
            Text2.setText("");
            Text2.setText("51");
            Text3.setText("");
            Text3.setText("121.760");
            area.setText("\n     Sb");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Bi) {
            Text1.setText("");
            Text1.setText("Bismuto");
            Text2.setText("");
            Text2.setText("83");
            Text3.setText("");
            Text3.setText("208.9804 ");
            area.setText("\n     Bi");
            area.setBackground(Color.magenta);

        }
        if (evento.getSource() == Uup) {
            Text1.setText("");
            Text1.setText("Ununpentio");
            Text2.setText("");
            Text2.setText("115");
            Text3.setText("");
            Text3.setText("Sin dato");
            area.setText("\n     Uup");
            area.setBackground(Color.magenta);

        }
        if (evento.getSource() == O) {
            Text1.setText("");
            Text1.setText("Oxigeno ");
            Text2.setText("");
            Text2.setText("8");
            Text3.setText("");
            Text3.setText(" 15.9994 ");
            area.setText("\n     O");
            area.setBackground(Color.green);

        }
        if (evento.getSource() == S) {
            Text1.setText("");
            Text1.setText("Azufre");
            Text2.setText("");
            Text2.setText("16");
            Text3.setText("");
            Text3.setText("32.066");
            area.setText("\n     S");
            area.setBackground(Color.green);

        }
        if (evento.getSource() == Se) {
            Text1.setText("");
            Text1.setText("Selenio");
            Text2.setText("");
            Text2.setText("34");
            Text3.setText("");
            Text3.setText("78.96");
            area.setText("\n     Se");
            area.setBackground(Color.green);

        }
        if (evento.getSource() == Te) {
            Text1.setText("");
            Text1.setText("Telurio");
            Text2.setText("");
            Text2.setText("52");
            Text3.setText("");
            Text3.setText("127.60 ");
            area.setText("\n     Te");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Po) {
            Text1.setText("");
            Text1.setText("Polonio");
            Text2.setText("");
            Text2.setText("84");
            Text3.setText("");
            Text3.setText("208.98");
            area.setText("\n     Po");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Uuh) {
            Text1.setText("");
            Text1.setText("Ununhexio");
            Text2.setText("");
            Text2.setText("115");
            Text3.setText("");
            Text3.setText("Sin dato");
            area.setText("\n     Uuh");
            area.setBackground(Color.magenta);

        }
        if (evento.getSource() == F) {
            Text1.setText("");
            Text1.setText("Fluor ");
            Text2.setText("");
            Text2.setText("9");
            Text3.setText("");
            Text3.setText("18.9984 ");
            area.setText("\n     F");
            area.setBackground(Color.red);
        }

        if (evento.getSource() == Cl) {
            Text1.setText("");
            Text1.setText("Cloro ");
            Text2.setText("");
            Text2.setText("17");
            Text3.setText("");
            Text3.setText("35.427");
            area.setText("\n     Cl");
            area.setBackground(Color.red);

        }
        if (evento.getSource() == Br) {
            Text1.setText("");
            Text1.setText("Bromo ");
            Text2.setText("");
            Text2.setText("35");
            Text3.setText("");
            Text3.setText("79.904 ");
            area.setText("\n     Br");
            area.setBackground(Color.red);

        }
        if (evento.getSource() == I) {
            Text1.setText("");
            Text1.setText(" Yodo");
            Text2.setText("");
            Text2.setText("53");
            Text3.setText("");
            Text3.setText("126.9045");
            area.setText("\n     I");
            area.setBackground(Color.red);

        }
        if (evento.getSource() == At) {
            Text1.setText("");
            Text1.setText("Astato");
            Text2.setText("");
            Text2.setText("85");
            Text3.setText("");
            Text3.setText("209.99 ");
            area.setText("\n     At");
            area.setBackground(Color.red);

        }
        if (evento.getSource() == Uus) {
            Text1.setText("");
            Text1.setText("Ununseptio");
            Text2.setText("");
            Text2.setText("117");
            Text3.setText("");
            Text3.setText("Sin dato");
            area.setText("\n     Uus");
            area.setBackground(Color.red);

        }

        if (evento.getSource() == He) {
            Text1.setText("");
            Text1.setText("Helio");
            Text2.setText("");
            Text2.setText("2");
            Text3.setText("");
            Text3.setText(" 4.0026 ");
            area.setText("\n     He");
            area.setBackground(Color.yellow);

        }
        if (evento.getSource() == Ne) {
            Text1.setText("");
            Text1.setText("Neon");
            Text2.setText("");
            Text2.setText("10");
            Text3.setText("");
            Text3.setText("20.1797");
            area.setText("\n     Ne");
            area.setBackground(Color.yellow);

        }
        if (evento.getSource() == Ar) {
            Text1.setText("");
            Text1.setText("Argon ");
            Text2.setText("");
            Text2.setText("18");
            Text3.setText("");
            Text3.setText("39.948");
            area.setText("\n     Ar");
            area.setBackground(Color.yellow);

        }
        if (evento.getSource() == Kr) {
            Text1.setText("");
            Text1.setText(" Cripton");
            Text2.setText("");
            Text2.setText("36");
            Text3.setText("");
            Text3.setText("83.80 ");
            area.setText("\n     Kr");
            area.setBackground(Color.yellow);

        }
        if (evento.getSource() == Xe) {
            Text1.setText("");
            Text1.setText("Xenon");
            Text2.setText("");
            Text2.setText("54");
            Text3.setText("");
            Text3.setText("131.29 ");
            area.setText("\n     Xe");
            area.setBackground(Color.yellow);

        }
        if (evento.getSource() == Rn) {
            Text1.setText("");
            Text1.setText("Radon ");
            Text2.setText("");
            Text2.setText("86");
            Text3.setText("");
            Text3.setText("222.02");
            area.setText("\n     Rn");
            area.setBackground(Color.yellow);

        }
        if (evento.getSource() == Uuo) {
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
        if (evento.getSource() == La) {
            Text1.setText("");
            Text1.setText("Lantano");
            Text2.setText("");
            Text2.setText("57");
            Text3.setText("");
            Text3.setText("138.9055");
            area.setText("\n     La");
            area.setBackground(Color.lightGray);
        }

        if (evento.getSource() == Ce) {
            Text1.setText("");
            Text1.setText(" Cerio");
            Text2.setText("");
            Text2.setText("58");
            Text3.setText("");
            Text3.setText("140.115");
            area.setText("\n     Ce");
            area.setBackground(Color.lightGray);

        }
        if (evento.getSource() == Pr) {
            Text1.setText("");
            Text1.setText("Praseodimo");
            Text2.setText("");
            Text2.setText("59");
            Text3.setText("");
            Text3.setText("140.9076");
            area.setText("\n     Pr");
            area.setBackground(Color.lightGray);

        }
        if (evento.getSource() == Nd) {
            Text1.setText("");
            Text1.setText("Neodimio");
            Text2.setText("");
            Text2.setText("60");
            Text3.setText("");
            Text3.setText("144.24 ");
            area.setText("\n     Nd");
            area.setBackground(Color.lightGray);

        }
        if (evento.getSource() == Pm) {
            Text1.setText("");
            Text1.setText("Prometio ");
            Text2.setText("");
            Text2.setText("61");
            Text3.setText("");
            Text3.setText(" 24.3050");
            area.setText("\n     Pm");
            area.setBackground(Color.lightGray);

        }
        if (evento.getSource() == Sm) {
            Text1.setText("");
            Text1.setText("Samario ");
            Text2.setText("");
            Text2.setText("62");
            Text3.setText("");
            Text3.setText("150.36");
            area.setText("\n     Sm");
            area.setBackground(Color.lightGray);

        }
        if (evento.getSource() == Eu) {
            Text1.setText("");
            Text1.setText("Europio ");
            Text2.setText("");
            Text2.setText("63");
            Text3.setText("");
            Text3.setText("151.965");
            area.setText("\n     Eu");
            area.setBackground(Color.lightGray);
        }

        if (evento.getSource() == Gd) {
            Text1.setText("");
            Text1.setText("Gadolinio");
            Text2.setText("");
            Text2.setText("64");
            Text3.setText("");
            Text3.setText("157025");
            area.setText("\n     Gd");
            area.setBackground(Color.lightGray);

        }
        if (evento.getSource() == Tb) {
            Text1.setText("");
            Text1.setText("Terbio");
            Text2.setText("");
            Text2.setText("65");
            Text3.setText("");
            Text3.setText("158.929 ");
            area.setText("\n     Tb ");
            area.setBackground(Color.lightGray);

        }
        if (evento.getSource() == Dy) {
            Text1.setText("");
            Text1.setText("Disprosio");
            Text2.setText("");
            Text2.setText("66");
            Text3.setText("");
            Text3.setText("162.50");
            area.setText("\n     Dy");
            area.setBackground(Color.lightGray);

        }
        if (evento.getSource() == Ho) {

            Text1.setText("");
            Text1.setText(" Holmio");
            Text2.setText("");
            Text2.setText("67");
            Text3.setText("");
            Text3.setText(" 164.9303");
            area.setText("\n     Ho");
            area.setBackground(Color.lightGray);

        }
        if (evento.getSource() == Er) {
            Text1.setText("");
            Text1.setText(" Erbio");
            Text2.setText("");
            Text2.setText("68");
            Text3.setText("");
            Text3.setText("167.26");
            area.setText("\n     Er");
            area.setBackground(Color.lightGray);

        }
        if (evento.getSource() == Tm) {
            Text1.setText("");
            Text1.setText(" Tulio ");
            Text2.setText("");
            Text2.setText("69");
            Text3.setText("");
            Text3.setText("168.9342 ");
            area.setText("\n     Tm");
            area.setBackground(Color.lightGray);

        }
        if (evento.getSource() == Yb) {
            Text1.setText("");
            Text1.setText("Iterbio ");
            Text2.setText("");
            Text2.setText("70");
            Text3.setText("");
            Text3.setText(" 173.04 ");
            area.setText("\n     Yb");
            area.setBackground(Color.lightGray);

        }
        if (evento.getSource() == Lu) {
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
        if (evento.getSource() == Ac) {
            Text1.setText("");
            Text1.setText("Actino");
            Text2.setText("");
            Text2.setText("89");
            Text3.setText("");
            Text3.setText("227");
            area.setText("\n     Li");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Th) {
            Text1.setText("");
            Text1.setText("Torio ");
            Text2.setText("");
            Text2.setText("90");
            Text3.setText("");
            Text3.setText("232.0381 ");
            area.setText("\n     Th");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Pa) {
            Text1.setText("");
            Text1.setText("Protactino ");
            Text2.setText("");
            Text2.setText("91");
            Text3.setText("");
            Text3.setText("231.0388");
            area.setText("\n     Pa");
            area.setBackground(Color.CYAN);

        }

        if (evento.getSource() == U) {
            Text1.setText("");
            Text1.setText("Uranio");
            Text2.setText("");
            Text2.setText("92");
            Text3.setText("");
            Text3.setText("238.0289 ");
            area.setText("\n     U");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Np) {
            Text1.setText("");
            Text1.setText("Neptunio ");
            Text2.setText("");
            Text2.setText("93");
            Text3.setText("");
            Text3.setText("237.0482 ");
            area.setText("\n     Np");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Pu) {
            Text1.setText("");
            Text1.setText("Plutonio");
            Text2.setText("");
            Text2.setText("94");
            Text3.setText("");
            Text3.setText("244.664");
            area.setText("\n     Pu");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Am) {
            Text1.setText("");
            Text1.setText("Amaricio ");
            Text2.setText("");
            Text2.setText("95");
            Text3.setText("");
            Text3.setText("243.061");
            area.setText("\n     Am");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Cm) {
            Text1.setText("");
            Text1.setText("Curio");
            Text2.setText("");
            Text2.setText("96");
            Text3.setText("");
            Text3.setText("247.07");
            area.setText("\n     Cm");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Bk) {
            Text1.setText("");
            Text1.setText("Berkelio ");
            Text2.setText("");
            Text2.setText("97");
            Text3.setText("");
            Text3.setText("247.07 ");
            area.setText("\n     Bk");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Cf) {
            Text1.setText("");
            Text1.setText("Californio");
            Text2.setText("");
            Text2.setText("98");
            Text3.setText("");
            Text3.setText("251.08 ");
            area.setText("\n     Cf");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Es) {
            Text1.setText("");
            Text1.setText(" Einsteno ");
            Text2.setText("");
            Text2.setText("99");
            Text3.setText("");
            Text3.setText("252.08");
            area.setText("\n     Es");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Fm) {
            Text1.setText("");
            Text1.setText(" Fermio");
            Text2.setText("");
            Text2.setText("100");
            Text3.setText("");
            Text3.setText("257.100 ");
            area.setText("\n     Fm");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == Md) {
            Text1.setText("");
            Text1.setText("Mendelevio");
            Text2.setText("");
            Text2.setText("101");
            Text3.setText("");
            Text3.setText("258.10 ");
            area.setText("\n     Md");
            area.setBackground(Color.CYAN);

        }
        if (evento.getSource() == No) {
            Text1.setText("");
            Text1.setText("Nobelio");
            Text2.setText("");
            Text2.setText("102");
            Text3.setText("");
            Text3.setText("259.10");
            area.setText("\n     No");
            area.setBackground(Color.CYAN);

        }

        if (evento.getSource() == Lr) {
            Text1.setText("");
            Text1.setText("Laurencio");
            Text2.setText("");
            Text2.setText("103");
            Text3.setText("");
            Text3.setText("262.11 ");
            area.setText("\n     Lr");
            area.setBackground(Color.CYAN);

        }

        if (evento.getSource() == busqueda) {
            System.exit(0);

        }
    }

    public static void main(String[] args) {

        MenuTabla ventana = new MenuTabla();

        ventana.setBounds(20, 20, 925, 660);
        ventana.setVisible(true);
        ventana.setResizable(false);

    }
}
