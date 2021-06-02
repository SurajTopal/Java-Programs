import javax.swing.*;
  class Scrollbar extends JFrame
  {
     JFrame j;
     Scrollbar()
	 {
		 j= new JFrame();
       JScrollBar sb=new JScrollBar();
       sb.setBounds(50,50,100,50);
       add(sb);
        setSize(300,300);
		setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	 }
  
    public static void main(String args[])
	{ 
	     new Scrollbar();
	}
  }