import javax.swing.*;
import java.awt.*;

class MyJRadio extends JFrame
{
	MyJRadio()
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
		
		JLabel year=new JLabel("Select Your Year");
		year.setBounds(100,210,200,50);
		
		JRadioButton j1=new JRadioButton("FY");
		JRadioButton j2=new JRadioButton("SY");
		JRadioButton j3=new JRadioButton("TY");
		
		j1.setBounds(100,250,200,50);
		j2.setBounds(100,280,200,50);
		j3.setBounds(100,310,200,50);
		
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(j1);
		bg.add(j2);
		bg.add(j3);
		
		add(year);
		add(j1);
		add(j2);
		add(j3);
		
		setLayout(null);
		setBackground(Color.red);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new MyJRadio();
	}
}
		
		
		