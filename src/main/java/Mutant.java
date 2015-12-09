import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.imageio.*;
import javax.swing.*;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import helpers.DiceRoller;
import tabeller.Tabeller;

import java.util.*;
import java.awt.ScrollPane;
import java.awt.FlowLayout;


public class Mutant {

    private static final boolean b = false;
    private JFrame frmMutantSpelgenerator;
    private static final String GENLABALFA = "Genlab alfa", ARNALL = "Mutant år noll", MASKIN = "Maskinarium", HOTIZONEN = "Hot i Zonen", SLP = "SLP", HOTMOTARK = "Hot mot Arken", ZON = "Zongenerator", KROSSARE = "Krossare", SKROTSKALLE = "Skrotskalle", KRONIKOR = "Krönikör", SLAV = "Slav", BOSS = "Boss", MUTANTMEDHUND = "Mutant med hund", ZONSTRYKARE = "Zonstrykare", FIXARE = "Fixare";

    final JComboBox Box;
    final JComboBox Box2;
    final JComboBox Box3;
    final JComboBox Box3g;

    private String valdtyp = "";

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Mutant window = new Mutant();
                    window.frmMutantSpelgenerator.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Mutant() {

    }

    /**
     * Initialize the contents of the frame.
     * @param label
     */

    {


        frmMutantSpelgenerator = new JFrame();


        frmMutantSpelgenerator.setTitle("Mutant Spelgenerator");
        frmMutantSpelgenerator.setForeground(Color.WHITE);
        frmMutantSpelgenerator.setBackground(Color.BLACK);
        frmMutantSpelgenerator.setBounds(600, 1000, 600, 1000);
        frmMutantSpelgenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMutantSpelgenerator.getContentPane().setLayout(null);
    }

    {
        Box = new JComboBox();
        Box.setModel(new DefaultComboBoxModel(new String[]{ARNALL, GENLABALFA, MASKIN}));
        Box.setBounds(218, 246, 173, 33);
        frmMutantSpelgenerator.getContentPane().add(Box);


        Box2 = new JComboBox();
        Box2.setModel(new DefaultComboBoxModel(new String[]{SLP, ZON, HOTMOTARK, HOTIZONEN}));
        Box2.setBounds(218, 278, 173, 33);
        frmMutantSpelgenerator.getContentPane().add(Box2);

        Box3 = new JComboBox();
        Box3.setModel(new DefaultComboBoxModel(new String[]{"", KROSSARE, SKROTSKALLE, ZONSTRYKARE, FIXARE, MUTANTMEDHUND, KRONIKOR, BOSS, SLAV}));
        Box3.setBounds(218, 309, 173, 33);
        frmMutantSpelgenerator.getContentPane().add(Box3);

        ActionListener box3Listener = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                HandleRollspelsVal();
            }

        };

        ActionListener zonListener = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                SlumpTyp();
            }

        };


        Box.addActionListener(box3Listener);
        Box2.addActionListener(zonListener);


        Box3g = new JComboBox();
        Box3g.setModel(new DefaultComboBoxModel(new String[]{"", "Samlare", "Helare", "Jägare", "Nåjd", "Krigare"}));
        Box3g.setBounds(218, 309, 173, 33);
        frmMutantSpelgenerator.getContentPane().add(Box3g);

        //zoner  = Tabeller.getZon(DiceRoller.Roll(2));
        //String ruinstandard  = Tabeller.getRuinstandard(DiceRoller.Roll(2));
        //String ruinindustri  = Tabeller.getRuinindustri(DiceRoller.Roll(2));
        //String rotniva  = Tabeller.getRotniva(DiceRoller.Roll(1));

    }

    {
        JButton knapp = new JButton("Kör");
        knapp.setForeground(Color.BLACK);
        knapp.setBackground(Color.LIGHT_GRAY);
        knapp.setBounds(238, 350, 117, 29);
        frmMutantSpelgenerator.getContentPane().add(knapp);
        knapp.addActionListener(new Action() {
            public Object getValue(String key) {
                return null;
            }

            public void putValue(String key, Object value) {

            }

            public void setEnabled(boolean b) {

            }

            public boolean isEnabled() {
                return false;
            }

            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            public void actionPerformed(ActionEvent e) {
                if (ZON.equals(valdtyp)) {
                    //string zon = Tabeller.getZon(DiceRoller.Roll(2));
                }
                {


                }


            }
        });

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/mutantlogo.png")));
        lblNewLabel_1.setBounds(41, -27, 590, 307);
        frmMutantSpelgenerator.getContentPane().add(lblNewLabel_1);


        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/back.png")));
        lblNewLabel.setLabelFor(lblNewLabel);
        lblNewLabel.setBounds(-478, -167, 1900, 1224);
        frmMutantSpelgenerator.getContentPane().add(lblNewLabel);

        JEditorPane editorPane = new JEditorPane();
        editorPane.setForeground(Color.WHITE);
        editorPane.setBounds(40, 391, 523, 558);
        frmMutantSpelgenerator.getContentPane().add(editorPane);


    }

    private void HandleRollspelsVal() {
        String s = Box.getSelectedItem().toString();
        if (s.equals(GENLABALFA)) {
            Box3.setVisible(false);

        } else if (s.equals(ARNALL)) {
            Box3.setVisible(true);

        }
    }


    private void SlumpTyp() {
        String m = Box.getSelectedItem().toString();

        if (m.equals(MASKIN)) {
            Box2.setEnabled(false);
            Box3.setEnabled(false);
            Box3g.setEnabled(false);
            this.valdtyp = MASKIN;

        }

        String z = Box2.getSelectedItem().toString();
        if (z.equals(ZON)) {

            String s = Box2.getSelectedItem().toString();
            if (s.equals(SLP)) {
                Box3.setEnabled(true);
                Box3g.setEnabled(true);
                this.valdtyp = SLP;

            } else if (s.equals(ZON)) {
                Box3.setEnabled(false);
                Box3g.setEnabled(false);
                this.valdtyp = ZON;

            } else if (s.equals(HOTIZONEN)) {
                Box3.setEnabled(false);
                Box3g.setEnabled(false);
                this.valdtyp = HOTIZONEN;

            } else if (s.equals(HOTMOTARK)) {
                Box3.setEnabled(false);
                Box3g.setEnabled(false);
                this.valdtyp = HOTMOTARK;
            }


        }

    }

}






