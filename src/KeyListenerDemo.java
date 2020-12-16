import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerDemo extends Applet implements KeyListener
{
	String msg="";
	public void init()
	{
		this.addKeyListener(this);
	}
	public void keyPressed(KeyEvent ob)
	{
		msg+="<P>";
	}
	public void keyTyped(KeyEvent ob)
	{
		msg+="<T>";
	}
	public void keyReleased(KeyEvent ob)
	{
		msg+="<R>";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,50);
	}
}
/*<applet code="KeyListenerDemo" width=500 height=500>
</applet>
*/	
		
		