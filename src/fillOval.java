import java.applet.*;
import java.awt.*;

public class fillOval extends Applet
{
	public void paint(Graphics ob)
	{
		ob.fillOval(0,0,200,200);
		ob.fillOval(200,0,200,200);
		ob.fillOval(0,200,200,200);
		ob.fillOval(200,200,200,200);
	}
}
/*
<applet code="fillOval" width=300 height=400>
</applet>
*/