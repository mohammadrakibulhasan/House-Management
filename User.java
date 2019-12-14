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

public class User extends JFrame {

    private ImageIcon icon, icon1;
    private Container con, con1;
    private JLabel l1, l2, l3;
    private JButton b, b2,b3;
    private Font f;
    private Cursor cu;

    User() {

        code();

    }

    public void code() {

        icon = new ImageIcon(getClass().getResource("l.jpg"));
        icon1 = new ImageIcon(getClass().getResource("r.jpg"));

        //z=icon.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        this.setIconImage(icon.getImage());
        con = this.getContentPane();
        con.setBackground(Color.black);
        l1 = new JLabel();
        l1.setBounds(10, 50, 500, 450);
        con.add(l1);

        l2 = new JLabel("ENTER YOUR CHOICE");
        l2.setBounds(200, 100, 850, 30);
        l2.setFont(new Font("serif", Font.PLAIN, 35));
        l2.setForeground(Color.red);
        con.add(l2);

        this.setIconImage(icon1.getImage());
        con1 = this.getContentPane();
        con1.setBackground(Color.black);
        l3 = new JLabel();
        l3.setBounds(10, 500, 500, 450);
        con1.add(l3);

        cu = new Cursor(Cursor.HAND_CURSOR);

        b = new JButton("");
        b.setIcon(icon);
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setBounds(200, 130, 320, 90);
        l1.add(b);
        b.setCursor(cu);

        b2 = new JButton("");
        b2.setIcon(icon1);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(200, 230, 320, 90);
        l1.add(b2);
        b2.setCursor(cu);
        
        
         b3 = new JButton("Back");
        //b2.setIcon(icon1);
        b3.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 25));
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBounds(300, 350, 100, 34);
        l1.add(b3);
        b3.setCursor(cu);

        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == b) {
                    dispose();
                    Login1 l1 = new Login1();
                    l1.setVisible(true);
                    l1.setBounds(300, 100, 500, 400);
                }
            }

        });

        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == b2) {
                    dispose();
                    Register r = new Register();
                    r.setVisible(true);
                    //r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    r.setBounds(300, 100, 500, 400);
                }
            }

        });
        
        
          b3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == b3) {
                    dispose();
                    Panel p = new Panel();
                    p.setVisible(true);
                    //p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    p.setBounds(300, 100, 500, 560);
                }
            }

        });

    }

    public static void main(String[] args) {
        User u = new User();
        u.setVisible(true);
        u.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        u.setBounds(300, 100, 780, 550);
        u.setTitle("User Page");

    }

}
