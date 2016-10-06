import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class inputread 
{

	public static void main(String args[])
	{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String str;
		int i;
		int sum=0;
		
		System.out.println("Enter the number , 0 to quit!");
		do{
			try {
				str=buffer.readLine();
				i=Integer.parseInt(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				i=0;
			}
			
			sum+=i;
			
		System.out.println("The current sum is: "+sum);
		}while(i!=0);
	}
}
