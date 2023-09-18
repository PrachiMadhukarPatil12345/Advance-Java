import javax.swing.*;
class MyJButton extends JFrame
{
MyJButton()
{
	JButton b=new JButton("Click Here...");
	JButton bb=new JButton(new ImageIcon("7.jpeg"));
	JButton cc=new JButton(new ImageIcon("sky.jpg"));
	
	b.setBounds(100,180,150,30);
	bb.setBounds(100,280,200,100);
	cc.setBounds(100,400,250,150);
	
	add(b);
	add(bb);
	add(cc);
	
	setLayout(null);
	setSize(500,500);
	setVisible(true);
}
public static void main(String args[])
{
	new MyJButton();
}
}