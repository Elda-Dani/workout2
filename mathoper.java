import java.util.*;
class mathoperation 
{
double r;
int x,y;
mathoperation()
{
}
void init()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the value of x");
x=s.nextInt();
System.out.println("enter the value of y");
y=s.nextInt();
}
void add()
{
int r=x+y;
System.out.println("added value is "+r);
}
void multiply()
{
int r=x*y;
System.out.println("multiplied value is "+r);
}
void power()
{
double r=Math.pow(x,y);
System.out.println("power is "+r);
}
void display()
{
add();
multiply();
power();
}
}
class mathoper
{
public static void main(String args[])
{
mathoperation d=new mathoperation();
d.init();
d.display();
}
}