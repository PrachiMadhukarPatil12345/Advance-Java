import java.awt.*;
class MyMenubar2 extends Frame
{
MyMenubar2()
{
MenuBar mb=new MenuBar();   //Menubar object

Menu language=new Menu("language");  // Menu object
Menu tools=new Menu("tools");

MenuItem n=new MenuItem("c++");  //MenuItem object
MenuItem o=new MenuItem("java");
MenuItem c=new MenuItem("html");

MenuItem v=new MenuItem("view");
MenuItem e=new MenuItem("editor");
MenuItem co=new MenuItem("compiler");

language.add(n);  //add menu item to language
language.addSeparator();
language.add(o);
language.addSeparator();

language.add(c);
language.addSeparator();

tools.add(v); //add MenuItem to file
tools.addSeparator();
tools.add(e);
tools.addSeparator();
tools.add(co);
tools.addSeparator();

mb.add(language);
mb.add(tools);

setMenuBar(mb); // add Menubar to FRAME

setLayout(new FlowLayout());
setSize(500,500);
setBackground(Color.black);
setVisible(true);
}
public static void main(String args[])
{
	new MyMenubar2();
}
}

