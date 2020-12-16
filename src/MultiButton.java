import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MultiButton extends Applet implements ActionListener
{
	Label l1,l2;
	TextField t1,t2,t3;
	Button b1,b2;
	
	public void init()
	{
		b1=new Button("Minimum");
		b2=new Button("Maximum");
		l1=new Label("Enter 1st No : ");
		l2=new Label("Enter 2nd No : ");
		
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t3.setEditable(false);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(t3);
	}
	public void actionPerformed(ActionEvent ob)
	{
		int n1,n2,ans=0;
		n1=Integer.parseInt(t1.getText());
		n2=Integer.parseInt(t2.getText());
	
		if(ob.getSource()==b1)
		{
			if(n1>n2)
				ans=n2;
			else
				ans=n1;
		}
		else
		{
			if(n1>n2)
				ans=n1;
			else
				ans=n2;
		}
		t3.setText("    "+ans);	
	}
}
/*
<applet code="MultiButton" width=500 height=500>
</applet>
*/
