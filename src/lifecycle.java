import java.applet.*;
import java.awt.*;

public class lifecycle extends Applet
{
	String msg="";
	
	public void init()
	{
		msg=msg+"init called";
	}
	public void start()
	{
		msg=msg+" start";
	}
	public void stop()
	{
		msg=msg+" stop";
	} 
	public void destroy()
	{
		msg=msg+" destroy";
	}
	public void paint(Graphics g)
	{
		msg=msg+" paint";
		g.drawString(msg,80,80);
	}
}
/*
<applet code="lifecycle" width=200 height=200>
</applet>
*/