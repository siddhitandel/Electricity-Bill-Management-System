package minipro;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private String customerCity;
	public Customer(int customerId, String customerName, String customerAddress, String customerCity) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
	}
	public Customer(String customerName, String customerAddress, String customerCity) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress=" + customerAddress
				+ ", customerCity=" + customerCity + "]";
	}
	
}

