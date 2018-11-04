
import java.util.*;

public class IssueBookDao {
	

	public static boolean checkBook(String bookcallno)
	{
		boolean ans=false;
		Iterator it =Library.bk.iterator();
		while(it.hasNext())
		{
			Book a =(Book)it.next();
			if((a.callno).equals(bookcallno))
				{	

					if(a.quantity > 0)
					{
						a.quantity-=1;
						return true;
					}
					else
						return  false;
				}
		}

		return ans;
	}

		public static int save(String bookcallno,String studentmail,String studentname,String studentcontact)
		{
				
				IssueBook a = new IssueBook(bookcallno,studentmail,studentname,studentcontact);
				Library.ib.add(a);

				return 1;
		}



}