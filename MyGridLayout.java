import java.awt.*;
import java.applet.*;

/*
<applet code=MyGridLayout.class width=500 height=500>
</applet>
*/
public class MyGridLayout extends Applet
{
	public void init()
	{
		setLayout(new GridLayout(3,3,20,20));
		setBackground(Color.red);
		setForeground(Color.pink);
		add(new Button("1"));
		add(new Button("2"));
		add(new Button("3"));
		add(new Button("4"));
		add(new Button("5"));
		add(new Button("6"));
		add(new Button("7"));
		add(new Button("8"));
		add(new Button("9"));
	}
}