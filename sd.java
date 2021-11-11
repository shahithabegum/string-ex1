import java.lang.*;
// import java.util.*;
class sd{
	public static void main(String arg[])
	 {
	   try{
                            // Stringbuffer
	               StringBuffer s=new StringBuffer("shaju");
		System.out.println(s.delete(1,3));
	          // stringbuilder
		StringBuilder s1=new StringBuilder("thara");
		System.out.println(s1.delete(1,3));
	          }
	        catch(Exception e)
	          { 
	             System.out.println(e);
	           }
	}
}