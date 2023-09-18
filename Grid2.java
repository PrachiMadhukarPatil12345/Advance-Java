import java.awt.*;
class Grid2 extends Frame
{
	public static void main (String args[])
	{
		Grid2 gd=new Grid2();
	}
	Grid2()
	
	{
		GridLayout g=new GridLayout();
		setFont(new Font("SansSerif",Font.BOLD,24));
		setLayout(new GridLayout(5,5,20,20));
		for(int i=1;i<=25;i++)
		{
			add(new Button(" " + i));
		}
		
		setVisible(true);
		setSize(600,600);
	}
}
		
	