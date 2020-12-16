import java.applet.*;
import java.awt.*;

public class PanelDemo extends Applet
{
	Panel c1,c2,c3;
	TextField t1,t2,t3;
	Label l1,l2,l3;

	public void init()
	{
		c1=new Panel();
		l1=new Label("Enter Faculty Name");
		t1=new TextField(20);
		c1.add(l1);
		c1.add(t1);

		c2=new Panel();
		l2=new Label("Enter your faculty no :");
		t2=new TextField(20);
		c2.add(l2);
		c2.add(t2);

		c3=new Panel();
		l3=new Label("Enter your moblie no :");
		t3=new TextField(20);
		c3.add(l3);
		c3.add(t3);
 
		add(c1);
		add(c2);
		add(c3);
	}
}
/* <applet code="PanelDemo" height=500 width=500></applet>
*/