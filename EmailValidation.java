import java.util.regex.*;    
import java.util.*;   
public class EmailValidation {

	public static void main(String[] args) {
		 ArrayList<String> emails = new ArrayList<String>();  
	        emails.add("Raji@domain.co.in");  
	        emails.add("Rama@domain.com");  
	        emails.add("Lakshmi.name@domain.com");  
	        emails.add("Anitha#@domain.co.in");  
	        emails.add("Revathi@domain.com");  
	        emails.add("Bharahi@domaincom");
	        emails.add("@Yahoo.com");
	        emails.add("Raji#domain.com");
	         
	        String regex = "^(.+)@(.+)$";  
	        Pattern pattern = Pattern.compile(regex);  
	        for(String email : emails){  
	        Matcher matcher = pattern.matcher(email);  
	        System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  
	    }  
	 
}


