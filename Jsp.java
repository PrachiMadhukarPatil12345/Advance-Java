import javax.swing.*;
import java.awt.*;
public class Jsp
{
	private static void GUI()
	{
		final JFrame f=new JFrame("Practical 6,JScrollPane");
		f.setSize(600,600);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.getContentPane().setLayout(new FlowLayout());
		
		JTextArea t=new JTextArea(20,20);
		JScrollPane p1=new JScrollPane(t);
		
		p1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		p1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		f.getContentPane().add(p1);
	}
	public static void main(String[] args)
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{public void run()
			{
				GUI();
			}
		});
	}
}
		