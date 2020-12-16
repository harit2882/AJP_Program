import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Applet implements MouseMotionListener
{
	TextField t;
	int x,y,x1,y1,x2,y2,n=1;

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
		//repaint();
		
	}
	public void mouseDragged(MouseEvent ob)
	{
		x=ob.getX();
		y=ob.getY();
		t.setText("Mouse is dragging at position x="+x+" y="+y);

	}
	public void paint(Graphics g)
	{
		
		g.drawLine(x,y,x1,y1);
	
	}
}
/*
<applet code="MouseEventDemo" width=500 height=500>
</applet>

		if(n%2!=0)
		{
			x1=x;
			y1=y;
		}
		else
		{	
			x2=x;
			y2=y;
			repaint();
		}
		n++;*/