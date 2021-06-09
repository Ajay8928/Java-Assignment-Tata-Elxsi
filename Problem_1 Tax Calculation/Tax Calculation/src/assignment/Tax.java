package assignment;
import java.util.*;

public class Tax {
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float sum=0;
		System.out.println("Enter no. of Items");
		int items=sc.nextInt();
		for(int i=1;i<=items;i++)
		{
		   System.out.println("Enter the price of item "+i);
		   float price=sc.nextFloat();
		   sum=sum+price;
		}
		
		float tax=0;
        if(sum>=0&&sum<100)
        	tax=sum*0;
        else if(sum>=100&&sum<1000)
        	tax=(float) (sum*0.05);
        else if(sum>=1000&&sum<10000)
        	tax=(float) (sum*0.1);
        else if(sum>=10000&&sum<100000)
        	tax=(float) (sum*0.2);
        else if(sum>=100000)
        	tax=(float) (sum*0.3);
       
        System.out.println("Tax Amount is =" +tax);
      }

}
