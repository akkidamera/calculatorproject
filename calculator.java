public class calculator
{
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(string args[])
	{
		calculator cal=new calculator();
		System.out.println("the sum of the two numbers "+(cal.add(2,3)));
	}
}

