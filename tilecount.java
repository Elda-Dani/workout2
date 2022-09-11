import java.util.*;
import java.io.*;
class tile
{
int length;
int area;
tile(int length)
{
this.length=length;
this.area=length*length;
}
int getarea()
{
return area;
}
}

class floor
{
int l;
int w;
floor(int l,int w)
{
this.l=l;
this.w=w;
}
void totaltiles(tile t1)
{
int tilearea=t1.getarea();
int floorarea=l*w;
int no_of_tiles=(floorarea/tilearea);
System.out.println("Number of tiles "+no_of_tiles);
}
}
class tilecount
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter length of the tile");
int length=s.nextInt();
tile t=new tile(length);
System.out.println("Enter length and width of the floor");
int l=s.nextInt();
int w=s.nextInt();
floor f=new floor(l,w);
f.totaltiles(t);
}
}