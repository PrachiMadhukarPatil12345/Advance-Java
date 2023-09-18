import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class Table2
{
	JFrame f;
	Table2()
	{
		f=new JFrame();
		String[][] data={{"AAA","90%","A"},
		{"BBB","85%","A"},
		{"CCC","45%","C"},
		{"DDD","40%","D"},
		{"EEE","70%","B"},
		{"FFf","75%","A"},
		{"GGG","65%","C"}
		{"HHH","70%","B"},
		{"III","75%","A"},
		{"JJJ","95%","A"}};
		
		String[]column={"NAME OF STUDENT","PERCENTAGE","GRADE"};
		JTable j=new JTable(data,column);
		j.setBounds(100,100,300,300);
		JScrollPane sp=new JScrollPane(j);
		f.add(sp);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public static void main(String[] args)
		{
			new Table2();
		}
}