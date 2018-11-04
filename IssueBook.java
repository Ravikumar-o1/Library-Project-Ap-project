import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class IssueBook
{
	String callno,mail,name,contact;
	String date;
	IssueBook(String callno,String mail,String studentname,String contact)
	{
		this.callno=callno;
		this.mail=mail;
		this.name=studentname;
		this.contact=contact;
		DateTimeFormatter a =DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime b = LocalDateTime.now();
		this.date =a.format(b);


	}
}