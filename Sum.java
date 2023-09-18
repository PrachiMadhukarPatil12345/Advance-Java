import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Sum extends Applet implements ActionListener
{
	TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);
    TextField t3 = new TextField(10);
    Label l1 = new Label("FIRST NO=:");
    Label l2 = new Label("SECOND NO:");
    Label l3 = new Label("ADDITION:");
    Button b = new Button("ADD");
	public void init()
	{
		l1.setForeground(Color.blue);
		add(l1);
		add(t1);
		l2.setForeground(Color.blue);
		add(l2);
		add(t2);
		add(l3);
        add(t3);
		b.setForeground(Color.green);
		b.setBackground(Color.yellow);
        add(b);
        b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== b)
		{
			int n1 = Integer.parseInt(t1.getText());
			int n2 = Integer.parseInt(t2.getText());
			t3.setText(" " + (n1 + n2));
		}
	}
}
/*
<applet code= "Sum" width="400" height="400">
</applet>
*/