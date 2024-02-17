package minipro;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class CustomerDao {
	public static boolean insertCustomerToDB(Customer st){
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="insert into customer(cust_name,address,city) values (?,?,?)";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of the parameters
			pstmt.setString(1, st.getCustomerName());
			pstmt.setString(2,st.getCustomerAddress());
			pstmt.setString(3, st.getCustomerCity());
			//execute
			pstmt.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteCustomer(int userId) {
		// TODO Auto-generated method stub
			boolean f=false;
			try {
				//jdbc code...
				Connection con=CP.createC();
				String q="delete from customer where cust_id=?";
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
	
	public static boolean updateCustomerToDB(int userId, Customer st){
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="update customer set cust_name=?, address=?, city=? where cust_Id=?";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of the parameters
			pstmt.setString(1, st.getCustomerName());
			pstmt.setString(2,st.getCustomerAddress());
			pstmt.setString(3, st.getCustomerCity());
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
	
	public static boolean showAllCustomer() {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="select * from customer";
			Statement stmt=con.createStatement();
			
			stmt.executeQuery(q);
			
			ResultSet set= stmt.executeQuery(q);
			
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String address=set.getString(3);
				String city=set.getString("city");
				/*
				System.out.println("ID: "+id);
				System.out.println("Name: "+name);
				System.out.println("Address: "+address);
				System.out.println("City: "+city);
				System.out.println("++++++++++++");
				*/
				String finalid="ID: "+id;
				String finalname="Name: "+name;
				String finaladdress="Address: "+address;
				String finalcity="City: "+city;
				
				String finall=finalid+"\n"+finalname+"\n"+finaladdress+"\n"+finalcity+"\n"+"++++++++\n";
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
