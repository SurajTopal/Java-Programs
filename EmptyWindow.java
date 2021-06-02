import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class EmptyWindow
{
    JFrame fr;
	public EmptyWindow()
	{
	fr=new JFrame("New Window");
	fr.setMinimumSize(new Dimension(500,400));
	fr.setDefaultCloseOpertaion(JFrame.EXIT_ON_CLOSE);
	fr.setVisible(true);
	}
	public static void main(String args[])
	{
	  EmptyWindow em=new EmptyWindow();
	}
}