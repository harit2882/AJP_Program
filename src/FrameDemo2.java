import java.awt.*;
import java.awt.event.*;

public class FrameDemo2 extends Frame implements ActionListener
{
	Frame f;
	Button b1;
	Label l1;
	TextField t1;

	FrameDemo2()
	{
		setLayout(new FlowLayout());

		b1=new Button("Submit");
		l1=new Label("Enter your name : ");
		t1=new TextField(20);

		add(l1);
		add(t1);
		add(b1);

		setSize(300,300);
		setVisible(true);
		setTitle("My First Frame ");

		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ob)
	{
		String s=t1.getText();
		s="Hello, "+s;
		l1.setText(s);
	}
	public static void main(String args[])
	{
		FrameDemo2 t=new FrameDemo2();
	}
}