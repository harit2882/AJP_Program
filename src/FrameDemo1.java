import java.awt.*;
import java.awt.event.*;

public class FrameDemo1 implements ActionListener
{
	Frame f;
	Button b1;
	Label l1;
	TextField t1;

	FrameDemo1()
	{
		f=new Frame();
		f.setLayout(new FlowLayout());

		b1=new Button("Submit");
		l1=new Label("Enter your name : ");
		t1=new TextField(20);

		f.add(l1);
		f.add(t1);
		f.add(b1);

		f.setSize(300,300);
		f.setVisible(true);
		f.setTitle("My First Frame ");

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
		FrameDemo1 t=new FrameDemo1();
	}
}
