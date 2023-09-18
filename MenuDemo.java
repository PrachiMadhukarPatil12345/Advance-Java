import java.awt.*;
import java.awt.event.*;
class MenuDemo
{
	MenuDemo()
	{
		Frame f=new Frame("Menu");
		MenuBar mb=new MenuBar();
		Menu m1=new Menu("FILE");
		MenuShortcut s;
		
		MenuItem i1=new MenuItem("NEW");
		MenuItem i2=new MenuItem("OPEN");
		
		Menu submenu=new Menu("SAVE");
		CheckboxMenuItem si1=new CheckboxMenuItem("save");
		MenuItem si2=new MenuItem("Save As");
		
		submenu.add(si1);
		submenu.add(si2);
		MenuItem i3=new MenuItem("Exit");
		s=new MenuShortcut(KeyEvent.VK_X);
		i3.setShortcut(s);
		m1.add(i1);
		m1.add(i2);
		m1.add(submenu);
		m1.add(i3);
		mb.add(m1);
		f.setMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		MenuDemo md=new MenuDemo();
		
	}
}
		
		
	