package andr7st;

import javax.swing.*;
import java.awt.Color;

public class Ventana extends JFrame { private static final long serialVersionUID = -7690971604303136153L;

    JTextField campo1;
    JTextField campo2;
    JTextField campo3;
    JTextField campo4;

    public Color color1 = new Color(124,45,82);

    public Ventana() {

        JLabel label = new JLabel("Ejercicio: Leer archivo.JSON");
        label.setBounds(20, 380, 200, 28);
        label.setForeground(new Color(255,255,255));

        this.setTitle("Andr7st | Ejercicio");
        this.setSize(560,480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(color1);
        this.setLayout(null);
        this.add(new CargaJSON());
        this.add(label);
        this.setVisible(true);
    }

    public class CargaJSON extends JPanel {

        private static final long serialVersionUID = 1L;

        public CargaJSON() {

            LeerJSON miJSON = new LeerJSON();

            int campoAnchura = 200;

            campo1 = new JTextField();
            campo1.setBounds(80, 40, campoAnchura, 24);

            campo2 = new JTextField();
            campo2.setBounds(80, 74, campoAnchura, 24);
            
            campo3 = new JTextField();
            campo3.setBounds(80, 108, campoAnchura, 24);
            
            campo4 = new JTextField();
            campo4.setBounds(80, 142, campoAnchura, 24);

            campo1.setText(miJSON.getTextoCampo1());
            campo2.setText(miJSON.getTextoCampo2());
            campo3.setText(miJSON.getTextoCampo3());
            campo4.setText(miJSON.getTextoCampo4());

            this.setBounds(60, 42, 420, 200);
            this.setBackground(color1);
            this.setLayout(null);

            this.add(campo1);
            this.add(campo2);
            this.add(campo3);
            this.add(campo4);

        }
    }
}