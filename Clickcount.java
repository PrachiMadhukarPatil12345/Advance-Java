import java.awt.*;
import java.awt.event.*;
public class Fcount extends Frame implements MouseListener
{
	Label l;
	int p=0;
	//Image pic;
	public Fcount()
	{
		//pic=getImage(getDocumentBase(),"7.jpeg");
		setLayout(null);
		l=new Label("Mouse Click Count");
		l.setBounds(50,150,200,100);
		add(l);
		addMouseListener(this);
		setVisible(true);
		setSize(300,300);
	}
	public void mousePressed(MouseEvent e)
	{
	p++;
	l.setText("Count="+Integer.toString(p));
	}
	public void mouseReleased(MouseEvent e)
	{
		//l.setText("Mouse Released");
	}
	public void mouseEntered(MouseEvent e)
	{
		//l.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e)
	{
		//l.setText("Mouse exited");
	}
	public void mouseClicked(MouseEvent e)
	{
	    //l.setText("mouse clicked");
	}
	public static void main(String[] args)
	{
		new Fcount();
	}
}