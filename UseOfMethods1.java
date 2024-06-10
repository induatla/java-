public class UseOfMethods1
{
public static void main(String[]args)
{
System.out.println("Book Details");
System.out.println("****************************************");
BookDetails("WINGS OF FIRE",50,250,4.5f);
System.out.println("-----------------------------------------");
BookDetails("WINGS for Freedom",50,350,4.0f);
System.out.println("Author Details");
System.out.println("******************************************");
AuthorDetails("ABDUL KALAM","Autobiography",15,9440721666l);
System.out.println("Name of the library:"+Library());
}
public static void BookDetails(String bookname, int copies, int cost, float rating)
{
System.out.println("Name of the book:"+bookname);
System.out.println("Number of Copies:"+copies);
System.out.println("Cost of the book:"+cost);
System.out.println("Rating for the book:"+rating);
}
public static void AuthorDetails(String name, String type, int experience, long contact)
{
System.out.println("Name of the author:"+name);
System.out.println("type:"+type);
System.out.println("Experience:"+experience);
System.out.println("Contact:"+contact);
}
public static String Library()
{
  return "historical library";
}
}
//===================================================================================================
D:\01CJ\01JB>javac  UseOfMethods1.java

D:\01CJ\01JB>java  UseOfMethods1
Book Details
****************************************
Name of the book:WINGS OF FIRE
Number of Copies:50
Cost of the book:250
Rating for the book:4.5
-----------------------------------------
Name of the book:WINGS for Freedom
Number of Copies:50
Cost of the book:350
Rating for the book:4.0
Author Details
******************************************
Name of the author:ABDUL KALAM
type:Autobiography
Experience:15
Contact:9440721666
Name of the library:historical library