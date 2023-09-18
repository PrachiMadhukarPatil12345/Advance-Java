import javax.swing.*;
import java.awt.*;
public class JPasswordChange
{
	public static void main(String[] args)
	{
		JFrame f=new JFrame();
		f.setLocationRelativeTo(null);
		f.setContentPane(new JLabel(new ImageIcon("5.jpeg")));
		
		JLabel l=new JLabel("HERE PASSWORD WILL BE DISPLAYED AS '#' INSTEAD OF '*'");
		l.setBounds(50,50,500,30);
		l.setFont(new java.awt.Font("Arial",Font.BOLD,24));
		JLabel l1=new JLabel("ENTER PASSWORD");
		l1.setBounds(50,150,150,50);
        JPasswordField pf=new JPasswordField(20);
		pf.setBounds(200,150,100,50);
        pf.setEchoChar('#');
		
		f.add(l);
        f.add(l1);
        f.add(pf);
		
		//f.setBackground(Color.green);
		//f.setLayout(null);
		//f.setBackground(color.blue);
		f.setVisible(true);
		f.setSize(600,600);
    }
 
}
