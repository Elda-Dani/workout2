import java.util.*;
class rectangle
{
double l,b;
Scanner s=new Scanner(System.in);
rectangle()
{
System.out.println("enter length and breadth ");
l=s.nextDouble();
b=s.nextDouble();
}
rectangle(double x)
{
l=x;
b=x;
}

rectangle(double a, double c)
{
l=a;
b=c;
}

void getarea()
{
double area=l*b;
System.out.println("area of rectangle=" +area);
}

void getperimeter()
{
double perimeter=2*(l+b);
System.out.println("perimeter is" +perimeter);
}
public static void main(String args[])
{
rectangle r1= new rectangle();
rectangle r2= new rectangle();
r1.getarea();
r1.getperimeter();
r2.getarea();
r2.getperimeter();
}
}
