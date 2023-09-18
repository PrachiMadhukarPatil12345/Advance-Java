import java.awt.*;

public class MyLabel
{
	public static void main(String args[])
	{
		Frame f = new Frame("My First AWT Program");
		Label l1=new Label("Welcome to Java");
		l1.setBounds(80,90,100,100);
		
		f.add(l1);
		f.setSize(500,500);
		f.setBackground(Color.green);
		f.setLayout(null);
		f.setVisible(true);
	}
}
