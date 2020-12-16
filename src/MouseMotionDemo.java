import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MouseMotionDemo extends Applet implements MouseMotionListener
{
	TextField t;
	int x,y;

	public void init()
	{
		t=new TextField(50);
		add(t);
		addMouseMotionListener(this);
	}
	public void mouseMoved(MouseEvent ob)
	{
		x=ob.getX();
		y=ob.getY();
		t.setText("Mouse is moving at position x="+x+" y="+y);
		repaint();
	}
	public void mouseDragged(MouseEvent ob)
	{
		x=ob.getX();
		y=ob.getY();
		t.setText("Mouse is dragging at position x="+x+" y="+y);
	}
	public void paint(Graphics g)
	{
		g.drawOval(x,y,60,60);
	}
}
/*
<applet code="MouseMotionDemo" width=500 height=500>
</applet>
*/
