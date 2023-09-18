import javax.swing.*;
import java.awt.*;
public class CB
{
	CB()
	{
		JFrame f=new JFrame("JCOMBOBOX");
		String s[]={"Maharashtra","Tamilnadu","Karnataka",
	"Panjab","Up","MP","Goa","Hariyana","Keral","Nagaland"};
	
		JComboBox cb=new JComboBox(s);
		cb.setBounds(100,70,150,40);
		cb.setBackground(Color.red);
		f.add(cb);
		f.setLayout(null);
		f.setSize(600,600);
		f.setBackground(Color.green);
		f.setVisible(true);
	}
	public static void main (String[] args)
	{
		new CB();
	}
}