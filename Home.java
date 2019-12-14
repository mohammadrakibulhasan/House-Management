
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
public class Home extends JFrame
{
    private ImageIcon icon;
    private Container con;
    private JLabel l1,l2;
    private JButton b;
    private Font f;
    private Cursor cu;
    
    Home()
    {
         
      code();
        
    }
    public void code()
    {
        
        icon=new ImageIcon(getClass().getResource("z.jpg"));
        //z=icon.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        this.setIconImage(icon.getImage());
        con=this.getContentPane();
        //con.setLayout(null);
        con.setBackground(Color.black);
        l1=new JLabel(icon);
        l1.setBounds(10, 50,500, 450);
        con.add(l1);
        
        
        l2=new JLabel("WELCOME TO OUR HOME-MANAGEMET");
        l2.setBounds(45, 30, 750, 30);
        l2.setFont(new Font("serif",Font.PLAIN,35));
        l2.setForeground(Color.red);
        
        l1.add(l2);
        
        cu=new Cursor(Cursor.HAND_CURSOR);
        
        b=new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setBounds(240, 430, 250, 50);
        l1.add(b);
        b.setCursor(cu);
       
     
       
       
        b.addActionListener(new ActionListener(){
        
        
        public void actionPerformed(ActionEvent ae)
        {
            
        if(ae.getSource()==b)
        {
            dispose();
            Panel p=new Panel();
            p.setVisible(true);
           p.setBounds(300, 100,500, 560);
        }
        }
        
        });
        
        
      /*  
           while(true)
        {
            l2.setVisible(true);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            l2.setVisible(false);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
           */
    }
    
    public static void main(String[] args) {
        Home h=new Home();
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        h.setBounds(300, 100,780, 550);
        h.setTitle("Homepage");
       
    }

  
}