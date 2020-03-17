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
    
  ## String Builder and String Buffer Class in Java
  
     The String class in java is immutable by default i.e once the object of the class is created it cannot be changed
     
     eg: 
      String s1="Hi";
      String s2=s1.reverse();
      
   This gives an error as the **object** of **string** class **(s1)** cannot be altered 
   
   Hence we have to use the String Builder and the String Buffer Classes which allow us to modify the strings and use them
   
   https://javadevnotes.com/java-integer-to-string-examples/
   
   https://raw.githubusercontent.com/HariPranav/Java/master/strings.png
   
   https://youtu.be/gy1uve2BwG8
   
   https://www.quora.com/Why-dont-we-have-a-reverse-function-in-java-lang-String
   
      ##CODE
        int a =121;

        String s1=Integer.toString(a);
        System.out.println(a);
        String s2=new StringBuilder(s1).reverse().toString();
        
        System.out.println(s2);

        if(s1.compareTo(s2)==0)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not equal");
        }
        
## String Args[] in java

  We can pass command line arguments during the execution of the program using the args 
  
  eg : psvm(String []args)
      {
        System.out.println("the command line args are" + a[0]);
       }
       
       $ javac file1.java -> generates the .class fike
       $ java file1 (send the args) 10
       $ the command line args are 10
