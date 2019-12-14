package house_management;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Container;
//import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

public class Panel extends JFrame {

    private ImageIcon icon;
    private Container con;
    private JLabel l1, l2;
    private JButton b, b2;
    private Font f;
    private Cursor cu;

    Panel() {

        code();

    }

    public void code() {

        icon = new ImageIcon(getClass().getResource("b.png"));
        //Image z = icon.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        this.setIconImage(icon.getImage());
        con = this.getContentPane();
        con.setBackground(Color.black);
        l1 = new JLabel(icon);
        l1.setBounds(10, 50, 500, 450);
        con.add(l1);

        l2 = new JLabel("Choose Your Option");
        l2.setBounds(70, 30, 400, 45);
        l2.setFont(new Font("serif", Font.PLAIN, 40));
        l2.setForeground(Color.red);

        l1.add(l2);

        cu = new Cursor(Cursor.HAND_CURSOR);

        b = new JButton("OWNER");
        b.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 16));
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setBounds(180, 400, 100, 50);
        l1.add(b);
        b.setCursor(cu);

        b2 = new JButton("USER");
        b2.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 17));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(180, 460, 100, 50);
        l1.add(b2);
        b2.setCursor(cu);

        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == b) {
                    dispose();
                    Owner o = new Owner();
                    o.setVisible(true);
                    o.setBounds(300, 100, 780, 550);
                }
            }

        });

        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == b2) {
                    dispose();
                    User u = new User();
                    u.setVisible(true);
                    //u.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    u.setBounds(300, 100, 780, 550);
                }
            }

        });

    }

    public static void main(String[] args) {
        Panel p = new Panel();
        p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        p.setBounds(300, 100, 500, 560);
        p.setTitle("Panel");

    }

}
