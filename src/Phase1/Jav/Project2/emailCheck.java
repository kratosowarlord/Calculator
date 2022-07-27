package Phase1.Jav.Project2;
import java.util.Scanner;
import java.util.ArrayList;


public class emailCheck {
	



	
		
	    public static void main(String[] args) {
	    	
	    	
	    	
	        ArrayList<String> emailID = new ArrayList<String>();
	        
	        emailID.add("pranav@gmail.com");
	        emailID.add("sharma@hotmail.com");
	        emailID.add("karan@gmail.com");
	        emailID.add("rahul@gmail.com");
	        emailID.add("kunal@hotmail.com");
	        emailID.add("rishab@hotmail.com");
	        emailID.add("kartik@gmail.com");
	       
	     
	            String searchId = "kunal@hotmail.com";
	                
	                for(int i=0; i<emailID.size(); i++) {

	                    if(searchId==emailID.get(i)) {
	                        
	                        
	                        System.out.println("email ID - " + searchId + "         found");
	                        
	                        break;
	                  
	                    }
	                }
	                
	                
	    

	    }

	}


