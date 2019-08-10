import java.util.*;
import java.io.*;

class Coffee
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int rate_ofCoffee = sc.nextInt();
int %discount = sc.nextInt();
int count =0,
while(1)
{

rate_ofCoffee = rate_ofCoffee - %discount;
count++;
if(rate_ofCoffee == 0)
{
System.out.print(count);

}
}
}
}


