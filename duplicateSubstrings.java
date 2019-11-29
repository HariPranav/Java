// program to read the duplicate elements in a string 

// We have to split the string based on the spaces and then store the individual words in a string ARRAY object  ,in order to print this we need to print the array object hence 
// we need to overrider the toString() method instead we can use the built in method which is Array"s".toString(object);
import java.util.*;

class duplicate
{
    
   
        public static void main(String[] args)
	{
		String input="Welcome to Java Session Session Session"; 		//Input String	
		String[] words=input.split(" ");	//Split the word from String
		int wrc=1;							//Variable for getting Repeated word count
		
		for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
		{
			for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
			{
				
			if(words[i].equals(words[j]))	//Checking for both strings are equal
				{
					wrc=wrc+1;				//if equal increment the count
					words[j]="0";			//Replace repeated words by zero
				}
			}
			if(words[i]!="0")
			System.out.println(words[i]+"--"+wrc);	//Printing the word along with count
			wrc=1;
			
	     }  
     
}
}
