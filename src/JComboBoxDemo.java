import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxDemo extends JFrame implements ItemListener
{
	JLabel l;
	JTextField t;
	JComboBox bdate;

	JComboBoxDemo()
	{
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		l=new JLabel("Select your date of birth");
		t=new JTextField(20);
		bdate = new JComboBox();

		for(int i=1;i<=31;i++)
		{
			bdate.addItem(""+i);
		}
		c.add(l);
		c.add(bdate);
		c.add(t);

		bdate.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ob)
	{
		t.setText("Your birthday is "+bdate.getSelectedItem());
	}
	public static void main(String args[])
	{
		JComboBoxDemo ob = new JComboBoxDemo();
		ob.setSize(330,300);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
//<applet code="JComboBoxDemo" width=500 height=500></applet>