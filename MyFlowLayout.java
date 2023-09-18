import java.awt.*;
import java.applet.*;

/*
<applet code=MyFlowLayout.class width=500 height=500>
</applet>
*/
public class MyFlowLayout extends Applet
{
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.CENTER ,20,20));
		setBackground(Color.green);
		setForeground(Color.yellow);
		
		add(new Button("AJP"));
		add(new Button("EST"));
		add(new Button("OSY"));
		add(new Button("CSS"));
		add(new Button("EDE"));
		add(new Button("CPP"));
	}
}