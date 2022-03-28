public class whileLoopDemo
{
public static void main(String args[])	
{
int number=10;
String binary="";
while(number>0)
{
binary=binary+(number%2);

number=number/2;	
}
System.out.println(binary);	
	
}
	
	
	
	
}