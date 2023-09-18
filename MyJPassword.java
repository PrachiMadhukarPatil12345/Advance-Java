import javax.swing.*;
import java.awt.*;
class MyJPassword extends JFrame
{
	MyJPassword()
	{
		JPasswordField psw=new JPasswordField("Welcome");
		JLabel l1=new JLabel("Enter Your Name");
		psw.setBounds(100,100,150,30);
		l1.setBounds(80,80,150,30);
		psw.setEchoChar('*');
		add(psw);
		add(l1);
		
		setLayout(null);
		setSize(500,500);
		setBackground(Color.red);
		setVisible(true);
	}
	public static void main(String args[])
{
	new MyJPassword ();
}
}