import java.io.*;

import java.util.*;

import converterspack.currency;
import converterspack.distance;

class conversion
{
public static void main(String args[])
{
currency c=new currency();
c.fnRead();
c.fnConvert();

distance d=new distance();
d.fnRead();
d.fnConvert();
}
}