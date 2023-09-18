import java.awt.*; 
import java.swing.*;
import java.awt.event.*;
public class PasswordAuthentication extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField tf1;
	JPasswordField jp;
	JButton b;
	PasswordAuthentication()
	{
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setContentPane(new JLabel(new ImageIcon("sky.jpg")));
		l1=new JLabel("Enter UserName");
		l1.setBounds(100,50,70,40);
		
		tf1=new JTextField(40);
		tf1.setBounds(190,50,120,30);
		
		l2=new JLabel ("Enter Your Password");
		l2.setBounds(100,100,70,40);
		
		jp=new JPasswordField (40);
		jp.setBounds(190,100,120,30);
		
		b1=new JButton("Sign in");
		b1.setBounds(130,250,100,40);
		
		add(l);
		add(l2);
		l3=new JLabel("    ");
		l3.setBounds(150,300,400,40);
		
		add(tf);
		add(jp);
		add(b1);
		add(l3);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ar)
	{
		if (ar.getSource() == b)
		{
			String userText;
            String pwdText;
            userText = tf1.getText();
            pwdText = jp.getText();
            if (userText.equalsIgnoreCase("Tasgaon") && pwdText.equalsIgnoreCase("12345"))
			{
                JOptionPane.showMessageDialog(this, "Login Successful");
            }
			else
			{
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
		}
		/*String un=tf1.getText();
		String psw=jp.getText();
		if(un.equals("Prutha")&& psw.equals("12345"));
		{
			l3.setText("Login Successfuly");
			}
			else
			{
				l3.setText("Enter Correct username & password & try Again!!!!");
				}*/
		public static void main(String args[])
		{
			PasswordAuthentication p=new PasswordAuthentication();
			setVisible(true);
		    setTitle("Password length Restriction");
		    //p.setBackgrounjavac PasswordAuthentication.javad(color.yellow);
		    setSize(500,500);
		}
	}
}
