import java.util.*;


class anagram
{
    public static void main(String[] args) {
        /*
        1) Input two strings 
        2)convert the two strings into character array
        3)sort the two character arrays
        4)compare the two strings after sorting
        */

        Scanner sc=new Scanner(System.in);
        System.out.println("INput the two strings to find anagram or not");
        String S1=sc.nextLine();
        String S2=sc.nextLine();

        char c1[]=S1.toCharArray();

        System.out.println(c1);
        char c2[]=S2.toCharArray();
        System.out.println(c2);

        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(c1);
        System.out.println(c2);

        String a2=new String(c1);
        String a3=new String(c2);

        if(a2.compareTo(a3) == 0)
        {
            System.out.println("THe strings are equal ");
        }
        else{
            System.out.println("The strings are not equal");
        }

        sc.close();
        

    }
}
