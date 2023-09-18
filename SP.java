import javax.swing.*;
import java.awt.*;
public class SP
{
	SP()
	{   JFrame f=new JFrame("Practical 6,JScrollPane");
		f.setSize(600,600);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new FlowLayout());
		
		JLabel l=new JLabel("ScrollPane TABLE");
		l.setBounds(20,20,100,30);
		
		GridLayout g=new GridLayout();
		setBackground(Color.green);
		setFont(new Font("SansSerif",Font.BOLD,24));
		setLayout(new GridLayout(3,3,20,20));
		for(int i=1;i<=9;i++)
		{
			add(new Button(" " + i));
		}
		JScrollPane p1=new JScrollPane(g);
		
		p1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		p1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		f.add(l);
		f.getContentPane().add(p1);
		
	}
	public static void main(String[] args)
	{
		new SP();
	}
}
		