package com.epam.tdd_junit;

public class remove {
	 public static String charRemoveAt(String str, int p) {  
		 
         return str.substring(0, p) + str.substring(p + 1);  
      }  
public String func(String in)
{
	String res=in;
	if(in.length()==0)
		return res;
	else if(in.length()==1&&in.charAt(0)!='A')
		return res;
	else if(in.length()==1&&in.charAt(0)=='A')
	return charRemoveAt(res,0);
		
	if(in.charAt(0)=='A'&&in.charAt(1)=='A')
	{
		res=charRemoveAt(res,0);
		res=charRemoveAt(res,0);
	}
	
	else if(in.charAt(0)=='A')
	          {
		         res=charRemoveAt(res,0);
	          }
	else if(in.charAt(1)=='A')
	          {
		         res=charRemoveAt(res,1);
	          }
	
			
	
	
	
	
	return res ;
}
}
