
public class Integernum 
{	
	public static void main(String args[])
	{
			Integer intval=new Integer(128);
			
			//Bitcount
			int bitcount=Integer.bitCount(intval);
			System.out.println("The bitcount of the integer is "+bitcount);
			
			//Byte byt=new Byte((byte)433);
			Byte bytt=intval.byteValue();
			System.out.println("The bytevalue() is "+bytt);
			
		    if(Integer.compare(23,43)>0)
		    {
		    	System.out.println("23 is greater than 43");
		    }
		    else
		    {
		    	System.out.println("43 is greater than 23");
		    }
			   
		    if(Integer.compare(23,23)==0)
		    	System.out.println("Equality Occurs !!!");
		    
		    
		    
		    String str=34+"";
		    int a=Integer.decode(str);
		    System.out.println("The integer value after decoding is "+a);
		    
			   
			String binarystr=Integer.toOctalString(234);
			System.out.println(binarystr);
			
			
			int num=15;
			String minstr8=Integer.toString(num,8);
			String minstr10=Integer.toString(num,10);
			String minstr16=Integer.toString(num,16);
			
			
			System.out.println("the Octal of num is "+minstr8);
			System.out.println("The Decimal of num is "+minstr10);
			System.out.println("The Hexa-Decimal of num is "+minstr16);
			
			
			
			char ch='$';
			char chstr=Character.toTitleCase(ch);
			
			System.out.println("The title case character is "+chstr);
			
	}

}
