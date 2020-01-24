package searchappli;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Sqlconnect implements ActionListener  {
	Connection cnx;
	PreparedStatement st;
	ResultSet rs;
	Swingsearch S;
	
	public void actionPerformed(ActionEvent arg0) {
		String str= S.tf.getText();
		String chaine="jdbc:mysql://localhost:3306/gestion?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("chargement driver avec succés");
			} catch (ClassNotFoundException e) {
				System.out.println("prb de driver");
				e.printStackTrace();
			}
			try {
				cnx=DriverManager.getConnection(chaine, "root", "");
				System.out.println("connection avec succés");
			} catch (SQLException e) {
				System.out.println("prb de connection");
				e.printStackTrace();
			}
			try {
				st= cnx.prepareStatement("select *from etudiant where nom=?");
				st.setString(1, str);
				rs=st.executeQuery();
				if(rs.next()) {
					//recuperer les resultats de database qui correspond à entername
					String s1=rs.getString(1);
					String s2=rs.getString(2);
					String s3=rs.getString(3);
					String s4=rs.getString(4);
					String s5=rs.getString(5); 
					//put the results in every application's textfield
					S.tf1.setText(s1);
					S.tf2.setText(s2);
					S.tf3.setText(s3);
					S.tf4.setText(s4);
					S.tf5.setText(s5);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "not found");
				}
				
				} catch (SQLException e) {
				System.out.println("there is a mistake in preparestatement");
				e.printStackTrace();
			}
			
			
		
		}
	public Sqlconnect(Swingsearch w) {
		S=w;
		
	}
	

}
