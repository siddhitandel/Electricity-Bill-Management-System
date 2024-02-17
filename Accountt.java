package minipro;


public class Accountt {
	private int account_no;
	private int rr_no;
	private int customerId;
	public Accountt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accountt(int account_no, int rr_no, int customerId) {
		super();
		this.account_no = account_no;
		this.rr_no = rr_no;
		this.customerId = customerId;
	}
	public Accountt(int rr_no, int customerId) {
		super();
		this.rr_no = rr_no;
		this.customerId = customerId;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public int getRr_no() {
		return rr_no;
	}
	public void setRr_no(int rr_no) {
		this.rr_no = rr_no;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String toString() {
		return "Accountt [account_no=" + account_no + ", rr_no=" + rr_no + ", customerId=" + customerId + "]";
	}
}
