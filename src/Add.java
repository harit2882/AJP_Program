import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Add extends Applet implements ActionListener
{
	Button b1;
	Label l1,l2;
	TextField t1,t2,t3;

	public void init()
	{
		b1=new Button("Total");
		l1=new Label("Enter First Number");
		l2=new Label("Enter second Number");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);

		t3.setEditable(false);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(t3);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ob)
	{
		int n1,n2,ans;
		n1=Integer.parseInt(t1.getText());
		n2=Integer.parseInt(t2.getText());
		ans=n1+n2;
		t3.setText(" "+ans);
	}
}
/*
<applet code="Add" width=500 height=500>
</applet>
*/
