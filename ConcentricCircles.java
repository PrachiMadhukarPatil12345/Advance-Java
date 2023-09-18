import java.awt.*;
import java.applet.*;
public class ConcentricCircles extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.red);
g.fillOval(100,100,300,300);

g.setColor(Color.blue);
g.fillOval(150,150,200,200);

g.setColor(Color.green);
g.fillOval(200,200,100,100);
}
}

/*<applet code=ConcentricCircles width=300 height=300>
</applet>
*/
