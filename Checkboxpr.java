import java.awt.*;
public class Checkboxpr
{
	Checkboxpr()
	{
	Frame f=new Frame("LANGUAGES");
	CheckboxGroup cbg=new CheckboxGroup();
	
	Checkbox b1=new Checkbox("MARATHI",cbg,false);
	b1.setBounds(100,90,100,100);
	
	Checkbox b2=new Checkbox("HINDI",cbg,true);
	b2.setBounds(100,200,100,100);
	
	Checkbox b3=new Checkbox("ENGLISH",true);
	b3.setBounds(100,310,100,100);
	
	Checkbox b4=new Checkbox("SANSKRIT",cbg,true);
	b4.setBounds(100,440,100,100);
	
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
	}
	public static void main(String args[])
	{
		new Checkboxpr();
	}
}
		