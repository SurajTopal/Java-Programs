// Print all primitive DataType value using JOptionPane...
import javax.swing.JOptionPane;
public class PrintDataTypeValueJOptionPane
{
	public static void main(String[] args)
	{
	    		
    	   byte num1 = Byte.parseByte(JOptionPane.showInputDialog("Enter Byte value : "));
		  short num2 = Short.parseShort(JOptionPane.showInputDialog("Enter Short value : "));
		    int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter Int value : "));
		  float num4 = Float.parseFloat(JOptionPane.showInputDialog("Enter Float value : "));
		   long num5 = Long.parseLong(JOptionPane.showInputDialog("Enter Long value : "));
         double num6 = Double.parseDouble(JOptionPane.showInputDialog("Enter Double value : "));
           char ch   = JOptionPane.showInputDialog("Enter char value : ").charAt(0);
         String str  = JOptionPane.showInputDialog("Enter String value : ");		   
		  
	  System.out.println("--Print all Primitive Data Type Using JOptionPane...--");
	   System.out.println("Byte : "+num1);
	   System.out.println("Short : "+num2);
	   System.out.println("Int : "+num3);
	   System.out.println("Float : "+num4);
	   System.out.println("Long : "+num5);
	   System.out.println("Double : "+num6);
	   System.out.println("char : "+ch);
	   System.out.println("str : "+str);
		  }
}
