import java.awt.*;

public class Checkbox
{
	CheckBox()
	{
	Frame f=new Frame("CheckBox Frame");
	CheckboxGroup cbg=new CheckboxGroup();
	
	Checkbox b1=new Checkbox("c++",cbg,false);
	
	box1.setBounds(100,90,100,100);
	
	Checkbox box2=new Checkbox("Advanced java",true);
	
	box2.setBounds(100,200,100,100);
	f.add(box1);
	f.add(box2);
	f.setSize(600,600);
	f.setLayout(null);
	f.setVisible(true);
	}
	public static void main(String args[])
	{
		new Checkbox();
	}
}

	
	