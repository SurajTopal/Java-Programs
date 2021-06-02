import javax.swing.*;
import java.awt.event.*;
  class RadioButtonExample
  {
	   JFrame f;   
	   RadioButtonExample()
	   {	   
	   f =new  JFrame();
	   JRadioButton rb=new JRadioButton("Male");
	   JRadioButton rb1=new JRadioButton("Female");
       JRadioButton rb2=new JRadioButton("Other");
	   ButtonGroup bg=new ButtonGroup();
	   
	   
	   rb.setBounds(75,50,100,30);    
       rb1.setBounds(75,100,100,30);   
	   rb2.setBounds(75,150,100,30);
	   bg.add(rb);
	   bg.add(rb1);
	   bg.add(rb2);
   	   f.add(rb);
	   f.add(rb1);
	   f.add(rb2);
	   f.setSize(300,300);
	   f.setLayout(null);
	   f.setVisible(true);
	   
	   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
	    
		public static void main(String args[])
		{
		 new RadioButtonExample();  	
	    }
  }