package clg_programs;

import java.awt.*;
import java.applet.*;
public class faces extends Applet
{
public void paint(Graphics g)
{
g.drawOval(40,40,120,150);
g.setColor(Color.green);
g.drawOval(57,75,30,20);
g.drawOval(110,75,30,20);
g.fillOval(68,81,10,10);
g.fillOval(121,81,10,10);
g.setColor(Color.black);
g.drawOval(85,100,30,30);
g.setColor(Color.red);
g.fillArc(60,125,80,40,180,180);
g.drawOval(25,92,15,30);
g.setColor(Color.blue);
g.drawOval(160,92,15,30);
}
}
/*<applet code="faces.class" width=300 height=300>
</applet> */