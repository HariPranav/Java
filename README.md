# Java
This repository holds the practise questions and the logic to solve them

Some important observations :

1. The difference between length and length() methods 

  - > length is used to find the size of the **array**  and not an *integer* value
      Eg : a[50] , int size = a.length;
  
  - > length() is used to find the size of the **String** or the String Builder Class
      Eg : a , int size = a.length();
      
 1.a The difference between next() and nextLine()
    
   ->next()  : It the input with **space** as a delimiter whereas
   ->nextLine() : It  takes the input with **enter** as the delimiter
      
 
2. Difference bw read() and readLine() for  string input 

  - > The read() method is used to read an input with **space** as a *delimiter
  - > The readLine() method is used to read an input with **enter** as the delimiter where enter is *\n
  
  The main issue was that readLine does not wait for the user input and completes the execution of the code .
  
  
3. Difference bw BufferedReader and Scanner class :

 - > Type of Data
                - > BR can read only strings and it need not be parsed
                - > Sc can read all types of data and it can be parsed
 - > Memory 
          - > BR has more memory i.e 8Kb
          - > Sc has lesser memory i.e 1Kb
          
 - > When to use 
 
          - > Sc is used when we read small amounts of data
          - > BR is used when we read large amount of data
          
 - > BR is synchronised and it throws exceptions where the SC is not hence we prefer BR and it is better for multithreading applications 

# Strings

  - > The String class is *immuatable* in nature and is *fixed in length*
  - > The *StringBuffer* class in java is *mutable* in nature and is *not fixed in length* , The main difference b/w StringBuilder and                StringBuffer is That the StringBuffer is *synchronised* and is *Thread Safe* when compared to StringBuilder
  - > *The StringBuilder* class in java is *mutable* in nature and the *length can also be altered*
  
  
  ### toString() 
  
  - > Every object created in java will have a toString() method which prints the class name along with the hashcode .
  - > But if we want the actual value of the string object we must overide the toString() method .
  
  ## System
  
    we need to use java.util.lang , to access System.out.println
