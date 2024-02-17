package minipro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BillingDao {
	public static boolean showAllBilling() {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="select * from billing";
			Statement stmt=con.createStatement();
			
			stmt.executeQuery(q);
			
			ResultSet set= stmt.executeQuery(q);
			
			while(set.next()) {
				int id=set.getInt(1);
				double units=set.getDouble(2);
				String pay_dnt=set.getString(3);
				String acc_no=set.getString(4);
				/*
				System.out.println("Bill No: "+id);
				System.out.println("Units Consumed: "+units);
				System.out.println("Payment Date & Time: "+pay_dnt);
				System.out.println("Account Number: "+acc_no);
				System.out.println("++++++++++++");
				*/
				String finalid="Bill No: "+id;
				String finalunits="Units Consumed: "+units;
				String finalpayment="Payment Date & Time: "+pay_dnt;
				String finalacc="Account Number: "+acc_no;
				
				String finall=finalid+"\n"+finalunits+"\n"+finalpayment+"\n"+finalacc+"\n"+"++++++++\n";
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

