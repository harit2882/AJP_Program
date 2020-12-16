import java.applet.*;
import java.awt.*;

public class Chart extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(10,20,10,400);
		g.drawLine(0,380,400,380);
		g.drawRect(40,330,40,50);
		g.drawRect(110,280,40,100);
		g.drawRect(180,310,40,70);
		
	}
}
/*
<applet code="Chart" width=400 height=400>
</applet>
*/