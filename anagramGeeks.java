/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/anagram/0
// the code is working fine for only few test cases , i have used 2 methods both dont pass the test cases
// the first is with Arrays.sort and the other is without the sort function
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	String s=sc.nextLine();
	    	String s1=sc.nextLine();
	    	char c[]=s.toCharArray();
	    	char c2[]=s.toCharArray();
	    	Arrays.sort(c);
	    	Arrays.sort(c2);
	    	String s3=new String(c);
	    	String s4=new String(c2);
	    	
	    	if(s3.compareTo(s4)==0)
	    	{
	    	        System.out.println("YES");
	    	}
	    	else
	    	{
	    	        System.out.println("NO");
	    	}
	    	
	}
}
	    	    
	   // 	int a[]=new int[256];
	    	
	   // 	for(char c:s.toCharArray())
	   // 	{
	   // 	    int index=(int)c;
	   // 	    a[index]++;
	   // 	}
	   // 	for(char c:s1.toCharArray())
	   // 	{
	   // 	    int index=(int)c;
	   // 	    a[index]--;
	   // 	}
	   //     for(int i=0;i<256;i++)
	   //     {
	   //         if(a[i]!=0)
	   //         {
	   //             System.out.println("NO");
	   //             return;
	   //         }
	   //         else
	   //         {
	   //             continue;
	   //         }
	   //     }
// 	   //     System.out.println("YES");
	   
	        
// }
// }
