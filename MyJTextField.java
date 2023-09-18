import javax.swing.*;
import java.awt.*;

class MyJTextField extends JFrame
{
	MyJTextField()
	{
		JPanel jp=new JPanel();
		
		jp.setBounds(20,20,490,490);
		jp.setBackground(Color.orange);
		
		JTextField tf=new JTextField(10);
		tf.setBounds(100,150,200,30);
		
		JLabel l1=new JLabel("Demo of TextField");
		l1.setBounds(50,80,200,30);
		
		JLabel l2=new JLabel("Yours WelCome Dear Prachi");
		l2.setBounds(100,100,200,30);
		
		Button b1=new Button("Submit Here");
		b1.setBounds(100,500,200,50);
		
		jp.add(l2);
	    jp.add(tf);
		jp.add(l1);
		jp.add(b1);
		add(jp);
		
		setLayout(null);
		setSize(500,500);
		setBackground(Color.red);
		setVisible(true);
	}
	public static void main(String args[])
{
	new MyJTextField();
}
}