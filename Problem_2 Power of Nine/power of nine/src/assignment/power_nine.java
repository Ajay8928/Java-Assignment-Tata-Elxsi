package assignment;
import java.util.*;

public class power_nine {

	public static void main(String[] args) 
	{
	
       Scanner sc=new Scanner(System.in);
       boolean ans=false;
       System.out.println("Enter the number");
       int n=sc.nextInt();
       int temp=n;
       int sum=0;
       while(n>=9)
       {
    	   n=n/9;
    	   if(n==1)
    		   ans=true;
       }
       if(ans==true)
       System.out.println(ans+" "+temp+" is power of 9");
       else
       System.out.println(ans+" "+temp+" is not power of 9"); 
       
       
       
	}

}
