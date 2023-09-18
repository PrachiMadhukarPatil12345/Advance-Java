import java.awt.*; 
import java.swing.*;
import java.awt.event.*;
public class Prr12 extends JFrame implements ActionListener
{
	JLabel l,l1;
	JPasswordField tf;
	//JTextField tf;
	JButton b,b1;
	Font f;
	Prr12()
	{
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setContentPane(new JLabel(new ImageIcon("college.jpg")));
		
		f=new Font("Times New Romam",Font.BOLD,18);
		l=new JLabel("Plz Enter Password Here");
		l.setBounds(20,70,150,30);
		l.setForeground(Color.green);
		l.setFont(f);
		
		tf=new JPasswordField();
		tf.setFont(f);
		tf.setBounds(180,70,200,30);
		
		b=new JButton("Submit");
		b.setBounds(150,150,80,30);
		b.setForeground(Color.pink);
		
		b1=new JButton("Clear");
		b1.setBounds(250,150,80,30);
		b1.setForeground(Color.red);
		
		l1=new JLabel("   ");
		l1.setBounds(100,200,400,30);
		l.setForeground(Color.blue);
		l.setFont(f);
		
		add(l);
		add(tf);
		add(b);
		add(b1);
		add(l1);
		
		b.addActionListener(this);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent a)
	{
		String str=tf.getText();
		int len=str.length();
		if(a.getSource()==b)
		{
			if(len<=6)
			{
				l1.setText("Password Must be Greater than 6 Character");
			}
			else
			{
				l1.setText("Login Successfuly");
			}
		}
		else if(a.getSource()==b1)
		{
			tf.setText("  ");
			l1.setText("  ");
		}
	}
	public static void main(String args[])
	{
		Prr12 p=new Prr12();
		p.setVisible(true);
		p.setTitle("Password length Restriction");
		//p.setBackground(color.yellow);
		p.setSize(500,500);
		
		
	}
}

		
		