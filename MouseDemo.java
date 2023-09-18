import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;
/* <APPLET CODE ="MouseDemo" WIDTH=300 HEIGHT=200> </APPLET>
*/ 
public class MouseDemo extends Applet implements MouseListener 
{
	Label l;
	Image pic;
	public void init()
	{
        pic=getImage(getDocumentBase(),"7.jpeg");
		setLayout(null);
		l=new Label("Hello Mouse");
        l.setBounds(50,150,200,100);
		add(l);
		addMouseListener(this);
	}
	public void mousePressed(MouseEvent e)
	{
		l.setText("Mouse Pressed no of clicks:" + e.getClickCount() + "atposition" + e.getX() + " "+e.getY());
	}
	public void mouseReleased(MouseEvent e)
	{
		l.setText("Mouse Released; # of clicks:"+e.getClickCount());
	}
	public void mouseEntered(MouseEvent e)
	{
		l.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e)
	{
		l.setText("Mouse exited");
	}
	public void mouseClicked(MouseEvent e)
	{
	l.setText("mouse clicked(# of clicks:"+e.getClickCount());
	}
	public void paint (Graphics g)
	{
		g.drawImage(pic,100,30,this);
	}
}
