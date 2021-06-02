import java.awt.event.*;
import javax.swing.*;
class PasswordExample
{
   public static void main(String args[])
   {
      JFrame f=new JFrame("PasswordExample");
	  JLabel label=new JLabel("Nothing");
	  JPasswordField value=new JPasswordField();
	  JLabel l1=new JLabel("Username :");
	  JLabel l2=new JLabel("Password : ");
	  JButton b=new JButton("Login");
	  JTextField text =new JTextField();
	  
	  label.setBounds(20,150,200,50);
	  value.setBounds(100,75,100,30);
	  
	  
	  l1.setBounds(20,20,80,30);
	  l2.setBounds(20,75,80,30);
	  
	  b.setBounds(100,120,80,30);
	  
	  text.setBounds(100,20,100,30);
	  f.add(text);
	  f.add(value);
	  f.add(l1);
	  f.add(l2);
	  f.add(b);
	  f.add(label);
	  b.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent e)
		  {
			 String s=text.getText();
             label.setText(s);			 
		  }
	  });
	 
	  f.setSize(300,300);
	  f.setLayout(null);
	  f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}

