package minipro;


public class Tariff {
	private int tariff_id;
	private double tariff_type;
	private String tariff_desc;
	private int admin_id;
	public int getTariff_id() {
		return tariff_id;
	}
	public void setTariff_id(int tariff_id) {
		this.tariff_id = tariff_id;
	}
	public double getTariff_type() {
		return tariff_type;
	}
	public void setTariff_type(double tariff_type) {
		this.tariff_type = tariff_type;
	}
	public String getTariff_desc() {
		return tariff_desc;
	}
	public void setTariff_desc(String tariff_desc) {
		this.tariff_desc = tariff_desc;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public Tariff(int tariff_id, double tariff_type, String tariff_desc, int admin_id) {
		super();
		this.tariff_id = tariff_id;
		this.tariff_type = tariff_type;
		this.tariff_desc = tariff_desc;
		this.admin_id = admin_id;
	}
	public Tariff(double tariff_type, String tariff_desc, int admin_id) {
		super();
		this.tariff_type = tariff_type;
		this.tariff_desc = tariff_desc;
		this.admin_id = admin_id;
	}
	public Tariff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Tariff [tariff_id=" + tariff_id + ", tariff_type=" + tariff_type + ", tariff_desc=" + tariff_desc
				+ ", admin_id=" + admin_id + "]";
	}
}
