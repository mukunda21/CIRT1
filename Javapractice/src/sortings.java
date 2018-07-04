import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;


public class sortings 
{
	

	
public void sorting(int[] k)
{
	int size=k.length;
	System.out.println("Size of the charccter is "+size);
	
	TreeSet t = new TreeSet();
for(int i=0;i<size;i++)
	{
		t.add(k[i]);
		
	}
	
System.out.println("The alphabet order is "+t);
}

public void alphasorting(char[] k)
{
	//this is my second commit
	//this is my second commit
	int size=k.length;

	Set<String> se=new HashSet<String>();
	
	HashMap<String, Integer> Geeks = new HashMap<String,Integer>();
	//HashMap<Integer, String> Geeks2 = new HashMap<Integer,String>();
	 int count=0;
	for(int i=0;i<size;i++)
	{
	
	       System.out.println(k[i]);
	       char cm=k[i];
	       //Geeks.put(""+cm,i);
	      //System.out.println(Geeks.containsValue(""+cm));
	       if(Geeks.containsKey(""+cm))
	       {
	    	   
	    	   Geeks.put(""+cm, Geeks.get(""+cm)+1);
	    	   System.out.println("number of character is "+count);
	       }
	       else
	       {
	    	   Geeks.put(""+cm, 1);
	       }
	       //count=0;
	      
	      
	}
		
	
	
	System.out.println(se);
	System.out.println(Geeks);
	System.out.println("Size of the charcter is "+size);
	
	
    Arrays.sort(k);	
    
    
    String s=new String(k);
    System.out.println("The alphabets are "+s);
	

}


public static void main(String[] args)
{
	int[] c={1,7,6,3,5,7,};
	String  words="welcome";
	
	char[] ch=words.toCharArray();
	 System.out.println(ch);
	 
	 
	sortings s=new sortings();
	s.sorting(c);
	s.alphasorting(ch);
}
}
