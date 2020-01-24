package searchappli;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swingsearch extends JFrame {
	
	public JLabel l;//enter name
	public JTextField tf,tf1,tf2,tf3,tf4,tf5;
	
	
	    public Swingsearch() {
	    	
	    super("Search Swing");
	    setSize(500, 500);
	   
		l=new JLabel("enter name :");//entername
		l.setBounds(20, 20, 100, 20);//n
		JButton b1=new JButton("search");//recherche
		b1.setBounds(50, 50, 100, 20);
		JLabel l1=new JLabel("cne");//cne
		l1.setBounds(20, 120, 100, 20);//c
		JLabel l2=new JLabel("nom");//nom
		l2.setBounds(20, 150, 100, 20);
		JLabel l3=new JLabel("prenom");//prenom
		l3.setBounds(20, 180, 100, 20);
		JLabel l4=new JLabel("note");//note
		l4.setBounds(20, 210, 100, 20);
		JLabel l5=new JLabel("notemoyenne");//notemoyenne
		l5.setBounds(20, 240, 100, 20);
	     tf=new JTextField();//textfield enter name
		tf.setBounds(130, 20, 200, 20);//n
		tf1=new JTextField();//textfield cne
		tf1.setBounds(130, 120, 200, 20);//c
	    tf2=new JTextField();//textfield nom
		tf2.setBounds(130, 150, 200, 20);
		tf3=new JTextField();//textfield prenom
		tf3.setBounds(130, 180, 200, 20);
		tf4=new JTextField();//textfield note
		tf4.setBounds(130, 210, 200, 20);
		tf5=new JTextField();//textfield fieldnotemoyenne
		tf5.setBounds(130, 240, 200, 20);
		
		getContentPane().setLayout(null);
		
		
		//ajout dans frame
		getContentPane().add(l);
		getContentPane().add(b1);
		getContentPane().add(l1);
		getContentPane().add(l2);
		getContentPane().add(l3);
		getContentPane().add(l4);
		getContentPane().add(l5);
		getContentPane().add(tf);
		getContentPane().add(tf1);
		getContentPane().add(tf2);
		getContentPane().add(tf3);
		getContentPane().add(tf4);
		getContentPane().add(tf5);
		
		tf1.setEditable(false);  
        tf2.setEditable(false);  
        tf3.setEditable(false);  
        tf4.setEditable(false);
        tf5.setEditable(false);
        
        b1.addActionListener(new Sqlconnect(this));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	
		
		
		
		
		
		
		
		
		
	}
	

}
