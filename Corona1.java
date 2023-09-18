import java.util.*;
class Corona1
{
String name;
String address;
String status;
void get_details()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter patient name");
name=sc.next();
System.out.println("Enter patient address");
address=sc.next();
System.out.println("Enter patient status");
status=sc.next();
}
void put_details()
{
System.out.println("*******************************");
System.out.println("*********vaccination details***");
System.out.println("patient name  :"+name);
System.out.println("patient address  :"+address);
System.out.println("patient status  :"+status);
}
public static void main(String args[])
{
Corona1 c1=new Corona1();
c1.get_details();
c1.put_details();
}
}




