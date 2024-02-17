package minipro;


public class Billing {
private int bill_num;
private double units_consumed;
private String date_time;
private int account_no;
public int getBill_num() {
	return bill_num;
}
public void setBill_num(int bill_num) {
	this.bill_num = bill_num;
}
public double getUnits_consumed() {
	return units_consumed;
}
public void setUnits_consumed(double units_consumed) {
	this.units_consumed = units_consumed;
}
public String getDate_time() {
	return date_time;
}
public void setDate_time(String date_time) {
	this.date_time = date_time;
}
public String toString() {
	return "Billing [bill_num=" + bill_num + ", units_consumed=" + units_consumed + ", date_time=" + date_time
			+ ", account_no=" + account_no + "]";
}
public int getAccount_no() {
	return account_no;
}
public void setAccount_no(int account_no) {
	this.account_no = account_no;
}
}

