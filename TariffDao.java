package minipro;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class TariffDao {
	public static boolean insertTariffToDB(Tariff st){
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="insert into tariff(tariff_type,tariff_descp,admin_id) values (?,?,?)";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of the parameters
			pstmt.setDouble(1,st.getTariff_type());
			pstmt.setString(2, st.getTariff_desc());
			pstmt.setInt(3, st.getAdmin_id());
			//execute
			pstmt.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteTariff(int userId) {
		// TODO Auto-generated method stub
			boolean f=false;
			try {
				//jdbc code...
				Connection con=CP.createC();
				String q="delete from tariff where tariff_id=?";
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
	
	public static boolean updateTariffToDB(int userId, Tariff st){
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="update tariff set tariff_type=?, tariff_descp=?, admin_id=? where tariff_id=?";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of the parameters
			pstmt.setDouble(1,st.getTariff_type());
			pstmt.setString(2, st.getTariff_desc());
			pstmt.setInt(3, st.getAdmin_id());
			pstmt.setInt(4, st.getTariff_id());
			//execute
			pstmt.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public static boolean showAllTariff() {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="select * from tariff";
			Statement stmt=con.createStatement();
			
			stmt.executeQuery(q);
			
			ResultSet set= stmt.executeQuery(q);
			
			while(set.next()) {
				int id=set.getInt(1);
				double type=set.getDouble(2);
				String desc=set.getString(3);
				int admin=set.getInt(4);
				/*
				System.out.println("Tariff ID: "+id);
				System.out.println("Tariff Type: "+type);
				System.out.println("Description: "+desc);
				System.out.println("Admin ID: "+admin);
				System.out.println("++++++++++++");
				*/
				String finalid="Tariff ID: "+id;
				String finaltype="Tariff Type: "+type;
				String finaldesc="Description: "+desc;
				String finaladmin="Admin ID: "+admin;
				String finall=finalid+"\n"+finaltype+"\n"+finaldesc+"\n"+finaladmin+"\n"+"++++++++\n";
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

