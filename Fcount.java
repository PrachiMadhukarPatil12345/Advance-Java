import java.awt.*;
import java.awt.event.*;
public class Fcount extends Frame implements MouseListener
{
	Label l;
	Label l2;
	int p=0;
	//Image pic;
	public Fcount()
	{
		//pic=getImage(getDocumentBase(),"7.jpeg");
		setLayout(null);
		//ImageIcon i=new ImageIcon("C:\Example\college.jpg");
		//setContentPane(new Label(new ImageIcon(C:\Example\college.jpg)));
		//Label back=new Label(new ImageIcon("college.jpg"));
		//add(i);
		l=new Label("Mouse Click Count");
		l.setForeground(Color.blue);
		l.setBounds(50,150,200,100);
		add(l);
		addMouseListener(this);
		l2=new Label("MOUSE COUNT DEMO");
		l2.setBounds(150,50,300,150);
		l2.setFont(new java.awt.Font("Arial",Font.BOLD,24));
		//l2.setBackground(Color.green);
		l2.setForeground(Color.red);
		add(l2);
		setBackground(Color.yellow);
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