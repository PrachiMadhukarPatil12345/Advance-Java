import java.awt.*;
class Grid5 extends Frame
{
	public static void main (String args[])
	{
		Grid5 gd=new Grid5();
	}
	Grid5()
	
	{
		GridLayout g=new GridLayout();
		setFont(new Font("SansSerif",Font.BOLD,24));
		setLayout(new GridLayout(3,2,20,20));
		Button b1=new Button("Button1");
		Button b2=new Button("Button2");
		Button b3=new Button("Button3");
		Button b4=new Button("Button4");
		Button b5=new Button("Button5");
		
		add(b1);
		add(b2);
		add(b3);
		add(b3);
		add(b4);
		add(b5);
		setBackground(Color.yellow);
		setSize(600,600);
		setVisible(true);
	}
}