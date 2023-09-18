import java.awt.*;

public class Checkbox5
{
	Checkbox5()
	{
	Frame f=new Frame("CheckBox Frame");
	CheckboxGroup cbg=new CheckboxGroup();
	
	Checkbox b1=new Checkbox("MARATHI",cbg,true);
	b1.setBounds(100,90,100,100);
	
	Checkbox b2=new Checkbox("HINDI",true);
	b2.setBounds(100,200,150,100);
	
	Checkbox b3=new Checkbox("ENGLISH",true);
	b3.setBounds(100,350,200,100);
	
	Checkbox b4=new Checkbox("SANSKRIT",cbg,true);
	b4.setBounds(100,500,250,100);
	
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	
	f.setSize(800,800);
	f.setLayout(null);
	f.setVisible(true);
	f.setBackground(Color.blue);
	}
	public static void main(String args[])
	{
		new Checkbox5();
	}
}

	
	