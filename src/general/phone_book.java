import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Properties;


public class phone_book 
{
	public static void main(String args[])
	{
		Properties prop=new Properties();
		BufferedReader buff_reader=new BufferedReader(new InputStreamReader(System.in));
		String name="",number="";
		FileInputStream fin=null;
		boolean changed=false;
		
		try {
			fin=new FileInputStream("phonebook.dat");
			if(fin!=null)
			{
				prop.load(fin);
				fin.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		
		//Let User enter the name & phonenumber of the specific name in specified directory
		do{
			System.out.println("Enter the new name ('enter \"quit\" word to stop entering')");
			try {
				name=buff_reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(name.equals("quit")) continue;
			
			System.out.println("Enter the number of entered name ");
			try {
				number=buff_reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			prop.put(name,number);
			changed=true;
			
			
		}while(!name.equals("quit"));
		
		
		if(changed)
		{
			try {
				FileOutputStream fout=new FileOutputStream("phonebook.dat");
				prop.store(fout,"Telephone Book");
				fout.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	//printing the directory
	System.out.println("Name Number");	
     Iterator myiterator=prop.keySet().iterator();
     while(myiterator.hasNext()){
    	 String str=myiterator.next().toString();
    	 String mynum=prop.get(str).toString();
    	 
    	 System.out.println(str+" "+mynum);
    	 
     }
		
		
	}
	
	
	
}
