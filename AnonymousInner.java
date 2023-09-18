import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class AnonymousInner extends JFrame
{
	public static void main(String[] args)
	{
		AnonymousInner ai = new AnonymousInner();
 
        JButton jb = new JButton(" Click Me ");
		jb.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
                System.out.println("Action Event:"+ae);
            }
			});
 
        ai.add(jb);
        ai.pack();
		ai.setBounds(100,100,150,100);
        ai.setVisible(true);
    }
}
