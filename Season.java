/* <applet code="Season" width =600 height=600> </applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Season extends Applet
{
	public void init()
	{
	List l1=new List(10,true);
	l1.setBounds(150,150,200,150);
	l1.add("SUMMAR");
	l1.add("WINTER");
	l1.add("RAINY");
	
	add(l1);
	setLayout(null);
	setSize(400,400);
	setBackground(Color.pink);
	}
	public void paint(Graphics g)
	{
		repaint();
	}
}