package minipro;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class ElecBoardDao {
	public static boolean insertElecBoardToDB(ElecBoard st){
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="insert into elec_board(elec_board_name) values (?)";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of the parameters
			pstmt.setString(1, st.getElec_board_name());
			
			//execute
			pstmt.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteElecBoard(int userId) {
		// TODO Auto-generated method stub
			boolean f=false;
			try {
				//jdbc code...
				Connection con=CP.createC();
				String q="delete from elec_board where elec_board_id=?";
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
	
	public static boolean updateElecBoardToDB(int userId, ElecBoard st){
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="update elec_board set elec_board_name=? where elec_board_id=?";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of the parameters
			pstmt.setString(1, st.getElec_board_name());
			pstmt.setInt(2, userId);
			//execute
			pstmt.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public static boolean showAllElecBoard() {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="select * from elec_board";
			Statement stmt=con.createStatement();
			
			stmt.executeQuery(q);
			
			ResultSet set= stmt.executeQuery(q);
			
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				/*
				System.out.println("Electricity Board ID: "+id);
				System.out.println("Electricity Board Name: "+name);
				System.out.println("++++++++++++");
				*/
				String finalid="Electricity Board ID: "+id;
				String finalname="Electricity Board Name: "+name;
								
				String finall=finalid+"\n"+finalname+"\n"+"++++++++\n";
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
