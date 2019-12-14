package house_management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Container;

public class Info extends JFrame {

    private Container con, con1;
    JLabel l, ll, l1, l2, l3, l4, l1a, l2b, l3c, l4d;
    String Road_NO, House_NO, Phone_NO, Location;
    JButton b1, b2, b3;
    private Cursor cu;

    Info(String c2) {

        con = this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.white);

        try {
            conn c4 = new conn();

            String s1 = "select * from home.add";
            ResultSet rs = c4.s.executeQuery(s1);

            while (rs.next()) {
                Road_NO = rs.getString("r");
                House_NO = rs.getString("h");
                Phone_NO = rs.getString("p");
                Location = rs.getString("l");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        ll = new JLabel("House Details");
        ll.setBounds(150, 20, 200, 25);
        ll.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 25));
        con.add(ll);

        l1 = new JLabel("Road NO");
        l1.setBounds(50, 70, 150, 30);
        l1.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 15));
        con.add(l1);

        l1a = new JLabel(Road_NO);
        l1a.setBounds(180, 70, 50, 30);
        l1a.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 15));
        con.add(l1a);

        l2 = new JLabel("HOUSE NO");
        l2.setBounds(50, 120, 150, 30);
        l2.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 15));
        con.add(l2);

        l2b = new JLabel(House_NO);
        l2b.setBounds(180, 120, 150, 30);
        l2b.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 15));
        con.add(l2b);

        l3 = new JLabel("Phone NO");
        l3.setBounds(50, 180, 150, 30);
        l3.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 15));
        con.add(l3);

        l3c = new JLabel(Phone_NO);
        l3c.setBounds(180, 180, 150, 30);
        l3c.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 15));
        con.add(l3c);

        l4 = new JLabel("Location");
        l4.setBounds(50, 220, 150, 30);
        l4.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 15));
        con.add(l4);

        l4d = new JLabel(Location);
        l4d.setBounds(180, 220, 150, 30);
        l4d.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 15));
        con.add(l4d);

        b3 = new JButton("HOME");
        //b2.setIcon(icon1);
        b3.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 25));
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBounds(50, 280, 120, 34);
        con.add(b3);
        b3.setCursor(cu);

        b2 = new JButton("Back");
        //b2.setIcon(icon1);
        b2.setFont(new Font("serif", Font.PLAIN + Font.BOLD, 25));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(180, 280, 120, 34);
        con.add(b2);
        b2.setCursor(cu);

        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == b2) {
                    dispose();
                    User1 u1 = new User1();
                    u1.setVisible(true);
                    //u1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    u1.setBounds(300, 100, 500, 400);
                }
            }

        });

        b3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == b3) {
                    dispose();
                    Home h = new Home();
                    h.setVisible(true);
                    //h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    h.setBounds(300, 100, 780, 550);
                }
            }

        });

    }

    public static void main(String[] args) {
        Info i = new Info("Print Data");
        i.setVisible(true);
        i.setBounds(300, 100, 500, 400);
        i.setLayout(null);
    }

}
