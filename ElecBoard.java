package minipro;


public class ElecBoard {
	private int elec_board_id;
	private String elec_board_name;
	public int getElec_board_id() {
		return elec_board_id;
	}
	public void setElec_board_id(int elec_board_id) {
		this.elec_board_id = elec_board_id;
	}
	public String getElec_board_name() {
		return elec_board_name;
	}
	public void setElec_board_name(String elec_board_name) {
		this.elec_board_name = elec_board_name;
	}
	public ElecBoard(int elec_board_id, String elec_board_name) {
		super();
		this.elec_board_id = elec_board_id;
		this.elec_board_name = elec_board_name;
	}
	public ElecBoard(String elec_board_name) {
		super();
		this.elec_board_name = elec_board_name;
	}
	public ElecBoard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "ElecBoard [elec_board_id=" + elec_board_id + ", elec_board_name=" + elec_board_name + "]";
	}

}
