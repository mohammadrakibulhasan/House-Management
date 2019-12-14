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

public class Update extends JFrame {

    private ImageIcon icon, icon1;
    private Container con, con1;
    private JLabel l1, l2, l3, l4, l5, l6;
    private JButton b,b3;
    private Font f;
    private Cursor cu;
    private JTextField tf1, tf2, tf3;
    JComboBox c1;
    //private JPasswordField pf1, pf2;

    Update() {

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

        l2 = new JLabel("Road No:");
        l2.setBounds(50, 30, 250, 50);
        l2.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 25));
        l2.setForeground(Color.red);
        con.add(l2);

        tf1 = new JTextField();
        tf1.setForeground(Color.black);
        tf1.setBackground(Color.yellow);
        tf1.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 16));
        tf1.setBounds(180, 40, 200, 30);
        con.add(tf1);

        l4 = new JLabel("House No:");
        l4.setBounds(50, 100, 250, 30);
        l4.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 25));
        l4.setForeground(Color.red);
        con.add(l4);

        l5 = new JLabel("ENTER TOUR PHONE-NO:");
        l5.setBounds(50, 150, 250, 30);
        l5.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 10));
        l5.setForeground(Color.red);
        con.add(l5);

        tf2 = new JTextField();
        tf2.setForeground(Color.black);
        tf2.setBackground(Color.yellow);
        tf2.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 16));
        tf2.setBounds(180, 150, 200, 30);
        con.add(tf2);

        tf3 = new JTextField();
        tf3.setForeground(Color.black);
        tf3.setBackground(Color.yellow);
        tf3.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 16));
        tf3.setBounds(180, 100, 200, 30);
        con.add(tf3);

        l6 = new JLabel("LOCATION:");
        l6.setBounds(50, 200, 250, 30);
        l6.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 20));
        l6.setForeground(Color.red);
        con.add(l6);

        cu = new Cursor(Cursor.HAND_CURSOR);

        b = new JButton("UPDATE");
        b.setIcon(icon);
        b.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 12));
        b.setBackground(Color.WHITE);
        b.setForeground(Color.black);
        b.setBounds(170, 260, 100, 50);
        con.add(b);
        b.setCursor(cu);
        
        
         b3 = new JButton("Back");
        //b2.setIcon(icon1);
        b3.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 25));
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBounds(280, 260, 100, 34);
        con.add(b3);
        b3.setCursor(cu);

        String LOCATION[] = {"Dhanmondi", "Mirpur", "Mohammadpur", "Basundra", "Badda", "Samoly", "Puran-Dhaka", "August"};
        c1 = new JComboBox(LOCATION);
        c1.setBackground(Color.WHITE);
        c1.setBounds(180, 205, 200, 30);
        con.add(c1);
        
        
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String r = tf1.getText();
                String h = tf3.getText();
                String pp = tf2.getText();
               // System.out.println(r+" "+h+" "+p);
                String l = (String) c1.getSelectedItem();
                 //System.out.println(l);
                try {

                    conn cn = new conn();
                    String sql = "UPDATE home.add set r='"+tf1.getText()+"', h='"+tf3.getText()+"' where p= '"+pp+"'";
                    System.out.println(pp);
                   // String sq1 = "insert into add values('" + r + "','" + h + "','" + p + "','" + l + "')";
                    cn.s.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "DATA UPDATED");
                   

                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null,ex);

                }
            }
        });
        
        
        
         b3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == b3) {
                    dispose();
                    Owner1 o1 = new Owner1();
                    o1.setVisible(true);
                    //o1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    o1.setBounds(300, 100, 400, 320);
                }
            }

        });

    

    }

    public static void main(String[] args) {
        Update u = new Update();
        u.setVisible(true);
        u.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        u.setBounds(300, 100, 500, 400);
        u.setTitle("Update Page");

    }

}
