import java.awt.*;
class MenuEx 
{
		MenuEx()
	{
		Frame f=new Frame("MENUBAR EXAMPLE");
		MenuBar mb=new MenuBar();
		Menu m1=new Menu("Colours");
		
		MenuItem mn1=new MenuItem("Red");
		MenuItem mn2=new MenuItem("Green");
		MenuItem mn3=new MenuItem("Yellow");
		MenuItem mn4=new MenuItem("Black");
		mn4.setEnabled(false);
		MenuItem mn5=new MenuItem("blue");
		
		m1.add(mn1);
		m1.add(mn2);
		m1.add(mn3);
		m1.add(mn4);
		m1.add(mn5);
		mb.add(m1);
		f.setBackground(Color.blue);
		f.setMenuBar(mb);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new MenuEx();
	}
}
		