import java.awt.*;
class MyMenubar extends Frame
{
MyMenubar()
{
MenuBar mb=new MenuBar();   //Menubar object

Menu file=new Menu("File");  // Menu object
Menu edit=new Menu("Edit");
Menu save=new Menu("sava as");


MenuItem n=new MenuItem("new");  //MenuItem object
MenuItem o=new MenuItem("open");
MenuItem c=new MenuItem("close");

MenuItem cut=new MenuItem("cut");
MenuItem copy=new MenuItem("copy");
MenuItem paste=new MenuItem("paste");

MenuItem saveas=new MenuItem("save as");
MenuItem desktop=new MenuItem("desktop");
MenuItem download=new MenuItem("download");


file.add(n);  //add menu item to file
file.addSeparator();
file.add(o);
file.addSeparator();

file.add(c);
file.addSeparator();

edit.add(cut); //add MenuItem to file
edit.addSeparator();
edit.add(copy);
edit.addSeparator();
edit.add(paste);
edit.addSeparator();

save.add(saveas);
save.add(desktop);
save.add(download);

file.add(edit);
file.add(save);
mb.add(file);

setMenuBar(mb); // add Menubar to FRAME

setLayout(new FlowLayout());
setSize(500,500);
setBackground(Color.yellow);
setVisible(true);
}
public static void main(String args[])
{
	new MyMenubar();
}
}

