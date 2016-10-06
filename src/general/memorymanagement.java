public class memorymanagement 
{
	public static void main(String args[])
	{
		Runtime runtime=Runtime.getRuntime();
		long mem1,mem2;
		
		System.out.println("The free memory at beginning is "+(runtime.freeMemory()/(1024*1024)));
		
		Integer someints[]=new Integer[1000];
		//System.out.println("The value of someints[0] is "+someints[0]);
		System.out.println("Total memory "+(runtime.totalMemory()/(1024*1024))+" MB");
		
		mem1=runtime.freeMemory();
		System.out.println("Initial Free memory is "+(mem1/(1024*1024))+" MB");
		
		runtime.gc();
		
		mem1=runtime.freeMemory();
		System.out.println("Free memory after garbage collection "+(mem1/(1024*1024))+" MB");
		
		for(int i=0;i<1000;i++)
			someints[i]=new Integer(i);
		
		
		mem2=runtime.freeMemory();
		System.out.println("The total allocated memory is "+((mem1-mem2)/(1024*1024))+" MB");
		
		for(int i=0;i<1000;i++)
			someints[i]=null;
		
		runtime.gc();
		
		mem2=runtime.freeMemory();
		System.out.println("The total Free memory after garbage collection "+(mem2/(1024*1024))+" MB");
		
		
		
		
		
		
		
	}
	
}
