import java.applet.*;
import java.awt.*;

public class Boval extends Applet
{
	public void paint(Graphics ob)
	{
		ob.drawOval(0,0,500,500);
		ob.drawOval(100,100,300,300);
		ob.fillOval(200,200,100,100);
	}
}
/*
<applet code="Boval" width=200 height=200>
</applet>
*/