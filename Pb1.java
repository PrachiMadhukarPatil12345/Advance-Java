import javax.swing.*;
public class Pb1 extends JFrame
{
	JProgressBar jb;
	int i=0,num=0;
	Pb1()
	{
		jb=new JProgressBar(0,1000);    
	    jb.setBounds(100,100,160,70);         
        jb.setValue(0);    
        jb.setStringPainted(true);    
        add(jb);
		setSize(500,500);    
        setLayout(null);		
}
public void iterate()
{
	while(i<=1000)
	{
		jb.setValue(i);
		i=i+10;
		try{Thread.sleep(150);
		}
		catch(Exception e){}
	}
}
public static void main(String[] args)
{
	Pb1 m=new Pb1();
	m.setVisible(true);
	m.iterate();
	
}
		
   

