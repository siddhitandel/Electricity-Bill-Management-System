package minipro;
import java.sql.Statement;
import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class InvoiceDao {
	public static boolean showAllInvoice() {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			//jdbc code...
			Connection con=CP.createC();
			String q="select * from invoice";
			Statement stmt=con.createStatement();
			
			stmt.executeQuery(q);
			
			ResultSet set= stmt.executeQuery(q);
			
			while(set.next()) {
				int id=set.getInt(1);
				double units=set.getDouble(2);
				int bill_num=set.getInt(3);
				int elec_board_id=set.getInt(4);
				int tariff_id=set.getInt(5);
				/*
				System.out.println("Invoice No: "+id);
				System.out.println("Tax Amount: "+units);
				System.out.println("Bill Number: "+bill_num);
				System.out.println("Electricity Board ID: "+elec_board_id);
				System.out.println("Tariff ID: "+tariff_id);
				System.out.println("++++++++++++")
				 */
				String finalinvo="Invoice No: "+id;
				String finalname="Tax Amount: "+units;
				String finalbill="Bill Number: "+bill_num;
				String finalcity="Electricity Board ID: "+elec_board_id;
				String finalTar="Tariff ID: "+tariff_id;
				
				String finall=finalinvo+"\n"+finalname+"\n"+finalbill+"\n"+finalcity+"\n"+finalTar+"\n"+"++++++++\n";
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
