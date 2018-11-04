
import java.util.*;
public class ReturnBookDao {

	public static int delete(String bookcallno,String studentmail)
	{
		Iterator it =Library.ib.iterator();
		while(it.hasNext())
		{
			IssueBook a =(IssueBook)it.next();
			if((a.callno).equals(bookcallno) && studentmail.equals(a.mail))
			{
				it.remove();
				update(bookcallno);
				return 1;
			}
		}
		return 0;
	}

	public static  void update(String bookcallno)
	{
		Iterator it =Library.bk.iterator();
		while(it.hasNext())
		{
			Book a =(Book)it.next();
			if((a.callno).equals(bookcallno))
			{
					a.quantity+=1;
					break;
			}

		}
	}
	
}
