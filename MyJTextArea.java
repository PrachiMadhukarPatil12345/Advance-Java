import javax.swing.*;
import java.awt.*;
class MyJTextArea extends JFrame
{z
	MyJTextArea()
	{
	    JTextArea ta=new JTextArea("Enter Your Feedback Here",20,20);
		JLabel l1=new JLabel("Enter Your Name");
		ta.setBounds(100,100,150,30);
		ta.setLineWrap(true);
		l1.setBounds(80,80,150,30);
		ta.setFont(new Font("Courier",Font.BOLD,30));
		add(ta);
		add(l1);
		
		setLayout(null);
		setSize(500,500);
		setBackground(Color.red);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
{
	new MyJTextArea();
}
}