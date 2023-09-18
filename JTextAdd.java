import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JTextAdd implements ActionListener
{
	JTextField tf , tf1 ;
    JLabel res;
	JTextAdd()
	{
		JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
		
		JLabel jl = new JLabel("Enter 1st Number:");
		tf = new JTextField(5);
		JLabel jl1 = new JLabel("Enter 2nd Number:");
		tf1 = new JTextField(5);
		res = new JLabel("Addition");
        tf1.addActionListener(this);
 
        f.add(jl);
        f.add(tf);
        f.add(jl1);
        f.add(tf1);
        f.add(res);
	}
	public static void main(String[] args)
	{
        JTextAdd jt = new JTextAdd();
    }
 
    public void actionPerformed(ActionEvent ae)
    {
        String str1 = tf.getText();
        double fn = Double.parseDouble(str1);
        double sn = Double.parseDouble(tf1.getText());
    
        res.setText("Sum is " + (fn+sn));
    }
}
