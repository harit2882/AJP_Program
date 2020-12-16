import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton extends Applet implements ItemListener
{	
	Label l1;
	Checkbox m,f,o;
	TextField t;
	CheckboxGroup gender;
	
	public void init()
	{
		gender=new CheckboxGroup();
		l1=new Label("Select your Gender");
		m=new Checkbox("Male	",false,gender);
		f=new Checkbox("Female	",false,gender);
		o=new Checkbox("Other	",false,gender);

		t=new TextField(80);
		t.setEditable(false);
		add(l1);
		add(m);
		add(f);
		add(o);
		add(t);
		m.addItemListener(this);
		f.addItemListener(this);
		o.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ob)
	{
		Checkbox temp;
		temp=gender.getSelectedCheckbox();
		t.setText("You are "+temp.getLabel());
	}
}
/*
<applet code="RadioButton" width=500 height=500>
</applet>
*/