package clg_programs;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("removal")
public class appl extends Applet {
    public void paint(Graphics g) {
        g.drawLine(10,10,50,50);
        g.drawRect(10,60,40,30);
        g.setColor(Color.blue);
        g.fillRect(60,10,30,80);
        g.setColor(Color.green);
        g.drawRoundRect(10,100,80,50,10,10);
        g.setColor(Color.yellow);
        g.fillRoundRect(20,110,60,30,5,5);
        g.setColor(Color.red);
        g.drawLine(100,10,230,140);
        g.drawLine(100,140,230,10);
        g.drawString("Line Rectangles Demo",65,180);
        g.drawOval(530,60,200,150);
        g.setColor(Color.blue);
        g.fillOval(245,25,100,100);
    }
}
/*<applet code="appl.class"height=300 width=300>
</applet>*/