import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JAppletDemo extends JApplet implements ActionListener
{
	JTextField t;
	JLabel l;
	JButton b;

	public void init()
	{
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.setBackground(Color.PINK);
		ImageIcon i = new ImageIcon ("pic1.png");

		t= new JTextField(20);
		l= new JLabel("SnapChat Id :",i,JLabel.LEFT);

		b= new JButton(i);

		c.add(l);
		c.add(t);
		c.add(b);

		t.setToolTipText("Enter Id");
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ob)
	{
		t.setText("Button Clicked");
	}
}
/* <applet code="JAppletDemo" width=500 height=500></applet>
*/