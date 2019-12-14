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

public class Owner1 extends JFrame {

    private ImageIcon icon, icon1;
    private Container con, con1;
    private JLabel l1, l2, l3;
    private JButton b, b2, b3, b4;
    private Font f;
    private Cursor cu;

    Owner1() {

        code();

    }

    public void code() {

        //icon=new ImageIcon(getClass().getResource("l.jpg"));
        //icon1=new ImageIcon(getClass().getResource("r.jpg"));
        //z=icon.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        //this.setIconImage(icon.getImage());
        con = this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.black);
        //l1 = new JLabel();
        //l1.setBounds(10, 50, 500, 450);
        //con.add(l1);

        cu = new Cursor(Cursor.HAND_CURSOR);

        b = new JButton("ADD");
        //b.setIcon(icon);
        b.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 20));
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setBounds(130, 20, 100, 50);
        con.add(b);
        b.setCursor(cu);

        b2 = new JButton("UPDATE");
        //b2.setIcon(icon1);
        b2.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 15));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(130, 80, 100, 50);
        con.add(b2);
        b2.setCursor(cu);

        b3 = new JButton("DELETE");
        b3.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 15));
        //b3.setIcon(icon1);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBounds(130, 140, 100, 50);
        con.add(b3);
        b3.setCursor(cu);

        b4 = new JButton("Back");
        //b2.setIcon(icon1);
        b4.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 25));
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.setBounds(130, 200, 100, 34);
        con.add(b4);
        b4.setCursor(cu);

        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == b) {
                    dispose();
                    Add a = new Add();
                    a.setVisible(true);
                    //a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    a.setBounds(300, 100, 500, 400);
                }
            }

        });

        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == b2) {
                    dispose();
                    Update u = new Update();
                    u.setVisible(true);
                    //u.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    u.setBounds(300, 100, 500, 400);
                }
            }

        });
        b3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == b3) {
                    dispose();
                    Delete d = new Delete();
                    d.setVisible(true);
                    //d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    d.setBounds(300, 100, 500, 400);
                }
            }

        });

        b4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == b4) {
                    dispose();
                    Owner o = new Owner();
                    o.setVisible(true);
                    //o.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    o.setBounds(300, 100, 780, 550);
                }
            }

        });

    }

    public static void main(String[] args) {
        Owner1 o1 = new Owner1();
        o1.setVisible(true);
        o1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        o1.setBounds(300, 100, 400, 320);
        o1.setTitle("Owner Page No-1");

    }

}
