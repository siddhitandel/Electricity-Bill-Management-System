package minipro;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class AccounttDao {
	public static boolean insertAccounttToDB(Accountt st){
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="insert into accountt(rr_no,cust_id) values (?,?)";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of the parameters
			pstmt.setInt(1, st.getRr_no());
			pstmt.setInt(2,st.getCustomerId());
			//execute
			pstmt.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteAccountt(int userId) {
		// TODO Auto-generated method stub
			boolean f=false;
			try {
				//jdbc code...
				Connection con=CP.createC();
				String q="delete from accountt where acc_no=?";
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
	
	public static boolean updateAccounttToDB(int accno, Accountt st){
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="update accountt set rr_no=?, cust_id=? where acc_no=?";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of the parameters
			pstmt.setInt(1, st.getRr_no());
			pstmt.setInt(2,st.getCustomerId());
			pstmt.setInt(3, accno);
			//execute
			pstmt.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public static boolean showAllAccountt() {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="select * from accountt";
			Statement stmt=con.createStatement();
			
			stmt.executeQuery(q);
			
			ResultSet set= stmt.executeQuery(q);
			
			while(set.next()) {
				int acc_num=set.getInt(1);
				int RR_num=set.getInt(2);
				int custo_id=set.getInt(3);
				/*
				System.out.println("Account_No: "+acc_num);
				System.out.println("Registered Number: "+RR_num);
				System.out.println("Customer Id: "+custo_id);
				System.out.println("++++++++++++");
				*/
				
				String finalid="Account ID: "+acc_num;
				String rr="Registered Num: "+RR_num;
				String finalcust="Customer ID: "+custo_id;
				
				String finall=finalid+"\n"+rr+"\n"+finalcust+"\n"+"++++++++\n";
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

