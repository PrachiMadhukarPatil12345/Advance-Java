import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.applet.Applet;
 
public class AdapterMouseDrag extends Applet
{
    public void init()
    {
        addMouseMotionListener(new MouseDrag(this));
    }
}
 
 
class MouseDrag extends MouseMotionAdapter
{
    AdapterMouseDrag ad;
 
   
    public MouseDrag(AdapterMouseDrag ad)
    {
        this.ad = ad;
    }
 
    public void mouseDragged(MouseEvent me)
    {
        ad.showStatus("Mouse Dragged");
    }
 
}
 
/*
    <applet code="AdapterMouseDrag" height="400" width="400">
 
    </applet>
*/
