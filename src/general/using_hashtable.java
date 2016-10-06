import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;


public class using_hashtable 
{
	public static void main(String args[])
	{
		String str="";
	//	Double dbleval="";
		
		Hashtable<String,Double> balance=new Hashtable<String,Double>();
		balance.put("John Doe",343.34);
		balance.put("Shivam singh ratan",34.34);
		balance.put("Ramesh Katkar",534.112);
		balance.put("Hemant Rathi",343.44);
		balance.put("Ratnesh Mani",433.22);
		
		System.out.println("************Printing with Enumeration*****************");
		Enumeration<String> keyiterate=balance.keys();
		while(keyiterate.hasMoreElements()){
			str=keyiterate.nextElement();
			System.out.println(str+" "+balance.get(str));
		}
		
		double dbval=balance.get("Shivam singh ratan");
		dbval+=1000;
		balance.put("Shivam singh ratan",dbval);
		
		System.out.println("*************Printing with Iterator*****************");
		Iterator mineIterator=balance.keySet().iterator();
		while(mineIterator.hasNext())
		{
			String string=mineIterator.next().toString();
		    double dbl_val=balance.get(string);
		    System.out.println(string+" "+dbl_val);
			
		}
	}
}
