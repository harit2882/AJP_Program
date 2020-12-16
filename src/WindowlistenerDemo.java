import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class WindowlistenerDemo extends Frame implements WindowListener
{
	TextField t;

	public WindowlistenerDemo()
	{
		setLayout(new FlowLayout());
		t=new TextField(25);
		add(t);
		this.addWindowListener(this);
	}
	public void WindowOpened(WindowEvent ob)
	{
		System.out.println("Window Opened");
	}
	public void WindowActivated(WindowEvent ob)
	{
		System.out.println("Window Activated");
	}
	public void WindowDeactivated(WindowEvent ob)
	{
		System.out.println("Window Deactivated");
	}
	public void WindowIconified(WindowEvent ob)
	{
		System.out.println("Window Iconified");
	}
	public void WindowDeiconified(WindowEvent ob)
	{
		System.out.println("Window Deiconified");
	}
	public void WindowClosing(WindowEvent ob)
	{
		System.out.println("Window Closing");
	}
	public void WindowClosed(WindowEvent ob)
	{
		System.out.println("Window Closed");
	}
	
	public static void main(String args[])
	{
		WindowlistenerDemo f = new WindowlistenerDemo();
		f.setVisible(true);
		f.setSize(300,300);
		f.setTitle("My Frame");
	}

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}