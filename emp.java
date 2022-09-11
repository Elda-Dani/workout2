import java.io.*;
import java.util.*;
class employee
{
static int empno;
static double salary, totalsalary;

employee(double salary)
{
empno++;
this.salary=salary;
totalsalary=salary+totalsalary;
}
void show()
{
System.out.println("Employee number " +empno);
System.out.println("total salary " +totalsalary);
}
}

public class emp
{
public static void main(String args[])
{
float s1,s2,s3,s4;
System.out.println("Enter first person salary");
Scanner s = new Scanner(System.in);
s1=s.nextFloat();
employee e1=new employee(s1);
e1.show();
System.out.println("Enter second person salary");
s2=s.nextFloat();
employee e2=new employee(s1);
e2.show();
System.out.println("Enter third person salary");
s3=s.nextFloat();
employee e3=new employee(s1);
e3.show();
System.out.println("Enter fourth person salary");
s4=s.nextFloat();
employee e4=new employee(s1);
e4.show();
}
}