import java.util.*;
class mathfunctiond 
{
float multiply(int x,int y)
{
System.out.println("x and y= "+x+ ","+y);
return x*y;
}
float multiply(float a,float b)
{
System.out.println("a and b= "+a+ ","+b);
return a*b;
}
float multiply(int x,float a)
{
System.out.println("x and a= "+x+ ","+a);
return x*a;
}
}
public class MathFunction
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter x and y: ");
int x=s.nextInt();
int y=s.nextInt();
System.out.println("Enter a and b: ");
float a=s.nextFloat();
float b=s.nextFloat();

mathfunctiond f=new mathfunctiond();
float result;
result=f.multiply(x,y);
System.out.println("two integer values ="+result);
result=f.multiply(a,b);
System.out.println("two floating values ="+result);
result=f.multiply(x,a);
System.out.println("two values ="+result);
}
}