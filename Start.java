package minipro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import package.com.studentmanage.*;

public class Start {
	public static String st1;
	public static final void ret_str(String st) {
		st1=st1+st+"\n";
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to operate on customer, 2 for account, 3 for billing, 4 for admin, 5 for electricity board, 6 for invoice and 7 for tariff:");
			int d=Integer.parseInt(br.readLine());
			switch(d){
				case 1:
				{	//customer
					System.out.println("Press 1 to ADD customer");
					System.out.println("Press 2 to Delete customer");
					System.out.println("Press 3 to display customer");
					System.out.println("Press 4 to update customer");
					System.out.println("Press 5 to exit app");
					
					int c=Integer.parseInt(br.readLine());
					
					if(c==1) {
						//add customer
						System.out.println("Enter customer name: ");
						String name=br.readLine();
						
						System.out.println("Enter customer address: ");
						String address=br.readLine();
						
						System.out.println("Enter customer city: ");
						String city=br.readLine();
						
						//create student object to store student
						Customer st= new Customer(name,address,city);
						boolean answer= CustomerDao.insertCustomerToDB(st);
						if(answer) {
							System.out.println("Customer is added successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
						System.out.println(st);
					}
					else if(c==2) {
						//delete Customer
						System.out.println("Enter Customer ID to delete");
						int userId=Integer.parseInt(br.readLine());
						boolean f=CustomerDao.deleteCustomer(userId);
						if(f) {
							System.out.println("Deleted Successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
					}
					else if(c==3) {
						//display Customer
						boolean f= CustomerDao.showAllCustomer();
						if(f) {
							System.out.println("Displayed Successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
					}
					else if(c==4) {
						//update student
						System.out.println("Enter Customer ID to update");
						int userId=Integer.parseInt(br.readLine());
						
						System.out.println("Enter customer name: ");
						String name=br.readLine();
						
						System.out.println("Enter customer address: ");
						String address=br.readLine();
						
						System.out.println("Enter customer city: ");
						String city=br.readLine();
						
						Customer st= new Customer(userId,name,address,city);
						boolean answer= CustomerDao.updateCustomerToDB(userId,st);
						if(answer) {
							System.out.println("Customer is updated successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
						System.out.println(st);
					}
					else {
						//exit
					}
				}
				break;
				
/*-----------------------------------------------------------------------------------*/
				
				case 2:
				{	//account
					System.out.println("Press 1 to ADD account");
					System.out.println("Press 2 to Delete account");
					System.out.println("Press 3 to display account");
					System.out.println("Press 4 to update account");
					System.out.println("Press 5 to exit app");
					
					int c=Integer.parseInt(br.readLine());
					
					if(c==1) {
						//add account
						System.out.println("Enter a registered number: ");
						int rr_num=Integer.parseInt(br.readLine());
						
						System.out.println("Enter customer id: ");
						int custoId=Integer.parseInt(br.readLine());
						
						//create account object to store account
						Accountt st= new Accountt(rr_num,custoId);
						boolean answer= AccounttDao.insertAccounttToDB(st);
						if(answer) {
							System.out.println("Account is added successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
						System.out.println(st);
					}
					else if(c==2) {
						//delete account
						System.out.println("Enter Account ID to delete");
						int accId=Integer.parseInt(br.readLine());
						boolean f=AccounttDao.deleteAccountt(accId);
						if(f) {
							System.out.println("Deleted Successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
					}
					else if(c==3) {
						//display account
						boolean f= AccounttDao.showAllAccountt();
						if(f) {
							System.out.println("Displayed Successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
					}
					else if(c==4) {
						//update account
						System.out.println("Enter Account Number to update");
						int accId=Integer.parseInt(br.readLine());
						
						System.out.println("Enter a registered number: ");
						int rr_num=Integer.parseInt(br.readLine());
						
						System.out.println("Enter customer id: ");
						int custoId=Integer.parseInt(br.readLine());
						
						Accountt st= new Accountt(accId,rr_num,custoId);
						boolean answer= AccounttDao.updateAccounttToDB(accId,st);
						if(answer) {
							System.out.println("Account is updated successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
						System.out.println(st);
					}
					else {
						//exit
					}
				}
				break;
				
/*-----------------------------------------------------------------------------------*/				
				
				case 3:
				{	//billing
					System.out.println("Press 1 to display billing");
										
					int c=Integer.parseInt(br.readLine());
					
					if(c==1) {
						//display billing
						boolean f= BillingDao.showAllBilling();
						if(f) {
							System.out.println("Displayed Successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
					}
					else {
						//exit
					}
				}
				break;
				
/*-----------------------------------------------------------------------------------*/				
				
				case 4:
				{	//admin
					System.out.println("Press 1 to ADD Admin");
					System.out.println("Press 2 to Delete Admin");
					System.out.println("Press 3 to display Admin");
					System.out.println("Press 4 to update Admin");
					System.out.println("Press 5 to exit app");
					
					int c=Integer.parseInt(br.readLine());
					
					if(c==1) {
						//add admin
						System.out.println("Enter Admin name: ");
						String name=br.readLine();
						
						System.out.println("Enter Admin password: ");
						String password=br.readLine();
						
						System.out.println("Enter electricity board ID: ");
						int boardId=Integer.parseInt(br.readLine());
						
						//create admin object to store admin
						Adminn st= new Adminn(name,password,boardId);
						boolean answer= AdminnDao.insertAdminnToDB(st);
						if(answer) {
							System.out.println("Admin is added successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
						System.out.println(st);
					}
					else if(c==2) {
						//delete admin
						System.out.println("Enter Admin ID to delete");
						int userId=Integer.parseInt(br.readLine());
						boolean f=AdminnDao.deleteAdminn(userId);
						if(f) {
							System.out.println("Deleted Successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
					}
					else if(c==3) {
						//display admin
						boolean f= AdminnDao.showAllAdminn();
						if(f) {
							System.out.println("Displayed Successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
					}
					else if(c==4) {
						//update admin
						System.out.println("Enter Admin ID to update");
						int AdminId=Integer.parseInt(br.readLine());
						
						System.out.println("Enter Admin name: ");
						String name=br.readLine();
						
						System.out.println("Enter Admin password: ");
						String password=br.readLine();
						
						System.out.println("Enter electricity board ID: ");
						int boardId=Integer.parseInt(br.readLine());
						
						Adminn st= new Adminn(AdminId,name,password,boardId);
						boolean answer= AdminnDao.updateAdminnToDB(AdminId,st);
						if(answer) {
							System.out.println("Admin is updated successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
						System.out.println(st);
					}
					else {
						//exit
					}
				}
				break;
				
/*-----------------------------------------------------------------------------------*/				
				
				case 5:
				{	//elec_board
					System.out.println("Press 1 to ADD Electricity Board");
					System.out.println("Press 2 to Delete Electricity Board");
					System.out.println("Press 3 to display Electricity Board");
					System.out.println("Press 4 to update Electricity Board");
					System.out.println("Press 5 to exit app");
					
					int c=Integer.parseInt(br.readLine());
					
					if(c==1) {
						//add Electricity Board
						System.out.println("Enter Electricity Board name: ");
						String name=br.readLine();
						
						//create Electricity Board object to store Electricity Board
						ElecBoard st= new ElecBoard(name);
						boolean answer= ElecBoardDao.insertElecBoardToDB(st);
						if(answer) {
							System.out.println("Electricity Board is added successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
						System.out.println(st);
					}
					else if(c==2) {
						//delete Electricity Board
						System.out.println("Enter Electricity Board ID to delete");
						int userId=Integer.parseInt(br.readLine());
						boolean f=ElecBoardDao.deleteElecBoard(userId);
						if(f) {
							System.out.println("Deleted Successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
					}
					else if(c==3) {
						//display Electricity Board
						boolean f= ElecBoardDao.showAllElecBoard();
						if(f) {
							System.out.println("Displayed Successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
					}
					else if(c==4) {
						//update Electricity Board
						System.out.println("Enter Electricity Board ID to update");
						int ElecBoardId=Integer.parseInt(br.readLine());
						
						System.out.println("Enter Electricity Board name: ");
						String name=br.readLine();
						
						ElecBoard st= new ElecBoard(ElecBoardId,name);
						boolean answer= ElecBoardDao.updateElecBoardToDB(ElecBoardId,st);
						if(answer) {
							System.out.println("Electricity Board is updated successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
						System.out.println(st);
					}
					else {
						//exit
					}
				}
				break;
				
/*-----------------------------------------------------------------------------------*/				
				
				case 6:
				{	//invoice
					System.out.println("Press 1 to display invoice");
										
					int c=Integer.parseInt(br.readLine());
					
					if(c==1) {
						//display invoice
						boolean f= InvoiceDao.showAllInvoice();
						if(f) {
							System.out.println("Displayed Successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
					}
					else {
						//exit
					}
				}
				break;
				
/*-----------------------------------------------------------------------------------*/				
				
				case 7:
				{	//Tariff
					System.out.println("Press 1 to ADD Tariff");
					System.out.println("Press 2 to Delete Tariff");
					System.out.println("Press 3 to display Tariff");
					System.out.println("Press 4 to update Tariff");
					System.out.println("Press 5 to exit app");
					
					int c=Integer.parseInt(br.readLine());
					
					if(c==1) {
						//add Tariff
						System.out.println("Enter Tariff Type: ");
						int num=Integer.parseInt(br.readLine());
						
						System.out.println("Enter Tariff Description: ");
						String desc=br.readLine();
						
						System.out.println("Enter Admin ID: ");
						int admin=Integer.parseInt(br.readLine());
						
						//create Tariff object to store Tariff
						Tariff st= new Tariff(num,desc,admin);
						boolean answer= TariffDao.insertTariffToDB(st);
						if(answer) {
							System.out.println("Tariff is added successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
						System.out.println(st);
					}
					else if(c==2) {
						//delete Tariff
						System.out.println("Enter Tariff ID to delete");
						int accId=Integer.parseInt(br.readLine());
						boolean f=TariffDao.deleteTariff(accId);
						if(f) {
							System.out.println("Deleted Successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
					}
					else if(c==3) {
						//display Tariff
						boolean f= TariffDao.showAllTariff();
						if(f) {
							System.out.println("Displayed Successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
					}
					else if(c==4) {
						//update Tariff
						System.out.println("Enter Tariff ID to update");
						int accId=Integer.parseInt(br.readLine());
						
						System.out.println("Enter Tariff Type: ");
						int num=Integer.parseInt(br.readLine());
						
						System.out.println("Enter Tariff Description: ");
						String desc=br.readLine();
						
						System.out.println("Enter Admin ID: ");
						int admin=Integer.parseInt(br.readLine());
						
						Tariff st= new Tariff(accId,num,desc,admin);
						boolean answer= TariffDao.updateTariffToDB(accId,st);
						if(answer) {
							System.out.println("Tariff is updated successfully");
						}
						else {
							System.out.println("Something went wrong. Try Again.");
						}
						System.out.println(st);
					}
					else {
						//exit
					}
				}
				break;
			}
		}
	}

}

