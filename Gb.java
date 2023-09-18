import java.awt.Button; 
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
public class Gb extends JFrame
{
	public Gb()
	{
		GridBagLayout grid=new GridBagLayout();
		GridBagConstraints gbc=new GridBagConstraints();
		setLayout(grid);
		setTitle("GridBag Layout");
		GridBagLayout layout=new GridBagLayout();
		
		JLabel l1=new JLabel("Name");
		//l1.setBounds(60,60,50,30);
		JLabel l2=new JLabel("Comments");
		//l2.setBounds(60,90,50,50);
		JTextField t1=new JTextField();
		//t1.setBounds(90,100,90,80);
		JTextArea t2=new JTextArea(10,10);
		//t2.setBounds(100,150,100,100);
		JScrollPane sp=new JScrollPane(t2);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.setLayout(layout);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		this.add(l1,gbc);
		
		gbc.gridx=1;
		gbc.gridy=0;
		this.add(t1,gbc);
		
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=1;
		this.add(l2,gbc);
		gbc.gridx=1;
		gbc.gridy=1;
		this.add(t2,gbc);
		this.getContentPane().add(sp);
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridwidth=1;
		this.add(new Button("Submit"),gbc);
		setSize(500,500); 
		//setPrefferedSize(getSize());
        setVisible(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
	}
	public static void main(String[] args)
	{
		Gb a=new Gb();
	}
}
		
		
		
		
		
		
		
		
		