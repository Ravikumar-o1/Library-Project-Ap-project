import java.util.*;

public class LibrarianDao {

	
	public static int save(String name,String password,String email,String address,String city,String contact)
	{
		int status =0;
	
		Librarian a = new Librarian(name,password,email,address,city,contact);
			System.out.println(a.name);
		Library.lb.add(a);

		Iterator it=Library.lb.iterator();

		while(it.hasNext())
		{
			Librarian b = (Librarian)it.next();
				System.out.println(b.name);

		}

		return 1;

	}
	
	public static int delete(String mail){
		
			int l=Library.lb.size();
			Iterator it = Library.lb.iterator();
			int flg=0;
			while(it.hasNext())
			{
				Librarian a =(Librarian)it.next();
				if((a.email).equals(mail))
				{
					it.remove();
					flg=1;

					break;
				}
			}


			return flg;



		}


	public static boolean validate(String name,String password)
	{

		Iterator it =Library.lb.iterator();
		while(it.hasNext())
		{
			Librarian a = (Librarian)it.next();
			if((a.name).equals(name) && (a.password).equals(password))
				 return true;
		}

		return false;
	}

}
