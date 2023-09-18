import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter 
{
	public TextArea ta;

	Frame f;
	MyWindowAdapter()
	{
		
		f= new Frame ("WindowAdapter Example");
		ta = new TextArea("Enter your feedback here...", 20,20);
		ta.setBounds(100,100,300,300);
		ta.setFont(new Font("Courier", Font.BOLD, 30));
		
		f.addWindowListener(this);
		
		f.add(ta);
		
			
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);	
		
	}
	
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
	
	public static void main(String args[])
	{
		new MyWindowAdapter();
	}
	
}

