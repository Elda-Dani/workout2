import java.io.*;
import java.util.*;
class application
{
static int count;
application()
{
count++;
}
public static void main(String args[])
{
application a1=new application();
application a2=new application();
application a3=new application();
application a4=new application();
application a5=new application();
application a6=new application();
System.out.println("Number of object " +count);
}
}