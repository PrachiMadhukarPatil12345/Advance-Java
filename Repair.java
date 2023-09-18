import javax.swing.*;
import java.awt.*;

class Repair extends JFrame
{
	Repair()
	{
		JLabel address=new JLabel("Select Your Address");
		address.setBounds(100,50,200,50);
		
		JRadioButton b1=new JRadioButton("Sangli");
		JRadioButton b2=new JRadioButton("Pune");
		JRadioButton b3=new JRadioButton("Vrindavan");
		
		b1.setBounds(100,100,200,50);
		b2.setBounds(100,150,200,50);
		b3.setBounds(100,200,200,50);
		
		ButtonGroup g=new ButtonGroup();
		
		g.add(b1);
		g.add(b2);
		g.add(b3);
		
		add(address);
		add(b1);
		add(b2);
		add(b3);
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new Repair();
	}
}
		
		