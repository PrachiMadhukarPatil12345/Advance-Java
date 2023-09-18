import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;  
import java.awt.event.MouseMotionListener; 
 
public class MouseCount extends Frame implements MouseListener
{
    int count = 0;
    MouseCount()
    {
        addMouseListener(this);
    }
 
    public void mouseClicked(MouseEvent me)
    {
        count++;
        showStatus("Number of time Clicked:"+count);
        repaint();
    }
 
    public void mouseEntered(MouseEvent me)
    {
    }
    public void mouseExited(MouseEvent me)
    {
    }
    public void mousePressed(MouseEvent me)
    {
    }
    public void mouseReleased(MouseEvent me)
    {
    }
	public static void main(String[] args)
	{  
    new MouseCount();
	}  
}
