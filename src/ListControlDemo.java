import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ListControlDemo extends Applet implements ItemListener
{
	Label l1;
	List q;
	TextField t;
	
	public void init()
	{
		l1=new Label("Select your qualification");
		q=new List(3,true);
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
		
	}
	public void itemStateChanged(ItemEvent ob)
	{
		String s="Your Qualification are : ";
		
		String temp[]=q.getSelectedItems();
		
		for(int i=0;i<temp.length;i++)
			t.setText(s=s+temp[i]+" ");	
	}
}
/*
<applet code="ListControlDemo" width=500 height=500>
</applet>
*/
