import java.awt.*;

public class CheckBox
{
	CheckBox()
	{
	Frame f=new Frame("CheckBox Frame");
	
	CheckBox box1=new CheckBox("c++");
	box1.setBounds(100,90,100,100);
	CheckBox box2=new CheckBox("Advanced java");
	box2.setBounds(100,200,100,100);
	f.add(box1);
	f.add(box2);
	f.setSize(600,600);
	f.setLayout(null);
	f.setVisible(true);
	}
	public static void main(String args[])
	{
		new CheckBox();
	}
}

	
	