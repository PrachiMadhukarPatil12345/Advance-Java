import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
/* <applet code="Appletbtnbox" width =600 height=600> </applet>
*/
public class Appletbtnbox extends Applet
{
	public void init()
	{
		CheckboxGroup abc=new CheckboxGroup();
		Checkbox pune=new Checkbox("pune",abc,true);
		Checkbox nagar=new Checkbox("nagar",true);
		Checkbox sangli=new Checkbox("sangli",abc,true);
		Checkbox miraj=new Checkbox("miraj",true);
		Checkbox delhi=new Checkbox("delhi",abc,true);
		Checkbox aravade=new Checkbox("aravade",true);
		
		add(pune);
		add(nagar);
		add(sangli);
		add(miraj);
		add(delhi);
		add(aravade);
	}
}
