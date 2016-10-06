import java.io.IOException;


public class runtime 
{
	public static void main(String args[])
	{
		try {
		
			Process process=Runtime.getRuntime().exec("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe");
		    Runtime runtime=Runtime.getRuntime();
		    System.out.println("The free memory in the JVM is "+runtime.freeMemory());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
