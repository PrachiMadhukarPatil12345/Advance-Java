import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class Table
{
	JFrame f;
	Table()
	{
		f=new JFrame();
		String[][] data={{"sunday","1","2021"},
		{"monday","2","2021"},
		{"tuesday","3","2021"},
		{"wednesday","4","2021"},
		{"thursday","5","2021"},
		{"Friday","6","2021"},
		{"saturday","7","2021"}};
		
		String[]column={"DAY","DATE","YEAR"};
		JTable j=new JTable(data,column);
		j.setBounds(70,100,300,300);
		JScrollPane sp=new JScrollPane(j);
		f.add(sp);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	public static void main(String[] args)
		{
			new Table();
		}
}
	
					
			
		