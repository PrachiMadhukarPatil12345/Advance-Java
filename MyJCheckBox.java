import javax.swing.*;
import java.awt.*;

class MyJCheckBox extends JFrame
{
	MyJCheckBox()
	{
		JPanel jp=new JPanel();
		jp.setBounds(20,20,490,490);
		
		JCheckBox c1=new JCheckBox("Mumbai");
		c1.setBounds(100,100,180,150);
		
		JCheckBox c2=new JCheckBox("Solapur");
		c2.setBounds(100,180,180,150);
		
		JCheckBox c3=new JCheckBox("Pune");
		c3.setBounds(100,250,180,150);
		
		JCheckBox c4=new JCheckBox("Banglore");
		c4.setBounds(100,300,180,150);
		
		add(jp);
		jp.add(c1);
		jp.add(c2);
		jp.add(c3);
		jp.add(c4);
		
		setLayout(new FlowLayout());
		setSize(500,500);
		setBackground(Color.red);
		setVisible(true);
	}
	public static void main(String args[])
{
	new MyJCheckBox();
}
}