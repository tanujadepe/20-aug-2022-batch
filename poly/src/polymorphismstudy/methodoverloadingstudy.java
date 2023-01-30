package polymorphismstudy;

public class methodoverloadingstudy {

	public static void main(String[] args) 
	{
		methodoverloadingstudy m=new methodoverloadingstudy();
	
		m.addition();
		m.addition(6, 7);
		m.addition(3, 5.6f, 7);

	}
	public void addition()
	{
		int a=16;
		int b=56;
		int sum=a+b;
		System.out.println("sum="+sum);
	}
	
public void addition(int a,int b)
{
int sum=a+b;
System.out.println("sum="+sum);
}
public void addition(int c,float d, int x)
{
	float sum=c+d+x;
	System.out.println("sum="+sum);
}
}
