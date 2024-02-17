package minipro;


public class Invoice {
	private int invoice_no;
	private double tax_amt;
	private int bill_num;
	private int elec_board_id;
	private int tariff_id;
	public int getInvoice_no() {
		return invoice_no;
	}
	public void setInvoice_no(int invoice_no) {
		this.invoice_no = invoice_no;
	}
	public double getTax_amt() {
		return tax_amt;
	}
	public void setTax_amt(double tax_amt) {
		this.tax_amt = tax_amt;
	}
	public int getBill_num() {
		return bill_num;
	}
	public void setBill_num(int bill_num) {
		this.bill_num = bill_num;
	}
	public int getElec_board_id() {
		return elec_board_id;
	}
	public void setElec_board_id(int elec_board_id) {
		this.elec_board_id = elec_board_id;
	}
	public int getTariff_id() {
		return tariff_id;
	}
	public void setTariff_id(int tariff_id) {
		this.tariff_id = tariff_id;
	}
	public Invoice(int invoice_no, double tax_amt, int bill_num, int elec_board_id, int tariff_id) {
		super();
		this.invoice_no = invoice_no;
		this.tax_amt = tax_amt;
		this.bill_num = bill_num;
		this.elec_board_id = elec_board_id;
		this.tariff_id = tariff_id;
	}
	public Invoice(double tax_amt, int bill_num, int elec_board_id, int tariff_id) {
		super();
		this.tax_amt = tax_amt;
		this.bill_num = bill_num;
		this.elec_board_id = elec_board_id;
		this.tariff_id = tariff_id;
	}
	public String toString() {
		return "Invoice [invoice_no=" + invoice_no + ", tax_amt=" + tax_amt + ", bill_num=" + bill_num
				+ ", elec_board_id=" + elec_board_id + ", tariff_id=" + tariff_id + "]";
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
}

