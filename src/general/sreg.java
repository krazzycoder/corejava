
public class sreg 
{
	
	
  public static void main(String args[])
  {
     String str="Hii my friend how are you & what's going on i'm here to do everything for you so always be detective in your condition & be careful for what's happening now in your world";
   /* int a=str.codePointAt(0);
    
    char charofstr=(char)a;
    System.out.println("The Unicode point at 3 is "+charofstr);
  
   int mynum=str.offsetByCodePoints(0,32);
   System.out.println("The offsetpoint of 32 is"+mynum);
   
   */
   
   String splitarr[]=str.split(" ",4);
   for(int i=0;i<splitarr.length;i++){System.out.println("The splitarr "+i+"th element is "+splitarr[i]);}
 
    CharSequence subseq=str.subSequence(0,5);
    System.out.println("the value of the subseq is "+subseq);
    
    System.out.println(String.valueOf(true));
  
  }
}
