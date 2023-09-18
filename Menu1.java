import java.awt.*;
class MenuEx extends Frame
{
	MenuEx()
	{
		MenuBar mr=new MenuBar();
		setMenuBar(mr);
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
		mr.add(m1);
	}
}
class MenuBarEx
{
	public static void main(String args[])
	{
		MenuEx m=new MenuEx();
		m.setTitle("Menu-Bar");
		m.setSize(600,600);
		m.setBackground(Color.red);
		m.setVisible(true);
    }
}
		