import java.awt.*;
public class Buttonawt
{
	public static void main (String args[])
	{
		Frame f= new Frame("Btn Example");
		
		Button b1=new Button("OK");
		b1.setBounds(80,50,70,70);
		
		Button b2=new Button("RESET");
		b2.setBounds(80,160,70,70);
		
		Button b3=new Button("CANCEL");
		b3.setBounds(80,260,70,70);
		
		Button b4=new Button("WAIT");
		b4.setBounds(80,360,70,70);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setSize(600,600);
		f.setBackground(Color.red);
		f.setLayout(null);
		f.setVisible(true);
	}
}	