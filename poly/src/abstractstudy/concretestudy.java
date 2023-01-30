package abstractstudy;

public class concretestudy extends abstractdemo
{

	public static void main(String[] args)
	{
	
concretestudy cc=new concretestudy();
cc.demo1();
cc.demo2();
cc.demo3();

	}
	
public void demo2()
{
	System.out.println("incomplete method of abstract class");
}
public void demo3()
{
	System.out.println("method of concrete class");
}
}
