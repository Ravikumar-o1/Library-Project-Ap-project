import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.util.*;


public class ViewBooks extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBooks frame = new ViewBooks();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewBooks() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		String data[][]=null;
		String column[]={"Number","Name","Author","Publisher","Quantity"};
		/*try{
			
			int rows=Library.bk.size();

			data=new String[rows][5];

			Iterator it = Library.bk.iterator();

			int count=0;
			while(rs.next()){
				for(int i=1;i<=cols;i++){
					data[count][i-1]=rs.getString(i);
				}
				count++;
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		*/
		int len=Library.bk.size();
		System.out.println(len);
		data = new String[len][5];
		Iterator it =Library.bk.iterator();
		int i=0;
		while(it.hasNext())
		{
			Book a = (Book)it.next();
			System.out.println(a.callno);
			data[i][0]=a.callno;
			data[i][1]=a.name;
			data[i][2]=a.author;
			data[i][3]=a.publisher;
			data[i][4]=" "+ a.quantity;
			i++;
		}

		table = new JTable(data,column);
		JScrollPane sp=new JScrollPane(table);
		
		contentPane.add(sp, BorderLayout.CENTER);
	}

}
