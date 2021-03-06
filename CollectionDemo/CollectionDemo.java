import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
/**
*Collection demo program
*@author:Amrut
*/

public class CollectionDemo 
{
	public static void main(String[] args) 
	{
		/*creating arraylist object*/
		ArrayList al=new ArrayList();
		System.out.println("ArrayList Examples");
		/*adding values to arraylist*/
		al.add("Amrut");
		al.add("10");
		al.add("Panda");
		al.add(null);
		System.out.println("initial arraylist"+al);//[Amrut, 10, Panda, null]
		/*get the value from second index*/
		System.out.println("2nd index value::"+al.get(2));//[Panda]
		/*set first index value*/
		al.set(1,20);
		System.out.println("After setting the 1st index value::"+al);//[Amrut, 20, Panda, null]
		/*remove value from arraylist*/
		al.remove(3);
		System.out.println("After removing 3rd indax value::"+al);
		System.out.println();

		/*creating linkedlist object*/
		LinkedList<String> ll=new LinkedList<String>();
		System.out.println("**********************************************");
		System.out.println("LinkedList Examples");
		ll.add("Amrut");
		ll.add("vijay");
		ll.add("pradeep");
		System.out.println("initial linkedlist::"+ll);
		/*set 1st index*/
		ll.set(1,"software");
		System.out.println("After setting 1st index::"+ll);
		/*remove element from last*/
		ll.removeLast();
		System.out.println("After removing last element::"+ll);
		/*adding element at first*/
		ll.addFirst("developer");
		System.out.println("After adding element at first::"+ll);
		System.out.println();

		/*creating vector object*/
		Vector<String> v=new Vector<String>(ll);
		System.out.println("**************************************************");
		System.out.println("initial capacity::"+v.capacity());
		/*adding element to vector*/
		v.addElement("Suresh");
		System.out.println("vector after adding elements::"+v);
		/*get first element*/
		System.out.println("first element is::"+v.firstElement());
		/*remove element from a specific index*/
		v.removeElementAt(1);
		System.out.println("After removing::"+v);
		System.out.println();

		/*creating stack object*/
		Stack<String> s=new Stack<String>();
		System.out.println("******************************************************");
		/*push elements into stack*/
		s.push("Amrut");
		s.push("raja");
		s.push("amit");
		System.out.println("initial stack::"+s);
		System.out.println("remove and return top of the stack::"+s.pop());
		System.out.println("After pop::"+s);
		System.out.println("Use peek to return top of the stack without removal::"+s.peek());
		System.out.println("find stack is empty or not::"+s.empty());
		System.out.println();

		/*creating hashset object*/
		HashSet<String> hs=new HashSet<String>(ll);
		System.out.println("*****************************************************");
		System.out.println(hs);
		/*adding elements to hash set*/
		hs.add("bikash");
		/*using cursor to iterate the values*/
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		/*add duplicate element*/
		hs.add("bikash");
		System.out.println("After adding duplicate element::"+hs);
		/*removing all the elements from hashset*/
		hs.removeAll(hs);
		System.out.println("After removing all the elements from hashset::"+hs);
		System.out.println();

		/*creating treeset object*/
		 TreeSet<String> set=new TreeSet<String>();
		 System.out.println("*************************************************************");
         	set.add("Amrut");  
         	set.add("Vijay");  
         	set.add("Ajay");  
         	System.out.println("Traversing element through Iterator in descending order");  
         	Iterator i=set.descendingIterator();  
        	 while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }
		/*creating hashmap object*/
		Map<Integer,String> hm=new HashMap<Integer,String>();
		System.out.println("***************************************************************");
      		hm.put(100,"Amit");    
      		hm.put(101,"Vijay");    
      		hm.put(102,"Rahul");   
      		System.out.println("Initial list of elements:"+hm);
		hm.replace(102, "Gaurav");
		System.out.println("After replacing 102 key value::"+hm);
		
		/*creating linkedhashmap object*/
		 Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();           
      		 lhm.put(100,"Amrut");    
     		 lhm.put(101,"Vijay");    
     		 lhm.put(102,"Rahul");    
      		 /*Fetching key*/  
       		 System.out.println("Keys: "+lhm.keySet());  
      		 /*Fetching value*/  
      		 System.out.println("Values: "+lhm.values());  
      		 /*Fetching key-value pair*/  
       		 System.out.println("Key-Value pairs: "+lhm.entrySet());
		 lhm.remove(102);  
   		 System.out.println("After invoking remove() method: "+lhm);
		
		/*creating hashtable object*/
		 Map<Integer,String> map=new Hashtable<Integer,String>();          
    		 map.put(100,"Amit");    
    		 map.put(102,"Ravi");   
    		 map.put(101,"Vijay");    
   	 	 map.put(103,"Rahul");    
    		 System.out.println("Initial Map: "+map);  
     		 /*Inserts, as the specified pair is unique*/  
    		 map.putIfAbsent(104,"Gaurav");  
    		 System.out.println("Updated Map: "+map);  
    		 /*Returns the current value, as the specified pair already exist*/  
    		 map.putIfAbsent(101,"Vijay");  
    		 System.out.println("Updated Map: "+map);  
	}
}
