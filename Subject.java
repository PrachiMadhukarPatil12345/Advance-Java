import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="Subject" width =600 height=600> </applet>
*/
public class Subject extends Applet
{
	public void init()
	{
	List l1=new List(10);
	l1.setBounds(100,100,200,150);
	l1.add("Sangli");
	l1.add("Miraj");
	l1.add("Pune");
	l1.add("Mumbai");
	l1.add("Delhi");
	l1.add("Tasgaon ");
	l1.add("Karad");
	l1.add("Nagar");
	l1.add("Jaipur");
	l1.add("Surat");
	add(l1);
	setLayout(null);
	setSize(600,600);
	setBackground(Color.green);
	}
	public void paint(Graphics g)
	{
		repaint();
	}
}
	