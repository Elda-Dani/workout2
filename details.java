import java.util.*;
class employee
{
int empid;
float ass1,ass2,ass3,percentage;
String name,result;
Scanner s=new Scanner(System.in);
employee()
{

System.out.println("enter name ");
name=s.nextLine();
System.out.println("enter employeeid ");
empid=s.nextInt();
System.out.println("enter 3 marks ");
ass1=s.nextFloat();
ass2=s.nextFloat();
ass3=s.nextFloat();
System.out.println("name : "+name);
System.out.println("id : "+empid);
}

void check()
{
if(percentage>=70)
{
System.out.println("Promoted ");
}
else
{
System.out.println("Not promoted ");
}
}
void marks()
{
result=ass1+ass2+ass3;
System.out.println("Result : "+result);
percentage=(result/300)*100;
System.out.println("Percentage : "+percentage);
}
}

public class details
{
public static void main(String args[])
{
employee emp =new employee();
emp.marks();
emp.check();
}
}