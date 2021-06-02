/**
    The program will recieve 3 English words inputs from STDIN
    These three words will be read one at a time, in three separate line
    The first word should be changed like all vowels should be replaced by %
    The second word should be changed like all consonants should be replaced by #
    The third word should be changed like all char should be converted to upper case
    Then concatenate the three words and print them
Other than these concatenated word, no other characters/string should or message should be written to STDOUT
For example if you print how are you then output should be h*wa@eYOU.
*/

//This program will not work for special symbol...


import java.util.Scanner;
public class VowelConst
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    String str=scan.nextLine();
	    char v[]={'a','e','i','o','u','A','E','I','O','U'};
	    char number[]={'1','2','3','4','5','6','7','8','9','0'};
	    String s[]=str.split(" ");
	    char vowel[]=s[0].toCharArray();
	    char consonant[]=s[1].toCharArray();
	    String result="";
	    boolean check;
	    for(int i=0;i<vowel.length;i++)
	    {
	        check=false;
	        for(int j=0;j<v.length;j++)
	        {
	            if(vowel[i]==v[j])
	            {
	                result=result+"%";
	                check=true;
	                break;
	            }
	        }
	        if(check==false)
	        {
	            result=result+vowel[i];
	        }
	    }
	    
	    for(int i=0;i<consonant.length;i++)
	    {
	        check=false;
	        for(int j=0;j<v.length;j++)
	        {
	            if(consonant[i]==v[j])
	            {
		             check=true;
		             break;
	            }
	            else if(consonant[i]==number[j])
	            {
	                check=true;
	                break;
	            }
	        }
	        if(check==true)
	        {
	            result=result+consonant[i];
	        }
	        else
	        {
	            result=result+"#";
	        }
	    }
	    
	    result=result+s[2].toUpperCase();
	    
	    System.out.println("Result : "+result);
	    
	}
}
