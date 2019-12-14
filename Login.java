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
import java.sql.*;

public class Login extends JFrame {

    private ImageIcon icon, icon1;
    private Container con, con1;
    private JLabel l1, l2, l3;
    private JButton b,b3;
    private Font f;
    private Cursor cu;
    private JTextField tf1, tf2;
    private JPasswordField pf1;

    Login() {

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
        l2.setBounds(50, 100, 250, 30);
        l2.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 10));
        l2.setForeground(Color.red);
        con.add(l2);

        tf1 = new JTextField();
        tf1.setForeground(Color.black);
        tf1.setBackground(Color.yellow);
        tf1.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 16));
        tf1.setBounds(180, 90, 200, 50);
        con.add(tf1);

        l3 = new JLabel("ENTER TOUR PASSWORD:");
        l3.setBounds(50, 180, 250, 30);
        l3.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 10));
        l3.setForeground(Color.red);
        con.add(l3);

        pf1 = new JPasswordField();
        pf1.setForeground(Color.black);
        pf1.setBackground(Color.yellow);
        pf1.setEchoChar('*');
        pf1.setBounds(180, 170, 200, 50);
        con.add(pf1);

        cu = new Cursor(Cursor.HAND_CURSOR);

        b = new JButton("LOGIN");
        b.setIcon(icon);
        b.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 10));
        b.setBackground(Color.WHITE);
        b.setForeground(Color.black);
        b.setBounds(180, 230, 70, 50);
        con.add(b);
        b.setCursor(cu);
        
        
        
         b3 = new JButton("Back");
        //b2.setIcon(icon1);
        b3.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 25));
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBounds(270, 230, 100, 34);
        con.add(b3);
        b3.setCursor(cu);

        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                try {
                    conn c1 = new conn();
                    String u = tf1.getText();
                    String p = pf1.getText();
                    String q = "select * from login where u = '" + u + "' and p = '" + p + "'";
                    ResultSet rs = c1.s.executeQuery(q);

                    if (ae.getSource() == b) {
                        if (rs.next()) {
                            dispose();
                            Owner1 o1 = new Owner1();
                            o1.setVisible(true);
                            //o1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            o1.setBounds(300, 100, 400, 320);

                        } else {
                            JOptionPane.showMessageDialog(null, "Incorrect Username or Password","ERROR",2);

                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("error: " + e);
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
        Login l = new Login();
        l.setVisible(true);
        l.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        l.setBounds(300, 100, 500, 400);
        l.setTitle("Login Page");

    }

}
