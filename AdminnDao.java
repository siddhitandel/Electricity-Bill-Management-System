package minipro;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class AdminnDao {
	public static boolean insertAdminnToDB(Adminn st){
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="insert into adminn(admin_name,password,elec_board_id) values (?,?,?)";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of the parameters
			pstmt.setString(1, st.getAdminnName());
			pstmt.setString(2,st.getPassword());
			pstmt.setInt(3, st.getBoardId());
			//execute
			pstmt.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteAdminn(int userId) {
		// TODO Auto-generated method stub
			boolean f=false;
			try {
				//jdbc code...
				Connection con=CP.createC();
				String q="delete from adminn where admin_id=?";
				//PreparedStatement
				PreparedStatement pstmt=con.prepareStatement(q);
				//set the values of the parameters
				pstmt.setInt(1, userId);
				
				//execute
				pstmt.executeUpdate();
				f=true;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return f;
	}
	
	public static boolean updateAdminnToDB(int userId, Adminn st){
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="update adminn set admin_name=?, password=?, elec_board_id=? where admin_id=?";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of the parameters
			pstmt.setString(1, st.getAdminnName());
			pstmt.setString(2,st.getPassword());
			pstmt.setInt(3, st.getBoardId());
			pstmt.setInt(4, userId);
			//execute
			pstmt.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public static boolean showAllAdminn() {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="select * from adminn";
			Statement stmt=con.createStatement();
			
			stmt.executeQuery(q);
			
			ResultSet set= stmt.executeQuery(q);
			
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String password=set.getString(3);
				int board=set.getInt(4);
				/*
				System.out.println("Admin ID: "+id);
				System.out.println("Admin Name: "+name);
				System.out.println("Admin Password: "+password);
				System.out.println("Electricity Board ID: "+board);
				System.out.println("++++++++++++");
				*/
				String finalid="AdminID: "+id;
				String finalname="Admin Name: "+name;
				String finalpassword="Password: "+password;
				String finalboard="Electricity Board ID: "+board;
				
				String finall=finalid+"\n"+finalname+"\n"+finalpassword+"\n"+finalboard+"\n"+"++++++++\n";
				Start.ret_str(finall);
			}
			f=true;
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
