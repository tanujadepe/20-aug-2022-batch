
		package collectionstudy;

		import java.util.ArrayList;
		import java.util.Iterator;
		import java.util.ListIterator;

		public class arraylistint 
		{

			public static void main(String[] args)
			{
				ArrayList<Integer> al =new ArrayList<>();
				
				
	
				al.add(1234);
			
				al.add(124);
				al.add(1000);
				al.add(23345);
				al.add(null);
				al.add(null);
				System.out.println(al);
				System.out.println(al.size());
				
				System.out.println(al.indexOf("velocity"));	
				//System.out.println(al);
				//al.set(4,34);
				System.out.println(al);
				
				System.out.println(al.lastIndexOf(al));
				System.out.println(al);
				System.out.println(al.isEmpty());
				System.out.println(al.contains(123));
				System.out.println(al.get(5));
				System.out.println(al);
				al.add(3,234567);
				System.out.println(al);
				al.remove(2);
				System.out.println(al);
				System.out.println("=========================for loop============================================");
				
				for (int i=0;i<=al.size()-1;i++)
				{
					System.out.println(al.get(i));
				}
				System.out.println("========================iterator============================================");	
			Iterator<Integer> it = al.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			System.out.println("=========================list iterator============================================");
			ListIterator<Integer> li = al.listIterator();
			while(li.hasNext())
			{
				System.out.println(li.next());
				
			}
			System.out.println("=========================for each loop============================================");
			for(Object a:al )
			{
				System.out.println(a);
			
			}
			}

		}
			

		

	}

}
