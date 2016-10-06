import java.util.Enumeration;
import java.util.Vector;


public class using_vector 
{
	public static void main(String args[])
	{
		Vector<Integer> vector=new Vector<Integer>(3,2);
		System.out.println("Initial Size"+vector.size());
		System.out.println("Initial increment value"+vector.capacity());
		
		vector.addElement(1);
		vector.addElement(2);
		vector.addElement(3);
		vector.addElement(4);
		
		System.out.println("Capacity after four addition "+vector.capacity());
		vector.addElement(5);
		System.out.println("Capacity after fifth addition "+vector.capacity());
		vector.addElement(6);
		System.out.println("Capacity after sixth addition "+vector.capacity());
		for(int i=7;i<12;i++)
			vector.add(i);
		
		System.out.println("First Element ="+vector.firstElement()+" Last Element ="+vector.lastElement());
		System.out.println(vector.indexOf(3)+"");
	
		//if vector contains 11 or not
		if(vector.contains(11))
			System.out.println("Vector contains 11");
		else
			System.out.println("Vector does not contains 11");
		
		//checking for containcy of 12 or not
		if(vector.contains(13))
			System.out.println("Vector contains 13");
		else 
			System.out.println("Vector does not contains 13");
		
		Enumeration<Integer> myiterator=vector.elements();
		while(myiterator.hasMoreElements())
			System.out.print(myiterator.nextElement()+" ");
		
		
		
		
		
	}
}
