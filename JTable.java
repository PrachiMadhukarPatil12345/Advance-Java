import javax.swing.*;
public class JTable
{
	JFrame f;
	JTable()
	{
		f=new JFrame();
		String data[][]={{"sunday","1","2021"},
		{"monday","2","2021"},
		{"tuesday","3","2021"},
		{"wednesday","4","2021"},
		{"thursday","5","2021"},
		{"Friday","6","2021"},
		{"saturday","7","2021"}};
		String column[]={"DAY","DATE","YEAR"};
		JTable jt=new JTable(data,column);
		jt.setBounds(150,150,300,300);
		JScrollPane sp=new JScrollPane(jt);
		f.add(sp);
		f.setSize(500,500);
		f.setVisible(true);
	}
	public static void main(String[] args)
		{
			new JTable();
		}
}
	
					
			
		