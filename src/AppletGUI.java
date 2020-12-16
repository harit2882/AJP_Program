import java.applet.*;
import java.awt.*;

public class AppletGUI extends Applet
{
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Button b1;

	public void init()
	{
		setBackground(Color.yellow);
		l1=new Label("Enter your name ");
		l2=new Label("Phone No :");
		l3=new Label("address:");

		tf1=new TextField(14);
		tf2=new TextField(8);
		tf2.setText("+91 ");
		tf3=new TextField(25);

		//tf2.setEditable(false);
	
		b1=new Button("Submit");
		//tf2.setEchoChar('*');

		
		
		add(l1);add(tf1);add(l2);add(tf2);add(l3);add(tf3);add(b1);
		
	}
}

/*<applet code="AppletGUI" width=500 height=500>
</applet>*/
