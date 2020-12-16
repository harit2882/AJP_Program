import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CheckboxDemo extends Applet implements ItemListener
{
	Label l1;
	Checkbox c1,c2,c3;
	TextField t;
	
	public void init()
	{
		l1=new Label("Select your hobbies");
		c1=new Checkbox("Programming	",false);
		c2=new Checkbox("Playing	",false);
		c3=new Checkbox("Chating",true);

		t=new TextField(80);
		t.setEditable(false);
		add(l1);
		add(c1);
		add(c2);
		add(c3);
		add(t);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ob)
	{
		String s="Youe hobbies are : ";
		
		if(c1.getState()==true)
			s=s+c1.getLabel();
		if(c2.getState()==true)
			s=s+c2.getLabel();
		if(c3.getState()==true)
			s=s+c3.getLabel();
		t.setText(s);	
	}
}
/*
<applet code="CheckboxDemo" width=500 height=500>
</applet>
*/
