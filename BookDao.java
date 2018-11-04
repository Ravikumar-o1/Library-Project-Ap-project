public class BookDao {
public static int save(String callno,String name,String author,String publisher,int quantity)
{
	Book a = new Book(callno,name,author,publisher,quantity);

	Library.bk.add(a);
	System.out.println(a.callno + "\n "+a.name);
	return 1;
}
}
