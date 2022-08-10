package Assistedprogram1;
import java.util.*;
public class Mapoperation {

	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "Raji");
		m.put(2, "Anitha");
		m.put(3, "Ashwin");
		m.put(4, "Vishalini");
		
		for (Map.Entry<Integer,String> val :m.entrySet()) {
 
           System.out.print(val.getKey() + " "+val.getValue());
           System.out.println();
		}
           LinkedHashMap<Integer,String> m1=new LinkedHashMap<Integer,String>();
           
           m1.put(1, "Raji");
   		   m1.put(2, "Anitha");
   		   m1.put(3, "Ashwin");
   		   m1.put(4, "Vishalini");
   		
   		for (Map.Entry<Integer,String> va :m1.entrySet()) {
    
              System.out.print(va.getKey() + " "+va.getValue());
              System.out.println();
       }
   		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(1, "Raji");
		t.put(2, "Anitha");
		t.put(3, "Ashwin");
		t.put(4, "Vishalini");
		
		for (Map.Entry<Integer,String> ta :t.entrySet()) {
 
           System.out.print(ta.getKey() + " "+ta.getValue());
           System.out.println();
		}
	}


}
