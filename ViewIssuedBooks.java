import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.util.*;

public class ViewIssuedBooks extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewIssuedBooks frame = new ViewIssuedBooks();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ViewIssuedBooks() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		String data[][]=null;
		//String column[]={"Number","Name","Author","Publisher","Quantity"};
		String column[]={"BookNumber","Studentmail","Student Name","Student Contact","Date "};
		
		int len=Library.ib.size();
		System.out.println(len);
		data = new String[len][5];
		Iterator it =Library.ib.iterator();
		int i=0;
		while(it.hasNext())
		{
			IssueBook a = (IssueBook)it.next();
			System.out.println(a.callno);
			data[i][0]=a.callno;
			data[i][1]=a.mail;
			data[i][2]=a.name;
			data[i][3]=a.contact;
			data[i][4]=a.date;
			i++;
		}

		table = new JTable(data,column);
		JScrollPane sp=new JScrollPane(table);
		
		contentPane.add(sp, BorderLayout.CENTER);
	}

}
