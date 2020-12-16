import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo extends Applet implements ItemListener
{
	Label l1;
	Choice q;
	TextField t;
	
	public void init()
	{
		l1=new Label("Select your qualification");
		q=new Choice();
		t=new TextField(50);

		
		t.setEditable(false);
		q.add("Diploma");
		q.add("Degree");
		q.add("ME");
		q.add("Phd");
		q.add("MBA");
		q.add("MCA");

		add(l1);
		add(q);
		add(t);

		q.addItemListener(this);
		q.select(0);
		
	}
	public void itemStateChanged(ItemEvent ob)
	{
		String s="Youe hobbies are : ";
		
		s=q.getSelectedItem();
		t.setText(s);	
	}
}
/*
<applet code="ChoiceDemo" width=500 height=500>
</applet>
*/
