import javax.swing.*;
  class JOptionpane extends JFrame
  {
	  JFrame j;
	  JOptionpane()
	  {
	   JLabel l=new JLabel("Name");
       l.setBounds(50,50,100,50);
       add(l);	
       setSize(200,200);
	   setLayout(null);
       setVisible(true);
		  
	  }
    public static void main(String args[])
	{
     	new JOptionpane();   
	}
  }