import java.awt.*;

class Border extends Frame
{
	public static void main (String args[])                                                 
	{
		Border b=new Border();
	}
	Border()
	{
		Button b1=new Button("NORTH");
		Button b2=new Button("SOUTH");
		Button b3=new Button("EAST");
		Button b4=new Button("WEST");
		Button b5=new Button("CENTER");
		
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
		
		setSize(300,300);
		setBackground(Color.blue);
		setVisible(true);
	}
}



	
