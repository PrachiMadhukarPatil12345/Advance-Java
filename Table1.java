import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class Table1
{
	JFrame f;
	Table1()
	{
		f=new JFrame();
		String[][] data={{"101","Amit","670000"},
		{"102","Jai","780000"},
		{"103","sachin","700000"}};
		
		String[]column={"ID","NAME","SALARY"};
		JTable j=new JTable(data,column);
		j.setBounds(200,200,300,300);
		JScrollPane sp=new JScrollPane(j);
		f.add(sp);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args)
		{
			new Table1();
		}
}