import java.util.*; 
class swapval
{
int a,b;

swapval()
{
}
swapval(int i,int j)
{
a=i;
b=j;
}
void swap(int a,int b)
{
int c=a;
a=b;
b=c;
}
void swapref(swapval val)
{

System.out.println("before swapping a is "+a+ " and b is "+b);
int c;
c=val.a;
val.a=val.b;
val.b=c;
System.out.println("after swapping a is "+a+ " and b is "+b);
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a and b");
int x=s.nextInt();
int y=s.nextInt();
swapval s1=new swapval();
System.out.println("before swapping a is "+x+ " and b is "+y);
s1.swap(x,y);
System.out.println("after swapping a is "+x+ " and b is "+y);
swapval s2=new swapval(x,y);
s2.swapref(s2);
}
}