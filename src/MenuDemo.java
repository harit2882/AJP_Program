import java.awt.*;
import java.awt.event.*;

public class MenuDemo extends Frame implements ActionListener,ItemListener
{
	MenuBar menu_bar;
	Menu file_menu,edit_menu,open_submenu;
	MenuItem open_mi,save_mi,copy_mi,paste_mi,myfile,myfile2;
	CheckboxMenuItem test;
	TextField t;
	
	public MenuDemo()
	{
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);

		menu_bar=new MenuBar();
		file_menu=new Menu("File");
		edit_menu=new Menu("Edit");
		open_submenu=new Menu("Open");

		open_mi=new MenuItem("Open");
		open_mi=open_submenu;
		save_mi=new MenuItem("Save");
		copy_mi=new MenuItem("Copy");
		paste_mi=new MenuItem("Paste");
		myfile=new MenuItem("My File");
		myfile2=new MenuItem("My File2");

		test=new CheckboxMenuItem("Item");
		t=new TextField(25);
		
		open_submenu.add(myfile);
		open_submenu.add(myfile2);

		edit_menu.add(copy_mi);
		edit_menu.add(paste_mi);
		edit_menu.add(test);

		file_menu.add(open_mi);
		file_menu.add(save_mi);

		menu_bar.add(file_menu);
		menu_bar.add(edit_menu);

		setMenuBar(menu_bar);

		add(t);

		open_mi.addActionListener(this);
		save_mi.addActionListener(this);
		copy_mi.addActionListener(this);
		paste_mi.addActionListener(this);
		test.addItemListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		t.setText("You Clicked " + ae.getActionCommand()+" Menu");
	}
	public void itemStateChanged(ItemEvent ob)
	{
		t.setText("You Checked : "+test.getState());
	}
	public static void main(String args[])
	{
		MenuDemo m=new MenuDemo();
	}
}	
		


		
		