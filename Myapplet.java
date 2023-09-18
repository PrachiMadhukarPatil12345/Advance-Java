import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
  Font obj = new Font("Times new Roman",Font.BOLD,40);
  Font obj1 = new Font("serif",Font.ITALIC,20);
public void paint(Graphics g)
    {
   g.setFont(obj);
   g.drawString("IT",20,80);
   g.setFont(obj1);
   g.drawString("welcome",300,80);
    }
}

/*
<Applet code="Myapplet.class" width ="200" height ="150"> </APPLET>
*/
