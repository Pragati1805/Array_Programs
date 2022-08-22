
	
	class Item
	{
		int id,cost;
		String name;
		Item()
		{
			
		}
		Item(int i,int c,String n)
		{
			id=i;
			cost=c;
			name=n;
		}
		public String toString()
		{
			return "Item Id : "+id +" Item Cost : "+cost + " Item name : "+name;
		}
	}
	public class ArrayOfObject
	{
		public void displayItems(Item[]a)
		{
			for(Item i: a)
			{
				System.out.println(i);
			}
		}
	

	public static void main(String[] args)
	{
		
		Item[]a =new Item[3];
		a[0]=new Item(20,500,"Box");
		a[1]=new Item(30,1000,"Bottle");
		a[2]=new Item(40,1500,"NoteBook");
		ArrayOfObject o=new ArrayOfObject();
		o.displayItems(a);
	}

}
	                                                          