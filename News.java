/* <applet code="News" width =600 height=600> </applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class News extends Applet
{
	public void init()
	{
	List l1=new List(10,true);
	l1.setBounds(100,100,200,150);
	l1.add("THE HARMONIST");
	l1.add("LOKMAT");
	l1.add("PUDHARI");
	l1.add("TIMES OF INDIA");
	l1.add("Gadgets");
	l1.add("SAKAL");
	
	add(l1);
	setLayout(null);
	setSize(600,600);
	setBackground(Color.yellow);
	}
	public void paint(Graphics g)
	{
		repaint();
	}
}