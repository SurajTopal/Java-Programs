import javax.swing.*;
import java.awt.*;
import java..awt.event;
  class DialogExample
  {
   private static JDialog d;
    DialogExample()
	{
		JFrame f=new JFrame();
		d=new JDialog(f,"Dialog Example",true);
		d.setLayout(new FlowLayout());
		JButton b=new JButton ("OK");
		b.addActionListener (new ActionListener)
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  DialogExample.d.setVisible(false);
			  }
		});
		
		d.add(new JLabel ("Click button to Continue."));
		d.add(b);
		d.setSize(300,300);
		d.setVisible(true);
		
	}
  
  }
  