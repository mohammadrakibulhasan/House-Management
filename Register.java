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

public class Register extends JFrame {

    private ImageIcon icon, icon1;
    private Container con, con1;
    private JLabel l1, l2, l3, l4, l5;
    private JButton b, b3;
    private Font f;
    private Cursor cu;
    private JTextField tf1, tf2, tf3;
    private JPasswordField pf1, pf2;

    Register() {

        code();

    }

    public void code() {

        //icon = new ImageIcon(getClass().getResource("l2.jpg"));
        //this.setIconImage(icon.getImage());
        con = this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.black);
        //l1 = new JLabel();
        //l1.setBounds(10, 50,icon.getIconWidth(), icon.getIconHeight());
        //con.add(l1);

        l2 = new JLabel("ENTER YOUR USERNAME:");
        l2.setBounds(50, 30, 250, 50);
        l2.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 10));
        l2.setForeground(Color.red);
        con.add(l2);

        tf1 = new JTextField();
        tf1.setForeground(Color.black);
        tf1.setBackground(Color.yellow);
        tf1.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 16));
        tf1.setBounds(180, 40, 200, 30);
        con.add(tf1);

        l5 = new JLabel("ENTER YOUR PASSWORD:");
        l5.setBounds(50, 150, 250, 30);
        l5.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 10));
        l5.setForeground(Color.red);
        con.add(l5);

        pf2 = new JPasswordField();
        pf2.setForeground(Color.black);
        pf2.setBackground(Color.yellow);
        pf2.setEchoChar('*');
        pf2.setBounds(180, 150, 200, 30);
        con.add(pf2);

        l3 = new JLabel("REPEAT PASSWORD:");
        l3.setBounds(75, 200, 250, 30);
        l3.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 10));
        l3.setForeground(Color.red);
        con.add(l3);

        pf1 = new JPasswordField();
        pf1.setForeground(Color.black);
        pf1.setBackground(Color.yellow);
        pf1.setEchoChar('*');
        pf1.setBounds(180, 200, 200, 30);
        con.add(pf1);

        l4 = new JLabel("ENTER TOUR PHONE-NO:");
        l4.setBounds(50, 100, 250, 30);
        l4.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 10));
        l4.setForeground(Color.red);
        con.add(l4);

        tf3 = new JTextField();
        tf3.setForeground(Color.black);
        tf3.setBackground(Color.yellow);
        tf3.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 16));
        tf3.setBounds(180, 100, 200, 30);
        con.add(tf3);

        cu = new Cursor(Cursor.HAND_CURSOR);

        b = new JButton("SIGNUP");
        b.setIcon(icon);
        b.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 15));
        b.setBackground(Color.WHITE);
        b.setForeground(Color.black);
        b.setBounds(190, 260, 100, 50);
        con.add(b);
        b.setCursor(cu);

        b3 = new JButton("Back");
        //b2.setIcon(icon1);
        b3.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 25));
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBounds(300, 270, 100, 34);
        con.add(b3);
        b3.setCursor(cu);

        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                String u = tf1.getText();
                String ph = tf3.getText();
                String pa = pf1.getText();

                String re = pf2.getText();

                // System.out.println(u+" "+ph+" "+pa);
                try {

                    conn co = new conn();
                    String sql
                            = "INSERT INTO home.reg(u,ph,pa,re)"
                            + "VALUES ('" + u + "','" + ph + "','" + pa + "','" + re + "')";

                    //String sq1 = "insert into reg values('" + u + "','" + ph + "','" + pa + "','" + re + "')";
                    co.s.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data Stored");

                } catch (Exception ex) {
                    ex.printStackTrace();

                }
            }
        });

        b3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == b3) {
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
        Register r = new Register();
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        r.setBounds(300, 100, 500, 400);
        r.setTitle("Registration Page");

    }

}
