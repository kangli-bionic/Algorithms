package uva;

import java.util.Scanner;

public class SubPrime {
    public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
    	 int Banks,Debetures,db,cb,v;    
         boolean flag;  
         while(true) {
        	  Banks = in.nextInt(); 
        	  Debetures = in.nextInt();
        	  if(Banks==0 && Debetures==0)
        		  break;
              int[] b = new int[Banks];  
              for(int i = 0; i < Banks; i++) {  
                   b[i] = in.nextInt();  
              }    
              for(int i = 0; i < Debetures; i++) {  
                   db = in.nextInt();  
                   cb = in.nextInt();  
                   v = in.nextInt();                    
                   b[db - 1] -= v;  
                   b[cb - 1] += v;
              }  
              flag=true;
              for(int i = 0; i < Banks; i++) {  
                   if(b[i] < 0) {  
                	    flag=false;
                	    break;
                   }  
              }  
              if(flag)
                System.out.println("S");   
              else
            	System.out.println("N");     
         }  
	}
}





