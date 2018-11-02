import java.util.*;
class customexception extends Exception
{
 customexception()
 {
  System.out.println("there is an error");
 }
} 
public class demo2
{
 public static void main(String[]se)
 {
  Scanner b=new Scanner(System.in);
  System.out.println("enter the subject");
  String a=b.next();
  System.out.println("enter the marks");
  String d=b.next();

  Scanner c=new Scanner(System.in);
  System.out.println("enter the subject");
  String f=c.next();
  System.out.println("enter the marks");
  String e=c.next();
  try
  {
   if(a.equals("java") && d.equals("90"))
   System.out.println("you are java marks is 90");
   
   if(f.equals("bigdata") && e.equals("95"))
   System.out.println("you are bigdata marks is 95"); 
   else
   throw new customexception();
  }
  catch(Exception k)
  {
   System.out.println();
  }
 }
}

