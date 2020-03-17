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

## Pointers vs References

  C++ Note: Many people mistakenly believe that Java obect variables behave like C++ references. Butin C++ there are no null references, and references cannot be assigned. You should think of Java object variables as analolous to object pointers in C++. For example,
    Date birthday; // Java
is really the same as
    Date* birthday // C++
Once you make this association, everything falls into place. Of course, a Date* pointer isn't initialised until you initialise it with a call to new. The syntax is almost the same in C++ and Java.
    Date* birthday = new Date(); // C++
If you copy one variable to another, then both variables refer to the same date—they are pointers to the same object. The equivalent of the Java null reference is the C++ NULL pointer.
All Java objects live on the heap. When an object contains another object variable, that variable still contains just a pointer to yet another heap object.
In C++, pointers make you nervous because they are so error prone. It is easy to create bad pointers or to mess up memory management. In Java, these problems simply go away. If you use an unitialised pointer, the runtime system will reliably generate a runtime error instead of producing random results. You don't worry about memory management, because the garbage collector takes care of it.


Java doesn’t have pointers; Java has references.
Reference: A reference is a variable that refers to something else and can be used as an alias for that something else.
Pointer: A pointer is a variable that stores a memory address, for the purpose of acting as an alias to what is stored at that address.
So, a pointer is a reference, but a reference is not necessarily a pointer. Pointers are a particular implementation of the concept of a reference, and the term tends to be used only for languages that give you direct access to the memory address.

Let’s discuss some keypoints about pointers and references in context of C/C++ and Java:

    C/C++ allows pointer arithmetic but Java Pointers (References) not: The term “pointer” is strongly associated with the C/C++ concept of pointers, which are variables which store memory addresses and can be modified arithmetically to point to arbitrary addresses.
    In Java, pointers only exist as an implementation detail for References. A copy of the reference is copied to the stack of a called function, pointing to the same object as the calling function and allowing you to manipulate that object. However you cannot change the object the calling function refers to.
    Java doesn’t support pointer explicitly,  But java uses pointer implicitly: Java use pointers for manipulations of references but these pointers are not available for outside use. Any operations implicitly done by the language are actually NOT visible.
    Pointers can do arithmetic, References can’t: Memory access via pointer arithmetic is fundamentally unsafe and for safe guarding, Java has a robust security model and disallows pointer arithmetic for this reason. Users cannot manipulate pointers no matter what may ever is the case.
    Pointing objects: In C, we can add or subtract address of a pointer to point to things. In Java, a reference points to one thing only. You can make a variable hold a different reference, but such c manipulations to pointers are not possible.
    References are strongly typed:  Type of a reference is much more strictly controlled in Java than the type of a pointer is in C. In C you can have an int* and cast it to a char* and just re-interpret the memory at that location. That re-interpretation doesn’t work in Java: you can only interpret the object at the other end of the reference as something that it already is (i.e. you can cast a Object reference to String reference only if the object pointed to is actually a String).
    Manipulation of pointers can be dangerous:  On one hand, it can be good and flexible to have control over pointers by user but it may also prove to be dangerous. They may turn out to be big source of problems, because if used incorrectly they can easily break assumptions that your code is built around. And it’s pretty easy to use them incorrectly.
